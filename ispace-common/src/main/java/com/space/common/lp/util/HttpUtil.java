package com.space.common.lp.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Component
public class HttpUtil {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	

	@Autowired
	SignUtil sign;
	
	public static final String returnCode_success = "00000000";
	
	public static final String login_success = "00000001";
	
	/**http请求头-标准的编码格式*/
	public static final String HEADER_CONTENT_TYPE_FORM = "application/x-www-form-urlencoded; charset=utf-8";

	/**
	 * 向指定URL发送POST请求
	 * 
	 * @param url
	 * @param paramMap
	 * @return 响应结果
	 * @throws MalformedURLException
	 */
	public  String sendPostHC(String url, Map<String, Object> paramMap){
		String result = null;
		try {
			HttpClient client = HttpClients.createDefault();
			List<BasicNameValuePair> params = new ArrayList<BasicNameValuePair>(); // 定义键值对列表，用于存放向url发送post请求的数据。
			Iterator<Map.Entry<String, Object>> it = paramMap.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry<String, Object> entry = it.next();
				params.add(new BasicNameValuePair(entry.getKey(), String.valueOf(entry.getValue())));
			}
			System.out.println("请求恒生url："+url);
			HttpPost post = new HttpPost(url); // 定义HttpPost对象并初始化它
			// post.setHeader("Content-type", "application/json; charset=utf-8");

			HttpEntity reqEntity = new UrlEncodedFormEntity(params, "utf-8"); // 用UrlEncodedFormEntity对象包装请求体数据
			post.setEntity(reqEntity); // 设置post请求实体
			HttpResponse response = client.execute(post); // 发送http请求
			logger.info("发送恒生参数:" + EntityUtils.toString(reqEntity)); // 打印出请求实体
			logger.info("发送恒生参数+url:" + url+"?"+ EntityUtils.toString(reqEntity)); // 打印出请求实体
			if (response != null) {
				// 检验返回码
				HttpEntity resEntity = response.getEntity();
				if (resEntity != null) {
					result = EntityUtils.toString(resEntity, "utf-8");
					logger.info("恒生返回参数: " + result);
				}else {
					logger.info("请求恒生返回为空" );
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return result;
	}
	
	public String sendPostHC(String url, Map<String, Object> paramMap, String header) {
		String result = null;
		try {
			HttpClient client = HttpClients.createDefault();
			List<BasicNameValuePair> params = new ArrayList<BasicNameValuePair>(); // 定义键值对列表，用于存放向url发送post请求的数据。
			Iterator<Map.Entry<String, Object>> it = paramMap.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry<String, Object> entry = it.next();
				params.add(new BasicNameValuePair(entry.getKey(), String.valueOf(entry.getValue())));
			}
			System.out.println("请求恒生url："+url);
			HttpPost post = new HttpPost(url); // 定义HttpPost对象并初始化它
			
			if(StringUtils.isNotBlank(header)){
				post.setHeader("Content-type", header);
			}
			HttpEntity reqEntity = new UrlEncodedFormEntity(params, "utf-8"); // 用UrlEncodedFormEntity对象包装请求体数据
			post.setEntity(reqEntity); // 设置post请求实体
			HttpResponse response = client.execute(post); // 发送http请求
			logger.info("发送恒生参数:" + EntityUtils.toString(reqEntity)); // 打印出请求实体
			logger.info("发送恒生参数+url:" + url+"?"+ EntityUtils.toString(reqEntity)); // 打印出请求实体
			if (response != null) {
				// 检验返回码
				HttpEntity resEntity = response.getEntity();
				if (resEntity != null) {
					result = EntityUtils.toString(resEntity, "utf-8");
					logger.info("恒生返回参数: " + result);
				}else {
					logger.info("请求恒生返回为空" );
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return result;
	}

	public static void doGet(String urlNameString) {
		try {
			// 根据地址获取请求
			HttpGet request = new HttpGet(urlNameString);// 这里发送get请求
			// 获取当前客户端对象
			HttpClient httpClient = new DefaultHttpClient();
			// 通过请求对象获取响应对象
			HttpResponse response = httpClient.execute(request);

			// 判断网络连接状态码是否正常(0--200都数正常)
			if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				String result = EntityUtils.toString(response.getEntity(),
						"utf-8");
				System.out.println("Get 请求返回值：" + result);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String doGetRes(String urlNameString) {
		try {
			// 根据地址获取请求
			HttpGet request = new HttpGet(urlNameString);// 这里发送get请求
			// 获取当前客户端对象
			HttpClient httpClient = new DefaultHttpClient();
			// 通过请求对象获取响应对象
			HttpResponse response = httpClient.execute(request);

			// 判断网络连接状态码是否正常(0--200都数正常)
			if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				String result = EntityUtils.toString(response.getEntity(),
						"utf-8");
				System.out.println("Get 请求返回值：" + result);
				return result;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "0";
	}

	public  String doPostTJS(Map<String, Object> paramMap,String path) {
		HttpUtil http = new HttpUtil();
		paramMap.put("platformId",sign.getPlatformId());
		paramMap.put("appKey", sign.getAppKey());
		paramMap.put("channel", path);
		return http.sendPostHC(sign.getUrlPath(), paramMap);
	}

	public  String doPostSpace(Map<String, Object> paramMap,String path) {
		HttpUtil http = new HttpUtil();
		paramMap.put("platformId",sign.getSpacePlatformId());
		paramMap.put("appKey", sign.getAppKey());
		paramMap.put("channel", path);
		return http.sendPostHC(sign.getStarSpaceUrlPath(), paramMap);
	}

	/**
	 * post请求天金所登记结算系统
	 * 
	 * @param paramMap
	 * @param path
	 * @return
	 */
	public  String doPostTJSIpodReg(Map<String, Object> paramMap,String path) {
		HttpUtil http = new HttpUtil();
		paramMap.put("platformId",sign.getIpodregPlatformId());
		paramMap.put("appKey", sign.getAppKey());
		paramMap.put("channel", path);
		return http.sendPostHC(sign.getIpodregUrlPath(), paramMap);
	}
	
	/**
	 * post请求，可设置请求头
	 * 
	 * @param paramMap  请求参数
	 * @param path  请求接口名称
	 * @param header 请求头
	 * @return
	 */
	public String doPostTJS(Map<String, Object> paramMap, String path, String header) {
		HttpUtil http = new HttpUtil();
		paramMap.put("platformId", sign.getPlatformId());
		paramMap.put("appKey", sign.getAppKey());
		paramMap.put("channel", path);
		return http.sendPostHC(sign.getUrlPath(), paramMap, header);
	}
}
