package com.space.common.util;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lihan
 * @Title: SendSMSUtil
 * @Description: 发送短信专用类
 * @date 2018-12-04 18:36
 */
@Getter
@Setter
@Component
public class SendSMSUtil {

    private static String URL;//短信服务商地址

    private static String USER_NAME;//用户名

    private static String PWD;//密码

    @Value("${SMSURL}")
    public void setURL(String url) {
        SendSMSUtil.URL = url;
    }
    @Value("${SMSNAME}")
    public void setNAME(String name) {
        SendSMSUtil.USER_NAME = name;
    }
    @Value("${SMSPWD}")
    public void setPWD(String pwd) {
        SendSMSUtil.PWD = pwd;
    }

    @Autowired
    private static RestTemplate restTemplate;

//    @Value("${isSendSMSFlag}")
//    private static boolean isSendSMS;
//    @Value("${sendSMSContent}")
//    private static String content;

    /***
     *  发送短信验证码公用类,不记录发送短信日志
     *  param smscode 即为短信验证码,如123456
     *  param mobilephone为接收手机号,多个手机号使用,如13900008888,13900009999,13100006666,0218882228
     */
   /* public static Map<String,Object> sendSMS(String smsCode, String mobilePhone) throws Exception {
        Map<String,Object> map = new HashMap<>();
//        if (!isSendSMS) {
//            throw new RuntimeException("发送短信失败:短信开关关闭");
//        }
        String contentTempl = "【天金所】尊敬的用户：您的验证码：code，请在2分钟内填写，请您及时填写";
        String smsContent = contentTempl.replace("code", smsCode);
        map.put("content",smsContent);
        String content = URLEncoder.encode(smsContent, "GBK");

        String dataUrl = URL + "?uid=" + USER_NAME + "&pwd=" + Md5Util.md5_4_32(PWD) + "&mobile=" + mobilePhone + "&content=" + content;
        String result = tzhlSend(dataUrl);//调用url,发送请求
        map.put("result",result);
//        map.put("content",smsContent);
        return map;
    }*/

    public static Map<String,Object> sendSMG(String smsContent, String mobilePhone) throws Exception {
        Map<String,Object> map = new HashMap<>();
        map.put("content",smsContent);
        String content = URLEncoder.encode(smsContent, "GBK");
        String dataUrl = URL + "?uid=" + USER_NAME + "&pwd=" + Md5Util.md5_4_32(PWD) + "&mobile=" + mobilePhone + "&content=" + content;
        String result = tzhlSend(dataUrl);//调用url,发送请求
        map.put("result",result);
//        map.put("content",smsContent);
        return map;
    }

    /***同舟互联发送短信专用,别的httpclient会返回-1,此处用同舟互联的demo发送短信**/
    public static String tzhlSend(String dataUrl) throws Exception {
        URL sendurl = null;
        int inputLine = 0;
        try {

            sendurl = new URL(dataUrl);
            BufferedReader in = null;


            in = new BufferedReader(new InputStreamReader(sendurl.openStream()));
            inputLine = new Integer(in.readLine()).intValue();
//            System.out.println("结束发送短信返回值：  " + inputLine );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "" + inputLine;
    }


}
