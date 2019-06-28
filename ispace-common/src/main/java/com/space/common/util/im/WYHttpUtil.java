package com.space.common.util.im;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;


/**
 * 网易云信http请求工具类
 */
@Component
public class WYHttpUtil {

    @Autowired
    IMSignUtil imSignUtil;


    private final static Logger logger = LoggerFactory.getLogger(WYHttpUtil.class);

    public String imPost(String url, Map<String, Object> paramMap) {
        String result = null;
        try {
            DefaultHttpClient httpClient = new DefaultHttpClient();
            List<BasicNameValuePair> params = new ArrayList<BasicNameValuePair>(); // 定义键值对列表，用于存放向url发送post请求的数据。
            Iterator<Map.Entry<String, Object>> it = paramMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Object> entry = it.next();
                params.add(new BasicNameValuePair(entry.getKey(), String.valueOf(entry.getValue())));
            }
            HttpEntity reqEntity = new UrlEncodedFormEntity(params, "utf-8"); // 用UrlEncodedFormEntity对象包装请求体数据
            HttpPost httpPost = new HttpPost(url);
            String nonce = "12345";//随机数
            String curTime = String.valueOf((new Date()).getTime() / 1000L);
            String checkSum = CheckSumBuilder.getCheckSum(imSignUtil.getAppSecret(), nonce, curTime);//参考 计算CheckSum的java代码
            // 设置请求的header
            httpPost.addHeader("AppKey", imSignUtil.getAppKey());
            httpPost.addHeader("Nonce", nonce);
            httpPost.addHeader("CurTime", curTime);
            httpPost.addHeader("CheckSum", checkSum);
            httpPost.addHeader("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
            httpPost.setEntity(reqEntity);
            logger.info("发送网易云信参数+url:" + url + "?" +reqEntity); // 打印出请求实体
            HttpResponse response = httpClient.execute(httpPost);
            result = EntityUtils.toString(response.getEntity(), "utf-8");
            // 打印执行结果
            logger.info("请求网易云信返回：" + result);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}