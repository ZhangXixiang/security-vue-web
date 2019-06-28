package com.space.common.util;

import java.net.SocketException;
import javax.servlet.http.HttpServletRequest;

public class IpUtil {

	/**
	 * 
	* @author: ThinkPad
	* @Title: getIp
	* @Description: TODO(获取客户端ip)
	* @param @param request
	* @param @return    设定文件
	* @return String    返回类型
	* @throws
	 */
	public static String getIP(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (!checkIP(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (!checkIP(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (!checkIP(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
	
    private static boolean checkIP(String ip) {
    	//多次反向代理后会有多个ip值，第一个ip才是真实ip
    	if (ip == null || ip.length() == 0 || "unkown".equalsIgnoreCase(ip) || ip.split(".").length != 4) {
            return false;
        }
        return true;
    }
	
	/**
	 * 
	 * @author: dsp
	 * @Title: getDomain
	 * @Description: TODO(获取站点)
	 * @param @param request
	 * @param @return    设定文件
	 * @return String    返回类型
	 * @throws
	 */
	public static String getDomain(HttpServletRequest request){
		/*HttpServletRequest httpRequest=(HttpServletRequest)request;
		String strBackUrl = "http://" + request.getServerName() + ":"
				+ request.getServerPort()
				+ httpRequest.getContextPath()
				+ httpRequest.getServletPath()
				+ "?" + (httpRequest.getQueryString());
		return strBackUrl;*/
		
		String serverName = request.getServerName();		
		String[] temp = serverName.split("\\.");
		return temp[0];
	}

	/**
	 * 
	 * @author: dsp
	 * @Title: ipExistsInRange
	 * @Description: TODO(验证IP是否属于某个IP段)
	 * @param @param ip  所验证的IP号码
	 * @param @param ipSection  IP段（以'-'分隔）
	 * @param @return    设定文件
	 * @return boolean    返回类型
	 * @throws
	 */
	public static boolean ipExistsInRange(String ip,String ipSection) {
		ipSection = ipSection.trim();
		ip = ip.trim();
		int idx = ipSection.indexOf('-');
		String beginIP = ipSection.substring(0, idx);
		String endIP = ipSection.substring(idx + 1);
		return getIp2long(beginIP) <= getIp2long(ip) && getIp2long(ip) <= getIp2long(endIP);
	}

	public static long getIp2long(String ip) {
		ip = ip.trim();
		String[] ips = ip.split("\\.");
		long ip2long = 0L;
		for (int i = 0; i < 4; ++i) {
			ip2long = ip2long << 8 | Integer.parseInt(ips[i]);
		}
		return ip2long;
	}

	public static long getIp2long2(String ip) {
		ip = ip.trim();
		String[] ips = ip.split("\\.");
		long ip1 = Integer.parseInt(ips[0]);
		long ip2 = Integer.parseInt(ips[1]);
		long ip3 = Integer.parseInt(ips[2]);
		long ip4 = Integer.parseInt(ips[3]);
		long ip2long = 1L * ip1 * 256 * 256 * 256 + ip2 * 256 * 256 + ip3 * 256 + ip4;
		return ip2long;
	} 
	
	public static void main(String[] args) throws SocketException{
		//10.10.10.116 是否属于固定格式的IP段10.10.1.00-10.10.255.255
		String ip="10.10.10.116";
		String ipSection="10.10.1.00-10.10.255.255";
		boolean exists=ipExistsInRange(ip,ipSection);
		System.out.println(exists);
		System.out.println(getIp2long(ip));
		System.out.println(getIp2long2(ip));
	}
}














