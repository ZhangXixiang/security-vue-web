package com.space.common.lp.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.*;
import java.nio.charset.Charset;
import java.security.*;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.*;

/**
 * <b>公私钥读取工具</b><br>
 * <br>
 * 
 * @author 行者
 * @version 4.1.0
 */
@Component
@Slf4j
public final class RsaReadUtil {
	
	//数字签名，密钥算法  
	public static final String KEY_ALGORITHM="NONEwithRSA";  
	//编码
	public static final String ENCODE="UTF-8";  
	
	/** 编码 */
	public final static String KEY_X509 = "X509";
	public final static String KEY_PKCS12 = "PKCS12";
	public final static String CER_ALGORITHM = "MD5WithRSA";

	public final static String RSA_CHIPER = "RSA/ECB/PKCS1Padding";


	/**
	 * 根据Cer文件读取公钥
	 * 
	 * @param pubCerPath
	 * @return
	 */
	public static PublicKey getPublicKeyFromFile(String pubCerPath) {
		FileInputStream pubKeyStream = null;
		try {
			pubKeyStream = new FileInputStream(pubCerPath);
			byte[] reads = new byte[pubKeyStream.available()];
			pubKeyStream.read(reads);
			return getPublicKeyByText(new String(reads));
		} catch (FileNotFoundException e) {
			log.error("公钥文件不存在:",e);
			//throw new Exception();
		} catch (IOException e) {
			log.error("公钥文件读取失败:",e);
			//throw new AMPException(ErrorEnum.E1003.getMsg());
		} finally {
			if (pubKeyStream != null) {
				try {
					pubKeyStream.close();
				} catch (Exception e) {
					log.error("pubKeyStream close失败:",e);
				}
			}
		}
		return null;
	}

	/**
	 * 根据公钥Cer文本串读取公钥
	 * 
	 * @param pubKeyText
	 * @return
	 */
	public static PublicKey getPublicKeyByText(String pubKeyText) {
		try {
			CertificateFactory certificateFactory = CertificateFactory.getInstance(KEY_X509);
			BufferedReader br = new BufferedReader(new StringReader(pubKeyText));
			String line = null;
			StringBuilder keyBuffer = new StringBuilder();
			while ((line = br.readLine()) != null) {
				if (!line.startsWith("-")) {
					keyBuffer.append(line);
				}
			}
			Base64 base64 = new Base64();
			Certificate certificate = certificateFactory
					.generateCertificate(new ByteArrayInputStream(base64.decode(keyBuffer.toString())));
			return certificate.getPublicKey();
		} catch (Exception e) {
			log.error("解析公钥内容失败:",e);
			return null;
			//throw new AMPException(ErrorEnum.E1003.getMsg());
		}
	}

	/**
	 * 根据私钥路径读取私钥
	 * 
	 * @param pfxPath
	 * @param priKeyPass
	 * @return
	 */
	public static PrivateKey getPrivateKeyFromFile(String pfxPath, String priKeyPass) {
		InputStream priKeyStream = null;
		try {
			priKeyStream = new FileInputStream(pfxPath);
			byte[] reads = new byte[priKeyStream.available()];
			priKeyStream.read(reads);
			return getPrivateKeyByStream(reads, priKeyPass);
		} catch (Exception e) {
			log.error("解析文件，读取私钥失败:",e);
			//throw new AMPException(ErrorEnum.E1003.getMsg());
		} finally {
			if (priKeyStream != null) {
				try {
					priKeyStream.close();
				} catch (Exception e) {
					//return null;
					log.error("priKeyStream close 失败：",e);
				}
			}
		}
		return null;
	}

	/**
	 * 根据PFX私钥字节流读取私钥
	 * 
	 * @param pfxBytes
	 * @param priKeyPass
	 * @return
	 */
	public static PrivateKey getPrivateKeyByStream(byte[] pfxBytes, String priKeyPass) {
		try {
			KeyStore ks = KeyStore.getInstance(KEY_PKCS12);
			char[] charPriKeyPass = priKeyPass.toCharArray();
			ks.load(new ByteArrayInputStream(pfxBytes), charPriKeyPass);
			Enumeration<String> aliasEnum = ks.aliases();
			String keyAlias = null;
			if (aliasEnum.hasMoreElements()) {
				keyAlias = (String) aliasEnum.nextElement();
			}
			return (PrivateKey) ks.getKey(keyAlias, charPriKeyPass);
		} catch (IOException e) {
			// 加密失败
			log.error("解析文件，读取私钥失败:",e);
			//throw new AMPException(ErrorEnum.E1003.getMsg());
		} catch (KeyStoreException e) {
			log.error("私钥存储异常:",e);
			//throw new AMPException(ErrorEnum.E1003.getMsg());
		} catch (NoSuchAlgorithmException e) {
			log.error("不存在的解密算法:",e);
			//throw new AMPException(ErrorEnum.E1003.getMsg());
		} catch (CertificateException e) {
			log.error("证书异常:",e);
			//throw new AMPException(ErrorEnum.E1003.getMsg());
		} catch (UnrecoverableKeyException e) {
			log.error("不可恢复的秘钥异常",e);
			//throw new AMPException(ErrorEnum.E1003.getMsg());
		}
		return null;
	}
	
	
	/** 
     * 移除map中的value空值 
     * @param map 
     * @return 
     */  
    public static void removeNullValue(Map map){  
        Set set = map.keySet();  
        for (Iterator iterator = set.iterator(); iterator.hasNext();) {  
            Object obj = (Object) iterator.next();  
            Object value =(Object)map.get(obj);  
            remove(value, iterator);  
        }  
    }  
      
    /** 
     * @param obj 
     * @param iterator 
     */  
    private static void remove(Object obj,Iterator iterator){  
        if(obj instanceof String){  
            String str = (String)obj;  
            if(StringUtils.isBlank(str)){
                iterator.remove();  
            }  
        }else if(obj instanceof Collection){  
            Collection col = (Collection)obj;  
            if(col==null||col.isEmpty()){  
                iterator.remove();  
            }  
              
        }else if(obj instanceof Map){  
            Map temp = (Map)obj;  
            if(temp==null||temp.isEmpty()){  
                iterator.remove();  
            }  
              
        }else if(obj instanceof Object[]){  
            Object[] array =(Object[])obj;  
            if(array==null||array.length<=0){  
                iterator.remove();  
            }  
        }else{  
            if(obj==null){  
                iterator.remove();  
            }  
        }  
    } 
	
	/**
	 * 私钥加密
	 * @param privateKey 私钥字符串
	 * @param str 加密原串
	 * @return 
	 * @throws Exception
	 */
	public static String encrypt(PrivateKey privateKey, String str){
		if (privateKey == null) {
			System.out.println("加密私钥为空, 请设置");
		}
		Cipher cipher = null;
		try {
			// 使用默认RSA
			cipher = Cipher.getInstance("RSA");
			cipher.init(Cipher.ENCRYPT_MODE, privateKey);
			byte[] output = cipher.doFinal(str.getBytes("UTF-8"));
			// byte数组base64编码后存在非法字符，所以需要再base64编码一次
			return Base64Util.base64Encode(Base64Util.base64Encode(output));
		} catch (NoSuchAlgorithmException e) {
			System.out.println("无此加密算法");
		} catch (NoSuchPaddingException e) {
			System.out.println("使用默认RSA异常,请检查");
		} catch (InvalidKeyException e) {
			System.out.println("加密私钥非法,请检查");
		} catch (IllegalBlockSizeException e) {
			System.out.println("明文长度非法");
		} catch (BadPaddingException e) {
			System.out.println("明文数据已损坏");
		} catch (UnsupportedEncodingException e) {
			System.out.println("不支持的编码");
		}
		return null;
	}
	
	/**
	 * 公钥解密
	 * @param publicKey 公钥字符串
	 * @param encryptStr 密文
	 * @return
	 * @throws Exception
	 */
	public static String decrypt(PublicKey publicKey, String encryptStr)  {
		// 因为密文为base64编码后数据，所以需要先base64解码
		encryptStr = Base64Util.base64Decode(encryptStr);
		if (publicKey == null) {
			System.out.println("解密公钥为空, 请设置");
		}
		Cipher cipher = null;
		try {
			// 使用默认RSA
			cipher = Cipher.getInstance("RSA");
			cipher.init(Cipher.DECRYPT_MODE, publicKey);
			byte[] output = cipher.doFinal(Base64Util.base64DecodeToArray(encryptStr));
			return new String(output,Charset.forName("UTF-8"));
		} catch (NoSuchAlgorithmException e) {
			System.out.println("无此解密算法");
		} catch (NoSuchPaddingException e) {
			System.out.println("使用默认RSA异常,请检查");
		} catch (InvalidKeyException e) {
			System.out.println("解密公钥非法,请检查");
		} catch (IllegalBlockSizeException e) {
			System.out.println("密文长度非法");
		} catch (BadPaddingException e) {
			System.out.println("密文数据已损坏");
		}
		return null;
	}
}
