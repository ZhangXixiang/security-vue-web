package com.space.util;

import com.space.controller.BaseMobileController;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContextBuilder;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class HsHttpsUtils extends BaseMobileController {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    public static final String get(final String url, final Map<String, Object> params) {
        StringBuilder sb = new StringBuilder("");

        if (null != params && !params.isEmpty()) {
            int i = 0;
            for (String key : params.keySet()) {
                if (i == 0) {
                    sb.append("?");
                } else {
                    sb.append("&");
                }
                sb.append(key).append("=").append(params.get(key));
                i++;
            }
        }

        CloseableHttpClient httpClient = createSSLClientDefault();

        CloseableHttpResponse response = null;
        HttpGet get = new HttpGet(url + sb.toString());
        String result = "";

        try {
            response = httpClient.execute(get);

            if (response.getStatusLine().getStatusCode() == 200) {
                HttpEntity entity = response.getEntity();
                if (null != entity) {
                    result = EntityUtils.toString(entity, "UTF-8");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(HsHttpsUtils.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (null != response) {
                try {
                    EntityUtils.consume(response.getEntity());
                } catch (IOException ex) {
                    Logger.getLogger(HsHttpsUtils.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return result;
    }

    public  String post(final String url, final Map<String, Object> paramMap) {
        String result = null;
        try {
            HttpClient client = HttpClients.createDefault();
        List<BasicNameValuePair> params = new ArrayList<BasicNameValuePair>(); // 定义键值对列表，用于存放向url发送post请求的数据。
        Iterator<Map.Entry<String, Object>> it = paramMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> entry = it.next();
            if(entry != null && entry.getValue() != null) {
                params.add(new BasicNameValuePair(entry.getKey(), String.valueOf(entry.getValue())));
            }
        }
       // System.out.println("请求恒生url："+url);
        HttpPost post = new HttpPost(url); // 定义HttpPost对象并初始化它
        // post.setHeader("Content-type", "application/json; charset=utf-8");

        HttpEntity reqEntity = new UrlEncodedFormEntity(params, "utf-8"); // 用UrlEncodedFormEntity对象包装请求体数据
        post.setEntity(reqEntity); // 设置post请求实体
        HttpResponse response = client.execute(post); // 发送http请求
       // logger.info("发送恒生参数:" + EntityUtils.toString(reqEntity)); // 打印出请求实体
        logger.info("发送恒生参数+url:" + url+"?"+ EntityUtils.toString(reqEntity)); // 打印出请求实体
            if (response != null) {
                // 检验返回码
                HttpEntity resEntity = response.getEntity();
                if (resEntity != null) {
                    result = EntityUtils.toString(resEntity, "utf-8");
                    logger.info("恒生返回结果: " + result);
                }else {
                    logger.info("请求恒生返回为空" );
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private static CloseableHttpClient createSSLClientDefault() {

        SSLContext sslContext;
        try {
            sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy() {
                //信任所有
                @Override
                public boolean isTrusted(X509Certificate[] xcs, String string){
                    return true;
                }
            }).build();

            SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext);

            return HttpClients.custom().setSSLSocketFactory(sslsf).build();
        } catch (KeyStoreException ex) {
            Logger.getLogger(HsHttpsUtils.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(HsHttpsUtils.class.getName()).log(Level.SEVERE, null, ex);
        } catch (KeyManagementException ex) {
            Logger.getLogger(HsHttpsUtils.class.getName()).log(Level.SEVERE, null, ex);
        }

        return HttpClients.createDefault();
    }

    public  String postyunying(final String url, final Map<String, Object> paramMap) {
        String result = null;
        try {
            HttpClient client = HttpClients.createDefault();
            List<BasicNameValuePair> params = new ArrayList<BasicNameValuePair>(); // 定义键值对列表，用于存放向url发送post请求的数据。
            Iterator<Map.Entry<String, Object>> it = paramMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Object> entry = it.next();
                if(entry != null && entry.getValue() != null) {
                    params.add(new BasicNameValuePair(entry.getKey(), String.valueOf(entry.getValue())));
                }
            }
            HttpPost post = new HttpPost(url); // 定义HttpPost对象并初始化它
            HttpEntity reqEntity = new UrlEncodedFormEntity(params, "utf-8"); // 用UrlEncodedFormEntity对象包装请求体数据
            post.setEntity(reqEntity); // 设置post请求实体
            HttpResponse response = client.execute(post); // 发送http请求
            logger.info("发送运营管理参数+url:" + url+"?"+ EntityUtils.toString(reqEntity)); // 打印出请求实体
            if (response != null) {
                // 检验返回码
                HttpEntity resEntity = response.getEntity();
                if (resEntity != null) {
                    result = EntityUtils.toString(resEntity, "utf-8");
                    logger.info("运营管理返回结果: " + result);
                }else {
                    logger.info("请求运营管理返回为空" );
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
