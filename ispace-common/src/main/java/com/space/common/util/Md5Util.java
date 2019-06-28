package com.space.common.util;

import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

/**
 * md5加密工具类
 * 
 * @version 1.0
 * @author shower
 * @since 2015年5月5日 下午6:23:17
 * @update 2015年5月5日 下午6:23:17
 */
public class Md5Util {

	public static final char[] B64 = getBase64();

	/**
	 * md5加密后base64编码
	 * 
	 * @param str
	 * @return
	 * @version 1.0
	 * @author shower
	 * @update 2015年5月5日 下午6:20:40
	 */
	public static final String md5(final String str) {
		byte[] bytes = new byte[128];
		BASE64Encoder encoder = new BASE64Encoder();
		try {
			bytes = MessageDigest.getInstance("md5").digest(str.getBytes("UTF-8"));
			return encoder.encode(bytes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * md5加密
	 * 
	 * @param str
	 * @return
	 * @version 1.0
	 * @author shower
	 * @update 2015年5月5日 下午6:21:13
	 */
	public static final byte[] md5_4_byte(final String str) {
		byte[] bytes = new byte[128];
		try {
			bytes = MessageDigest.getInstance("md5").digest(str.getBytes("UTF-8"));
			return bytes;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 自定义md5加密
	 * 
	 * @param str
	 * @return
	 * @version 1.0
	 * @author shower
	 * @update 2015年5月5日 下午6:21:37
	 */
	public static final String cloudsunMd5(final String str) {
		byte[] bytes = new byte[128];
		try {
			bytes = MessageDigest.getInstance("md5").digest(str.getBytes("UTF-8"));
			return base64(bytes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * 得到base64字符数组
	 * 
	 * @return
	 * @version 1.0
	 * @author shower
	 * @update 2015年5月5日 下午6:22:29
	 */
	private static final char[] getBase64() {
		char[] result = new char[64];
		for (int i = 0; i < 26; i++) {
			result[i] = (char) ('A' + i);
		}

		for (int i = 0; i < 26; i++) {
			result[26 + i] = (char) ('a' + i);
		}

		for (int i = 0; i < 10; i++) {
			result[52 + i] = (char) ('0' + i);
		}

		result[62] = '+';
		result[63] = '/';
		return result;
	}

	/**
	 * 将BASE16的md5密码转化成BASE64的md5密码 应用场景： php默认md5转为java base64的md5密码
	 * 
	 * @param b16
	 * @return
	 */
	public static final String b16ToB64(String b16) {
		if (b16 == null || b16.length() != 32) {
			return null;
		}

		byte[] code = new byte[16];
		for (int i = 0; i < 16; i++) {
			char c1 = b16.charAt(2 * i);
			char c2 = b16.charAt(2 * i + 1);
			code[i] = (byte) Integer.parseInt(c1 + "" + c2, 16);
		}

		BASE64Encoder encoder = new BASE64Encoder();
		return encoder.encode(code);
	}

	/**
	 * BASE64的md5密码转化成BASE16的md5密码 应用场景： java base64的md5密码 转为 php 默认的md5加密方式
	 * 
	 * @param b64
	 * @return
	 */
	public static final String b64ToB16(String b64) {
		if (b64 == null) {
			return null;
		}
		BASE64Kit base64 = new BASE64Kit();
		byte[] code = base64.decode(b64);

		String result = "";
		int i;
		StringBuffer buf = new StringBuffer("");
		for (int offset = 0; offset < code.length; offset++) {
			i = code[offset];
			if (i < 0)
				i += 256;
			if (i < 16)
				buf.append("0");
			buf.append(Integer.toHexString(i));
		}
		result = buf.toString();
		return result;
	}

	/**
	 * cloudsun 自己的BASE64，缺点：1 不会隔76次换行一次
	 * 
	 * @param bytes
	 * @return
	 */
	public static final String base64(byte[] bytes) {
		if (bytes == null) {
			return null;
		}
		// 对于16个字节，共16×8=128位
		// base64是每六位编码为一个字符，那么就有128/6=21余2
		// 那么就是22位 ，最后补上两个=号就是 24位
		// 其实应该换成128个布尔值
		boolean[] bits = new boolean[bytes.length * 8];
		for (int i = 0; i < bytes.length; i++) {
			for (int j = 0; j < 8; j++) {
				bits[8 * i + j] = ((0x80 >>> j) & bytes[i]) > 0;
			}
		}

		byte[] base64 = new byte[bits.length % 6 == 0 ? bits.length / 6 : bits.length / 6 + 1];
		for (int i = 0; i < bits.length; i++) {
			base64[i / 6] |= bits[i] ? 1 << (5 - i % 6) : 0;
		}
		StringBuilder sb = new StringBuilder();
		for (byte b : base64) {
			sb.append(B64[b]);
		}

		for (int i = 0; i < 3 - bytes.length % 3; i++) {
			sb.append("=");
		}
		return sb.toString();
	}

	public static String md5_4_16(String sourceStr) {
		return md5_4_32(sourceStr).substring(8, 24);
	}

	public static String str2HexStr(String str) {
		char[] chars = "0123456789ABCDEF".toCharArray();
		StringBuilder sb = new StringBuilder("");
		byte[] bs = str.getBytes();
		int bit;
		for (int i = 0; i < bs.length; i++) {
			bit = (bs[i] & 0x0f0) >> 4;
			sb.append(chars[bit]);
			bit = bs[i] & 0x0f;
			sb.append(chars[bit]);
		}
		return sb.toString();
	}

	public static String md5_4_32(String sourceStr) {
		String result = "";
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(sourceStr.getBytes());
			byte b[] = md.digest();
			int i;
			StringBuffer buf = new StringBuffer("");
			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}
			result = buf.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public static final String sha1(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest md = MessageDigest.getInstance("sha1");
		byte[] bytes = md.digest(str.getBytes("UTF-8"));
		assert false;
		BASE64Encoder encoder = new BASE64Encoder();
		return encoder.encode(bytes);
	}

	/**
	 * 经严格的10000次随机数测试，本BASE64算法完全可以代替SUN的base64算法
	 * 
	 * @param args
	 * @throws NoSuchAlgorithmException
	 * @throws UnsupportedEncodingException
	 */
	/*
	 * public static void main(String[] args) throws NoSuchAlgorithmException,
	 * UnsupportedEncodingException {
	 * 
	 * // 循环10000次随机数测试 for(int i =0;i<10000;i++){ String s =
	 * RandomUtil.getRandomNum(10); String sunBase64 = md5(s); String
	 * cloudsunBase64 = newBase64(MessageDigest.getInstance("md5").digest(
	 * s.getBytes("UTF-8"))); if(!sunBase64.equals(cloudsunBase64)){
	 * System.out.println(s); System.out.println(sunBase64+" "+cloudsunBase64);
	 * System.out.println("failure"); assert true; break; } } }
	 */

	/*
	 * public static void main(String[] args) throws NoSuchAlgorithmException,
	 * UnsupportedEncodingException { // sha1 加密循环10000次测试 //
	 * System.out.println(sha1("sssssssss")); // 循环10000次随机数测试 for (int i = 0; i
	 * < 10000; i++) { String s = RandomUtil.getRandomNum(10); String sunBase64
	 * = md5(s); String cloudsunBase64 =
	 * newBase64(MessageDigest.getInstance("md5") .digest(s.getBytes("UTF-8")));
	 * if (!sunBase64.equals(cloudsunBase64)) { System.out.println(s);
	 * System.out.println(sunBase64 + " " + cloudsunBase64);
	 * System.out.println("failure"); assert true; break; } }
	 * 
	 * System.out.println("test completed!"); }
	 */
	/**
	 * 和SUN公司的BASE64性能比较 循环1000000次测试 SUN BASE64 TIME:17016 CLOUDSUN BASE64
	 * TIME:7328 测试环境：Windows XP 32位系统 CPU: AMD 双核4线程 内存：2G
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

/*		int TILES = 1000000;
		long sunBegin = System.currentTimeMillis();
		for(int i=0;i<TILES;i++){
			md5(RandomUtil.getRandomNum(10));
		}
		long sunEnd = System.currentTimeMillis();
		
		long cloudsunBegin = System.currentTimeMillis();
		for(int i=0;i<TILES;i++){
			cloudsunMd5(RandomUtil.getRandomNum(10));
		}
		long cloudsunEnd = System.currentTimeMillis();
		System.out.println("SUN BASE64 TIME:"+(sunEnd-sunBegin));*/
		Object obj = new Object();
		String pwd= "tjjr20181203";
		System.out.println("32 md5 加密"+md5_4_32(pwd));
		System.out.println("32 md5 加密+随机数=== "+md5_4_32(md5_4_32(pwd)+"150132"));
		System.out.println("32 md5 加密 转64:"+b16ToB64(md5_4_32(pwd)));
		System.out.println("64 md5 加密:"+md5(pwd));
		System.out.println("64 md5 加密 转32:"+b64ToB16(md5(pwd)));
		System.out.println("64 md5 加密 转32====xxx=:"+md5_4_32(b64ToB16("g80nlF07XCdCLTT2Xhw5jw==")+"585688"));
System.out.println("64 md5 加密:"
						+ md5("12341416290382http://brand.wljhealth.com/http://brand.wljhealth.com/desc.htmlhttp://brand.wljhealth.com/logo.jpg广东省广东省广州市广州市王老吉王老吉凉茶创立于清道光年间(1828年)，至今已经有将近两百年的历史，被公认为凉茶始祖P9OJhpg9JgsXrKhj5GEm7wm75D9iomQn"));
		
		// System.out.println("64 md5 加密 转32:"+b64ToB16(md5(pwd)));
		// System.out.println("64 md5 加密 转32:"+md5_4_32(b64ToB16(md5(pwd))+"111755"));
		int[] days = DateUtils.getDaybetweenTwoDate(new Date(2016,1,22,9,11,30),new Date(2015,10,23,8,18,42));
		System.out.println("===================");
		System.out.println(days[0]);
		System.out.println(days[1]);
	}
}
