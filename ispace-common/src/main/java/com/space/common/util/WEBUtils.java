package com.space.common.util;


import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;
import javax.management.Query;
import javax.servlet.http.HttpServletRequest;
import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.util.Date;
import java.util.Set;

/**
 * 
 * web 工具方法
 */
public class WEBUtils {

	/**
	 * cookie 域名
	 */
	public static final String COOKIE_DOMAIN ="";
	

	/**
	 * cookie 名称:to [user]
	 */
	public static final String USER_COOKIE_NAME="SmallCookie";
	
	public static final String SERVANT_COOKIE_NAME = "servantNO";
	
	/**
	 * 获取登录用户IP地址
	 * 
	 * @param request
	 * @return
	 */
	public static String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		if (ip.equals("0:0:0:0:0:0:0:1")) {
			ip = "本地";
		}
		return ip;
	}
	
	/**
	 * 得到服务器路径
	 * @param request
	 * @param matchURI
	 * @return
	 */
	public static String getBaseUrl(HttpServletRequest request, String matchURI) {
		StringBuffer requestURL = request.getRequestURL();
		return requestURL.substring(0, requestURL.lastIndexOf(matchURI));
	}
	
	/**
	 * 获取服务器路径(不包含项目路径)
	 * 比如：http://www.cloudsun.net/
	 * @param request
	 * @return
	 */
	public static String getServerUrl(HttpServletRequest request) {
		StringBuffer sb = new StringBuffer(request.getScheme()).append("://");
		sb.append(request.getServerName()).append(":").append(request.getServerPort()).append("/");
		return sb.toString();
	}
	
	/**
	 * 获取服务器路径
	 * 例如
	 * http://bo.helloan.cn:80/helloan-process/
	 * @param request
	 * @return
	 */
	public static String getBaseUrl(HttpServletRequest request) {
		StringBuffer sb = new StringBuffer(request.getScheme()).append("://");
		sb.append(request.getServerName()).append(":").append(request.getServerPort()).append(request.getContextPath()).append("/");
		return sb.toString();
	}	
	/**
	 * 从spring中 获得request
	 * @return
	 */
	public static HttpServletRequest getRequest() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		return request;
	}
	
	/**
	 * 是否为 @Basic 所认同的 web 基础类型
	 */
	public static boolean isBasic(Class<?> clazz){
		if(clazz==null)return false;
		if(!clazz.isArray()){
			if(clazz.isPrimitive()||
					Date.class.isAssignableFrom(clazz)||
					clazz.equals(String.class)||
					Number.class.isAssignableFrom(clazz)||
					Character.class.equals(clazz)||
					Boolean.class.equals(clazz)){
				return true;
			}
		}else{
			Class<?> sub = clazz.getComponentType();
			if(Character.class.equals(sub)||
					byte.class.equals(sub)||
					Byte.class.equals(sub)||
					char.class.equals(sub)){
				return true;
			}
		}
		return false;
	}

	/***
	 * 通过查询Jmx 的MBeanServer获取当前tomcat对应的ip和端口号
	 * @throws MalformedObjectNameException 
	 */
	public static String getIpAddressAndPort() throws Exception{
		 MBeanServer beanServer = ManagementFactory.getPlatformMBeanServer();
	        Set<ObjectName> objectNames = beanServer.queryNames(new ObjectName("*:type=Connector,*"),
	                Query.match(Query.attr("protocol"), Query.value("HTTP/1.1")));
	        String host = InetAddress.getLocalHost().getHostAddress();
	        String port = objectNames.iterator().next().getKeyProperty("port");
	        String ipadd = "http" + "://" + host + ":" + port;
//	        System.out.println(ipadd);
	        return ipadd;
	}


}
