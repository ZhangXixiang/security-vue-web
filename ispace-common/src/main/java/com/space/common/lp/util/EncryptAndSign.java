package com.space.common.lp.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EncryptAndSign {

	/**
	 * 数据加密，算法（RSA）
	 * @param data 待加密数据
	 * @param publicKey 公钥
	 * @return 加密结果
	 */
	public static String encryptBasedRSA(String data, String publicKey) {
		publicKey = publicKey!=null?publicKey.replaceAll("\n", "\r"):null;
		System.out.println("publicKey: "+publicKey);
		System.out.println("data: "+data);
		String afterEncrypt = "";
		try {
			byte[] pwdEncrypt = RSAUtils.encryptByPublicKey(data.getBytes(),
					publicKey);
			afterEncrypt = Base64Utils.encode(pwdEncrypt);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return afterEncrypt;
	}
	
	
    /**
     * 数据解密，算法（RSA）
     * @param privateKey 加密所需的key
     * @param cryptData
     *            加密数据
     * @return 解密后的数据
     */
    public static String decryptBasedRSA(String cryptData, String privateKey) {
        String decryptedData = null;
        try {
        	byte[] pwd = Base64Utils.decode(cryptData);
        	byte[] userPswByte = RSAUtils.decryptByPrivateKey(pwd, privateKey);
        	decryptedData = new String(userPswByte, "utf-8");
        } catch (Exception e) {
            throw new RuntimeException("解密错误，错误信息：", e);
        }
        return decryptedData;
    }
    
    /**
     * 用私钥生成签名
     * @param parmDataMap 参数对象
     * @param privateKey 私钥
     * @return 生成的sign签名串
     */
    public static String genSign(Map<String, Object> parmDataMap, String privateKey) {
    	String sign = "";
    	try {
			String sortPramData = sortMap(parmDataMap);
			if (StringUtils.startsWith(sortPramData, "&"))
				sortPramData = sortPramData.substring(1);
			System.out.println("生成签名排序后的参数："+sortPramData);
			sign = RSAUtils.sign(sortPramData.getBytes(), privateKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return sign;
    }
    
    /**
     * 用公钥验证签名
     * @param arg 请求参数
     * @param publicKey 公钥
     * @param sign 签名串
     * @return boolean类型验证结果
     */
    public static boolean verifySign(Object arg, String publicKey, String sign) {
    	boolean result = false;
    	
    	try {
			if (null != arg) {
				JSONObject jsonObject = (JSONObject) JSON.toJSON(arg);
		        Set<Entry<String,Object>> entrySet = jsonObject.entrySet();
		        Map<String, Object> map=new HashMap<String,Object>();
		        for (Entry<String, Object> entry : entrySet) {
		            map.put(entry.getKey(), entry.getValue());
		        }
				String sortPramData2 = sortMap(map);
				if (StringUtils.startsWith(sortPramData2, "&")){
					sortPramData2 = sortPramData2.substring(1);
				}
				System.out.println("验证签名排序后的参数："+sortPramData2);
				result = RSAUtils.verify(sortPramData2.getBytes(), publicKey, sign);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return result;
    }
    
    /**
	 * @Method: sort
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param map
	 * @param @return
	 * @return StringBuilder
	 * @throws
	 */
	public static String sortSource(Map<String, Object> map) {

		if (null == map) {
			return "";
		}
		String sorted = sortMap (map);

		if (null != sorted && !"".equals (sorted) && '&' == sorted.charAt (0)) {
			sorted = sorted.substring (1, sorted.length ());
		}
		return sorted;
	}

	@SuppressWarnings("unchecked")
    private static String sortMap(Map<String, Object> map) {
		StringBuilder msg = new StringBuilder ();
		if (map.containsKey ("sign")) {
			map.remove ("sign");
		}
		TreeMap<String, Object> treeMap = new TreeMap<String, Object> (new CustomTreeMapComparator<String> ());
		treeMap.putAll (map);
		Object[] keys = treeMap.keySet ().toArray ();
		if (null != keys && keys.length > 0) {
			for (int i = 0; i < keys.length; i++) {
				if (null != treeMap.get (keys[i])) {
					Object value = treeMap.get (keys[i]);
					if (value instanceof JSONArray) {
						JSONArray jsonArray = (JSONArray) value;
						for (Object jsonObj : jsonArray) {
							msg.append (sortMap ((Map<String, Object>) jsonObj));
						}
					} else
						if (value instanceof String && null != value.toString () && !"".equals (value.toString ())) {
							msg.append ("&").append (keys[i]).append ("=").append (value.toString ());
						} else if (value instanceof Long || value instanceof Double || value instanceof Float) {
							msg.append ("&").append (keys[i]).append ("=").append (value);
						}
				}
			}
		}
		return msg.toString ();
	}
	

    public static void main(String[] args) {
    	String enPublicKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBANgzjpGMQ3IEGMqP\no9PaD++oBszG/lgY1dGAOebLeINcge2MX1TjRqzCPnjzYtDR/o5GdSd+K/Wf3VB7\nUer/F8Gw7rTMJC+hNabTzOHXygOG1tgMyJ7GTwAhPJyM+WwchXmZNXfvmnYRxu/t\nZY5ov+hTXR1IxNfz9ycGy8f2Ob1fAgMBAAECgYAgZGEY53X3cCuytaCrDgHTO06B\ngdL7qgTnFZoXPSb6L3L7/0sNMdwV6ChqALUuajgEYwQMfbfiXihPdZqJZdzODr4w\n3NVCIUuW5CqCC2OO+FHoLBGTGEKRhuDtVoYVoPrXXDXZbCGklHSP5rArlXhZRPk2\nJcJZOeqcbqrtRd33IQJBAPYCn7l0JUFUc0lSmw0c6PuY9RFNXh8RXDRffEYzszzR\nZ4IWWm4Bq1/5LeYe09ebvSdvNBUDI2HO3qKiFOLvai8CQQDg+w7Qq6KlZQrFVmwT\nxB2mTr4KApZod+qli5f19up1/uNePX+kMUs5+TyPUU6PeXTlAFCGoFVtenp31nrD\n8oPRAkAVYK7+j6A5KByIj5wXrJ52VpldMoruSjTn/DAxbYayz0OeY1DiZFS/F0ks\nyRsBjnAGgDxXYxltA2wHV+xWuBVTAkEAm1PaK6mENoqnQA1lutPY4JxWylR1AZVh\nNIBHHzMlNugOlF8DRBogZNs1u4EYKyhg00Y/UmNZ96bq7NfwlF5YMQJAGUrDRrq3\nhxN+UZlIl2VdU7eCJM7h8wMYcyX64p/701s+yfziMBco68rnSZkqy+UaQsNyOT0w\nMVEP/Kvg1Kn9hg==";
		String pwd = "test123";
		String afterEncrypt = encryptBasedRSA(pwd, enPublicKey);
		System.out.println("加密密文：" + afterEncrypt);
	}
}
