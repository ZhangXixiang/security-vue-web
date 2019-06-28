package com.space.common.lp.util;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.*;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;


/** */

/**
* <p> 
* RSA公钥/私钥/签名工具包 
* </p> 
* <p> 
* 罗纳德·李维斯特（Ron [R]ivest）、阿迪·萨莫尔（Adi [S]hamir）和伦纳德·阿德曼（Leonard [A]dleman） 
* </p> 
* <p> 
* 字符串格式的密钥在未在特殊说明情况下都为BASE64编码格式<br/> 
* 由于非对称加密速度极其缓慢，一般文件不使用它来加密而是使用对称加密，<br/> 
* 非对称加密算法可以用来对对称加密的密钥加密，这样保证密钥的安全也就保证了数据的安全 
* </p> 
*  
* @author IceWee 
* @date 2012-4-26 
* @version 1.0 
*/
public class RSAUtils {

	/** */
	/** 
	* 加密算法RSA 
	*/
	public static final String KEY_ALGORITHM = "RSA";

	/** */
	/** 
	* 签名算法 
	*/
	public static final String SIGNATURE_ALGORITHM = "SHA1withRSA";

	/** */
	/** 
	* 获取公钥的key 
	*/
	private static final String PUBLIC_KEY = "RSAPublicKey";

	/** */
	/** 
	* 获取私钥的key 
	*/
	private static final String PRIVATE_KEY = "RSAPrivateKey";

	/** */
	/** 
	* RSA最大加密明文大小 
	*/
	private static final int MAX_ENCRYPT_BLOCK = 117;

	/** */
	/** 
	* RSA最大解密密文大小 
	*/
	private static final int MAX_DECRYPT_BLOCK = 128;

	/** */
	/** 
	* <p> 
	* 生成密钥对(公钥和私钥) 
	* </p> 
	*  
	* @return 
	* @throws Exception 
	*/
	public static Map<String, Object> genKeyPair() throws Exception {
		KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance (KEY_ALGORITHM);
		keyPairGen.initialize (1024);
		KeyPair keyPair = keyPairGen.generateKeyPair ();
		RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic ();
		RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate ();
		Map<String, Object> keyMap = new HashMap<String, Object> (2);
		keyMap.put (PUBLIC_KEY, publicKey);
		keyMap.put (PRIVATE_KEY, privateKey);
		return keyMap;
	}

	/** */
	/** 
	* <p> 
	* 用私钥对信息生成数字签名 
	* </p> 
	*  
	* @param data 已加密数据 
	* @param privateKey 私钥(BASE64编码) 
	*  
	* @return 
	* @throws Exception 
	*/
	public static String sign(byte[] data, String privateKey) throws Exception {
		byte[] keyBytes = Base64Utils.decode (privateKey);
		PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec (keyBytes);
		KeyFactory keyFactory = KeyFactory.getInstance (KEY_ALGORITHM);
		PrivateKey privateK = keyFactory.generatePrivate (pkcs8KeySpec);
		Signature signature = Signature.getInstance (SIGNATURE_ALGORITHM);
		signature.initSign (privateK);
		signature.update (data);
		return Base64Utils.encode (signature.sign ());
	}
	
	/** */
	/** 
	* <p> 
	* 用私钥对信息生成数字签名 天金所专用
	* </p> 
	*  
	* @param data 已加密数据 
	* @param privateKey 私钥(BASE64编码) 
	*  
	* @return 
	* @throws Exception 
	*/
	public static String signTJS(byte[] data, PrivateKey privateKey) throws Exception {
		Signature signature = Signature.getInstance (SIGNATURE_ALGORITHM);
		signature.initSign (privateKey);
		signature.update (data);
		return Base64Utils.encode (signature.sign ());
	}

	/** */
	/** 
	* <p> 
	* 用私钥对信息生成数字签名 
	* </p> 
	*  
	* @param data 待加密数据 
	* @param keyFile keystore文件路径
	* @param passWord 私钥保护密码
	*  
	* @return 
	* @throws Exception 
	*/
	public static String sign(byte[] data, String keyFile, String passWord, String alisPassWord) throws Exception {
		PrivateKey privateK = getPrivateKey (keyFile, passWord, alisPassWord);
		Signature signature = Signature.getInstance (SIGNATURE_ALGORITHM);
		signature.initSign (privateK);
		signature.update (data);
		return Base64Utils.encode (signature.sign ());
	}

	/** */
	/** 
	* <p> 
	* 校验数字签名 
	* </p> 
	*  
	* @param data 已加密数据 
	* @param publicKey 公钥(BASE64编码) 
	* @param sign 数字签名 
	*  
	* @return 
	* @throws Exception 
	*  
	*/
	public static boolean verify(byte[] data, String publicKey, String sign) throws Exception {
		byte[] keyBytes = Base64Utils.decode (publicKey);
		X509EncodedKeySpec keySpec = new X509EncodedKeySpec (keyBytes);
		KeyFactory keyFactory = KeyFactory.getInstance (KEY_ALGORITHM);
		PublicKey publicK = keyFactory.generatePublic (keySpec);
		Signature signature = Signature.getInstance (SIGNATURE_ALGORITHM);
		signature.initVerify (publicK);
		signature.update (data);
		return signature.verify (Base64Utils.decode (sign));
	}

	/** */
	/** 
	* <p> 
	* 校验数字签名 
	* </p> 
	*  
	* @param data 已加密数据 
	* @param certFile 公钥(BASE64编码)
	* @param sign 数字签名 
	*  
	* @return 
	* @throws Exception 
	*  
	*/
	public static boolean verifyByCert(byte[] data, String certFile, String sign) throws Exception {
		PublicKey publicK = getPublicKey (certFile);
		Signature signature = Signature.getInstance (SIGNATURE_ALGORITHM);
		signature.initVerify (publicK);
		signature.update (data);
		return signature.verify (Base64Utils.decode (sign));
	}

	/** */
	/** 
	* <P> 
	* 私钥解密 
	* </p> 
	*  
	* @param encryptedData 已加密数据 
	* @param privateKey 私钥(BASE64编码) 
	* @return 
	* @throws Exception 
	*/
	public static byte[] decryptByPrivateKey(byte[] encryptedData, String privateKey) throws Exception {
		byte[] keyBytes = Base64Utils.decode (privateKey);
		PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec (keyBytes);
		KeyFactory keyFactory = KeyFactory.getInstance (KEY_ALGORITHM);
		Key privateK = keyFactory.generatePrivate (pkcs8KeySpec);
		Cipher cipher = Cipher.getInstance (keyFactory.getAlgorithm ());
		cipher.init (Cipher.DECRYPT_MODE, privateK);
		return decrypt (encryptedData, cipher);
	}

	/** */
	/** 
	* <P> 
	* 私钥解密 
	* </p> 
	*  
	* @param encryptedData 已加密数据 
	* @param keyFile keystore路径
	* @param passWord 私钥保护密码
	* @return 
	* @throws Exception 
	*/
	public static byte[] decryptByPrivateKey(byte[] encryptedData, String keyFile, String passWord) throws Exception {
		KeyFactory keyFactory = KeyFactory.getInstance (KEY_ALGORITHM);
		Key privateK = getPrivateKey (keyFile, passWord, null);
		Cipher cipher = Cipher.getInstance (keyFactory.getAlgorithm ());
		cipher.init (Cipher.DECRYPT_MODE, privateK);
		return decrypt (encryptedData, cipher);
	}

	/** */
	/** 
	* <p> 
	* 公钥解密 
	* </p> 
	*  
	* @param encryptedData 已加密数据 
	* @param publicKey 公钥(BASE64编码) 
	* @return 
	* @throws Exception 
	*/
	public static byte[] decryptByPublicKey(byte[] encryptedData, String publicKey) throws Exception {
		byte[] keyBytes = Base64Utils.decode (publicKey);
		X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec (keyBytes);
		KeyFactory keyFactory = KeyFactory.getInstance (KEY_ALGORITHM);
		Key publicK = keyFactory.generatePublic (x509KeySpec);
		Cipher cipher = Cipher.getInstance (keyFactory.getAlgorithm ());
		cipher.init (Cipher.DECRYPT_MODE, publicK);
		return decrypt (encryptedData, cipher);
	}

	/** */
	/** 
	* <p> 
	* 公钥解密 
	* </p> 
	*  
	* @param encryptedData 已加密数据 
	* @param certFile 公钥证书路径
	* @return 
	* @throws Exception 
	*/
	public static byte[] decryptByPublicCert(byte[] encryptedData, String certFile) throws Exception {
		KeyFactory keyFactory = KeyFactory.getInstance (KEY_ALGORITHM);
		Key publicK = getPublicKey (certFile);
		Cipher cipher = Cipher.getInstance (keyFactory.getAlgorithm ());
		cipher.init (Cipher.DECRYPT_MODE, publicK);
		return decrypt (encryptedData, cipher);
	}

	/**
	 * method comments here
	 * @param encryptedData
	 * @param cipher
	 * @return
	 * @throws IllegalBlockSizeException
	 * @throws BadPaddingException
	 * @throws IOException
	 */
	private static byte[] decrypt(byte[] encryptedData, Cipher cipher) throws IllegalBlockSizeException, BadPaddingException, IOException {
		int inputLen = encryptedData.length;
		ByteArrayOutputStream out = new ByteArrayOutputStream ();
		int offSet = 0;
		byte[] cache;
		int i = 0;
		// 对数据分段解密
		while (inputLen - offSet > 0) {
			if (inputLen - offSet > MAX_DECRYPT_BLOCK) {
				cache = cipher.doFinal (encryptedData, offSet, MAX_DECRYPT_BLOCK);
			} else {
				cache = cipher.doFinal (encryptedData, offSet, inputLen - offSet);
			}
			out.write (cache, 0, cache.length);
			i++;
			offSet = i * MAX_DECRYPT_BLOCK;
		}
		byte[] decryptedData = out.toByteArray ();
		out.close ();
		return decryptedData;
	}

	/** */
	/** 
	* <p> 
	* 公钥加密 
	* </p> 
	*  
	* @param data 源数据 
	* @param publicKey 公钥(BASE64编码) 
	* @return 
	* @throws Exception 
	*/
	public static byte[] encryptByPublicKey(byte[] data, String publicKey) throws Exception {
		byte[] keyBytes = Base64Utils.decode (publicKey);
		X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec (keyBytes);
		KeyFactory keyFactory = KeyFactory.getInstance (KEY_ALGORITHM);
		Key publicK = keyFactory.generatePublic (x509KeySpec);
		// 对数据加密
		Cipher cipher = Cipher.getInstance (keyFactory.getAlgorithm ());
		cipher.init (Cipher.ENCRYPT_MODE, publicK);
		return encrypt (data, cipher);
	}

	/** */
	/** 
	* <p> 
	* 公钥加密 
	* </p> 
	*  
	* @param data 源数据 
	* @param certFile 公钥(BASE64编码)
	* @return 
	* @throws Exception 
	*/
	public static byte[] encryptByPublicCert(byte[] data, String certFile) throws Exception {
		KeyFactory keyFactory = KeyFactory.getInstance (KEY_ALGORITHM);
		Key publicK = getPublicKey (certFile);
		// 对数据加密
		Cipher cipher = Cipher.getInstance (keyFactory.getAlgorithm ());
		cipher.init (Cipher.ENCRYPT_MODE, publicK);
		return encrypt (data, cipher);
	}

	/** */
	/** 
	* <p> 
	* 私钥加密 
	* </p> 
	*  
	* @param data 源数据 
	* @param privateKey 私钥(BASE64编码) 
	* @return 
	* @throws Exception 
	*/
	public static byte[] encryptByPrivateKey(byte[] data, String privateKey) throws Exception {
		byte[] keyBytes = Base64Utils.decode (privateKey);
		PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec (keyBytes);
		KeyFactory keyFactory = KeyFactory.getInstance (KEY_ALGORITHM);
		Key privateK = keyFactory.generatePrivate (pkcs8KeySpec);
		Cipher cipher = Cipher.getInstance (keyFactory.getAlgorithm ());
		cipher.init (Cipher.ENCRYPT_MODE, privateK);
		return encrypt (data, cipher);
	}

	/** */
	/** 
	* <p> 
	* 私钥加密 
	* </p> 
	*  
	* @param data 
	* 							源数据 
	* @param keyFile
	* 							 私钥keystore路径 
	* @param passWord
	*            私钥保护密码
	* @return 
	* @throws Exception 
	*/
	public static byte[] encryptByPrivateKey(final byte[] data, final String keyFile, final String passWord) throws Exception {
		Key privateK = getPrivateKey (keyFile, passWord, null);
		KeyFactory keyFactory = KeyFactory.getInstance (KEY_ALGORITHM);
		Cipher cipher = Cipher.getInstance (keyFactory.getAlgorithm ());
		cipher.init (Cipher.ENCRYPT_MODE, privateK);
		return encrypt (data, cipher);
	}

	/**
	 * method comments here
	 * @param data
	 * @param cipher
	 * @return
	 * @throws IllegalBlockSizeException
	 * @throws BadPaddingException
	 * @throws IOException
	 */
	private static byte[] encrypt(final byte[] data, Cipher cipher) throws IllegalBlockSizeException, BadPaddingException, IOException {
		int inputLen = data.length;
		ByteArrayOutputStream out = new ByteArrayOutputStream ();
		int offSet = 0;
		byte[] cache;
		int i = 0;
		// 对数据分段加密
		while (inputLen - offSet > 0) {
			if (inputLen - offSet > MAX_ENCRYPT_BLOCK) {
				cache = cipher.doFinal (data, offSet, MAX_ENCRYPT_BLOCK);
			} else {
				cache = cipher.doFinal (data, offSet, inputLen - offSet);
			}
			out.write (cache, 0, cache.length);
			i++;
			offSet = i * MAX_ENCRYPT_BLOCK;
		}
		byte[] encryptedData = out.toByteArray ();
		out.close ();
		return encryptedData;
	}

	/**
	 * 取得私钥对象
	 * 
	 * @param keyFile
	 *            私钥keystore文件路径
	 * @param passWord
	 *            私钥保护密码
	 * @return 私钥对象
	 */
	public static RSAPrivateCrtKey getPrivateKey(final String keyFile, final String passWord, final String alisPassWord) throws Exception {
		String keyAlias = null;
		RSAPrivateCrtKey prikey = null;
		FileInputStream fiKeyFile = null;
		KeyStore ks = KeyStore.getInstance ("PKCS12");
		fiKeyFile = new FileInputStream (keyFile);
		try {
			ks.load (fiKeyFile, passWord.toCharArray ());
		}
		catch (Exception ex) {
			if (fiKeyFile != null) fiKeyFile.close ();
			throw ex;
		}
		Enumeration<String> myEnum = ks.aliases ();

		// keyAlias = (String) myEnum.nextElement();
		/* IBM JDK必须使用While循环取最后一个别名，才能得到个人私钥别名 */
		while (myEnum.hasMoreElements ()) {
			keyAlias = (String) myEnum.nextElement ();
			// System.out.println("keyAlias==" + keyAlias);
			if (ks.isKeyEntry (keyAlias)) {
				if (null == alisPassWord) {
					prikey = (RSAPrivateCrtKey) ks.getKey (keyAlias, passWord.toCharArray ());
				} else {
					prikey = (RSAPrivateCrtKey) ks.getKey (keyAlias, alisPassWord.toCharArray ());
				}

				break;
			}
		}
		if (prikey == null) {
			throw new Exception ("没有找到匹配私钥");
		} else {
			return prikey;
		}
	}

	/**
	 * 取得公钥对象
	 * 
	 * @param certFile
	 *            公钥证书文件路径
	 * @return 公钥对象
	 */
	public static RSAPublicKey getPublicKey(String certFile) throws Exception {
		FileInputStream certfile = null;
		certfile = new FileInputStream (certFile);
		CertificateFactory cf = CertificateFactory.getInstance ("X.509", new BouncyCastleProvider ());

		X509Certificate x509cert = null;
		try {
			x509cert = (X509Certificate) cf.generateCertificate (certfile);
		}
		catch (Exception ex) {
			if (certfile != null) certfile.close ();
			throw ex;
		}

		RSAPublicKey pubkey = (RSAPublicKey) x509cert.getPublicKey ();
		return pubkey;
	}

}