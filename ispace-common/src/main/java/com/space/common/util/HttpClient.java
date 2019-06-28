package com.space.common.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

import com.github.kevinsawicki.http.HttpRequest;

public class HttpClient {

	public static String get(Map<String, String> params, String url){
		HttpRequest httpRequest = HttpRequest.get(url, params, Boolean.TRUE);
		String result = httpRequest.body();
		return result;
	}

	public static String post(Map<String, String> params, String url){
		HttpRequest httpRequest = HttpRequest.post(url, params, Boolean.TRUE);
		String result = httpRequest.body();
		return result;
	} 


	public static String HttpPostWithJson(String url, String json) {
		String returnValue = "这是默认返回值，接口调用失败";
		CloseableHttpClient httpClient = HttpClients.createDefault();
		ResponseHandler<String> responseHandler = new BasicResponseHandler();
		try{
			//第一步：创建HttpClient对象
			httpClient = HttpClients.createDefault();

			//第二步：创建httpPost对象
			HttpPost httpPost = new HttpPost(url);

			//第三步：给httpPost设置JSON格式的参数
			StringEntity requestEntity = new StringEntity(json, "utf-8");
			requestEntity.setContentEncoding("UTF-8");    	        
			httpPost.setHeader("Content-type", "application/json");
			httpPost.setEntity(requestEntity);

			//第四步：发送HttpPost请求，获取返回值
			returnValue = httpClient.execute(httpPost, responseHandler); //调接口获取返回值时，必须用此方法
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				httpClient.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//第五步：处理返回值
		return returnValue;
	}
	
	public static String HttpPostWith_form(String url, Map<String, Object> paramMap) {
		String returnValue = "这是默认返回值，接口调用失败";
		CloseableHttpClient httpClient = HttpClients.createDefault();
		ResponseHandler<String> responseHandler = new BasicResponseHandler();
		try{
			//第一步：创建HttpClient对象
			httpClient = HttpClients.createDefault();

			//第二步：创建httpPost对象
			HttpPost httpPost = new HttpPost(url);

			//第三步：给httpPost设置JSON格式的参数
			List<BasicNameValuePair> params = new ArrayList<BasicNameValuePair>(); // 定义键值对列表，用于存放向url发送post请求的数据。
			Iterator<Map.Entry<String, Object>> it = paramMap.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry<String, Object> entry = it.next();
				params.add(new BasicNameValuePair(entry.getKey(), String.valueOf(entry.getValue())));
			}
			HttpEntity reqEntity = new UrlEncodedFormEntity(params, "utf-8"); // 用UrlEncodedFormEntity对象包装请求体数据
			httpPost.setHeader("Content-type", "application/x-www-form-urlencoded; charset=utf-8");
			httpPost.setEntity(reqEntity);

			//第四步：发送HttpPost请求，获取返回值
			returnValue = httpClient.execute(httpPost, responseHandler); //调接口获取返回值时，必须用此方法
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				httpClient.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//第五步：处理返回值
		return returnValue;
	}

	public static void main(String[] args) {
		Map<String,Object> paramMap = new HashMap<String, Object>();
		paramMap.put("channel", "QueryUserInfoRequest");
		paramMap.put("loginAccount", "1809250002");
		paramMap.put("platformId", "2e2302818a996993c08f2f07c9606e79");
		String res = HttpClient.HttpPostWith_form("http://ipoducuat.tjfae.com/service", paramMap);
		System.out.println(res);
	}
	
}









