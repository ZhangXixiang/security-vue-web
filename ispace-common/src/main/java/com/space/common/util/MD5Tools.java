package com.space.common.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Hex;
import com.google.common.base.Charsets;
import com.google.common.hash.Hasher;
import com.google.common.hash.Hashing;

public abstract  class MD5Tools {

	public final static String encodeMD5Hex(String s){
		Hasher hasher = Hashing.md5().newHasher();
		hasher.putString(s, Charsets.UTF_8);
		byte[] md5 = hasher.hash().asBytes();
		return Hex.encodeHexString(md5).toUpperCase();
	}
	
	public final static String MD5(String pwd) {  
        //用于加密的字符  
        char md5String[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',  
                'A', 'B', 'C', 'D', 'E', 'F' };  
        try {  
            //使用平台的默认字符集将此 String 编码为 byte序列，并将结果存储到一个新的 byte数组中  
            byte[] btInput = pwd.getBytes();  
               
            //信息摘要是安全的单向哈希函数，它接收任意大小的数据，并输出固定长度的哈希值。  
            MessageDigest mdInst = MessageDigest.getInstance("MD5");  
               
            //MessageDigest对象通过使用 update方法处理数据， 使用指定的byte数组更新摘要  
            mdInst.update(btInput);  
               
            // 摘要更新之后，通过调用digest（）执行哈希计算，获得密文  
            byte[] md = mdInst.digest();  
               
            // 把密文转换成十六进制的字符串形式  
            int j = md.length;  
            char str[] = new char[j * 2];  
            int k = 0;  
            for (int i = 0; i < j; i++) {   //  i = 0  
                byte byte0 = md[i];  //95  
                str[k++] = md5String[byte0 >>> 4 & 0xf];    //    5   
                str[k++] = md5String[byte0 & 0xf];   //   F  
            }  
            //返回经过加密后的字符串  
            return new String(str);  
        } catch (Exception e) {  
            return null;  
        }  
    }  
	
	/**
	 * @Des 得到相应的一个MD5加密后的字符串
	 * @param psd
	 * @param salt
	 * @return    MD5加密后的字符串
	 */
	public static String encoder(String psd, String salt) {
	    try {
	        StringBuffer stingBuffer = new StringBuffer();
	        // 1.指定加密算法
	        MessageDigest digest = MessageDigest.getInstance("MD5");
	        // 2.将需要加密的字符串转化成byte类型的数据，然后进行哈希过程
	        byte[] bs = digest.digest((psd + salt).getBytes());
	        // 3.遍历bs,让其生成32位字符串，固定写法

	        // 4.拼接字符串
	        for (byte b : bs) {
	            int i = b & 0xff;
	            String hexString = Integer.toHexString(i);
	            if (hexString.length() < 2) {
	                hexString = "0" + hexString;
	            }
	            stingBuffer.append(hexString);
	        }
	        return stingBuffer.toString();
	    } catch (NoSuchAlgorithmException e) {
	        e.printStackTrace();
	    }
	    return null;
	}
	
	public static void main(String[] args) {
		System.out.println(MD5Tools.MD5("weChat"));
	}
	
}
