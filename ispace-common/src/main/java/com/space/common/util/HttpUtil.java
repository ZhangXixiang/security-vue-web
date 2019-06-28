package com.space.common.util;


import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author lihan
 * @Title: HttpUtil
 * @Description: TODO
 * @date 2018-12-05 19:38
 */
public class HttpUtil {


    /**
     * 向指定URL发送GET方法的请求
     *
     * @param url
     *            发送请求的URL
     *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return URL 所代表远程资源的响应结果
     */
    public static String sendGet(String url) {
        String result = "";
        BufferedReader in = null;
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("Accept-Charset", "GBK");
            connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 设置连接超时和读取超时
            connection.setConnectTimeout(30 * 1000);
            connection.setReadTimeout(60 * 1000);
            printResponseHeader(connection);
            // 建立实际的连接
            connection.connect();
            System.out.println(connection);

            // 获取所有响应头字段
            // Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            // for (String key : map.keySet()) {
            // System.out.println(key + "--->" + map.get(key));
            // }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            e.printStackTrace();
            result = "-99";
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e) {
               e.printStackTrace();
            }
        }
        return result;
    }
    private static void printResponseHeader(URLConnection http) throws UnsupportedEncodingException {
        Map<String, String> header = getHttpResponseHeader(http);
        for (Map.Entry<String, String> entry : header.entrySet()) {
            String key = entry.getKey() != null ? entry.getKey() + ":" : "";
            System.out.println(key + entry.getValue());
        }
    }
    private static Map<String, String> getHttpResponseHeader(
            URLConnection http) throws UnsupportedEncodingException {
        Map<String, String> header = new LinkedHashMap<String, String>();
        for (int i = 0;; i++) {
            String mine = http.getHeaderField(i);
            if (mine == null)
                break;
            header.put(http.getHeaderFieldKey(i), mine);
        }
        return header;
    }
    /**
     * 向指定 URL 发送POST方法的请求
     *
     * @param url
     *            发送请求的 URL
     * @param param
     *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return 所代表远程资源的响应结果
     */
    public static String sendPost(String url, String param) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置连接超时和读取超时
            connection.setConnectTimeout(30 * 1000);
            connection.setReadTimeout(60 * 1000);
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 发送POST请求必须设置如下两行
            connection.setDoOutput(true);
            connection.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(connection.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！" + e);
            e.printStackTrace();
            result = "-99";
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
               e.printStackTrace();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // 发送 GET 请求
        String s = HttpUtil.sendGet("http://100.100.11.93:8088/sdkproxy/sendsms.action?cdkey=0MTN-EMY-6688-JBQLL&password=555555");
        // String s =
        // HttpUtil.sendGet("http://127.0.0.1:8088/sdkproxy/getmo.action?cdkey=6SDK-EMY-6688-JBQLN&password=55555");

        System.out.println("result=" + s);

        // 发送 POST 请求
        // String sr =
        // HttpUtil.sendPost("http://100.100.11.93:8088/sdkproxy/getmo.action",
        // "cdkey=0MTN-EMY-6688-JBQLL&password=555555");
        // System.out.println("result=" + sr);
        // System.out.println(ResultCode.cmpp20_connection_1.getCode());

    }
}
