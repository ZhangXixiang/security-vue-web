package com.space.common.util;


/**
 * 
 * @author lihan
 *
 *base64 加密算法
 */
public class BASE64Kit {

	
	private final String map;
	
	public BASE64Kit(){
		map="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
	}
	
	/**
	 *  base64 加密，没有换行
	 * @param bytes
	 * @return
	 */
	public  String encode(byte[] bytes){
		int i = 0, mod = 0,prev = 0;
		StringBuilder sb = new StringBuilder();
		while (i < bytes.length) {
			int ascii = bytes[i] & 0xff;
			mod = i % 3;
			switch (mod) {
			case 0:
				sb.append(map.charAt(ascii >> 2));
				break;
			case 1:
				sb.append(map.charAt(((prev & 3) << 4)
								| (ascii >> 4)));
				break;
			case 2:
				sb.append(map.charAt(((prev & 0x0f) << 2)
						| (ascii >> 6)));
				sb.append(map.charAt(ascii & 0x3f));
				break;
			}
			prev = ascii;
			i++;
		}
		if (mod == 0) {
			sb.append(map.charAt((prev & 3) << 4));
			sb.append("==");
		} else if (mod == 1) {
			sb.append(map.charAt((prev & 0x0f) << 2));
			sb.append("=");
		}
		return sb.toString();
	}
	
	/**
	 * 为加密结果 进行换行
	 * @param str
	 * @return
	 */
	public  String lineFeed(String str){
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<str.length();i++){
			sb.append(str.charAt(i));
			if(i>0 && (i+1)%76==0){
				sb.append(System.getProperty("line.separator"));
			}
		}
		return sb.toString();
	}
	
	/**
	 * base64 解码
	 * @param ciphertext
	 * @return
	 */
	public  byte[] decode(String ciphertext){
		if(ciphertext.indexOf("=")>=0){
			ciphertext =ciphertext.replace( "=", "");
		}
		ciphertext =deleteISO(ciphertext);
		byte[] result = new byte[0];
		int i=0,mod=0,prev=0,cur=0;
		while(i<ciphertext.length()){
			char temp = ciphertext.charAt(i);
			cur = map.indexOf(temp);
			mod = i%4;
			switch (mod) {
			case 0:
				break;
			case 1:
				result = put(result,(byte)((prev<<2)|(cur>>4)));
				break;
			case 2:
				result = put(result,(byte)(((prev & 0x0f)<<4)|(cur>>2)));
				break;
			case 3:
				result =put(result, (byte)(((prev & 3)<<6)|cur));
				break;
			}
			prev = cur;
			i++;
		}
		return result;
	}
	
	private  String deleteISO(String str){
		StringBuilder sb = new StringBuilder(str);
		for(int i=0;i<sb.length();i++){
			if(Character.isISOControl(sb.charAt(i))){
				sb.delete(i, i+2);
			}
		}
		return sb.toString();
	}
	
	private  byte[] put(byte[] bytes,byte b){
		byte[] newArr = new byte[bytes.length+1];
		System.arraycopy(bytes, 0, newArr, 0, bytes.length);
		newArr[newArr.length-1] = b;
		return newArr;
	}
	
}
