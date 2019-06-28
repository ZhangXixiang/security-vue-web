package com.space.common.util;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lihan
 * @Title: OCRBusinessLicenseUtils
 * @Description: 调用阿里OCR进行营业执照识别的工具类
 * @date 2018-12-10 15:28
 */
public class OCRBusinessLicenseUtils {
   

    /**
     *
     * OCR 文字识别营业执照
     *@return    返回map集合
     *<br> eg:
     *<br> &nbsp; {
     *<br> &nbsp;"config_str" : "null\n", #配置字符串信息
     *<br> &nbsp;"angle" : float, #输入图片的角度（顺时针旋转），［0， 90， 180，270］
     *<br> &nbsp;"reg_num" : string, #注册号，没有识别出来时返回"FailInRecognition"
     *<br> &nbsp;"name" : string, #公司名称，没有识别出来时返回"FailInRecognition"
     *<br> &nbsp;"type" : string, #公司类型，没有识别出来时返回"FailInRecognition"
     *<br> &nbsp;"person" : string, #公司法人，没有识别出来时返回"FailInRecognition"
     *<br> &nbsp;"establish_date": string, #公司注册日期(例：证件上为"2014年04月16日"，算法返回"20140416")
     *<br> &nbsp;"valid_period": string, #公司营业期限终止日期(例：证件上为"2014年04月16日至2034年04月15日"，算法返回"20340415")
     *<br> &nbsp;&nbsp;&nbsp; #当前算法将日期格式统一为输出为"年月日"(如"20391130"),并将"长期"表示为"29991231"，若证件上没有营业期限，则默认其为"长期",返回"29991231"。
     *<br> &nbsp;"address" : string, #公司地址，没有识别出来时返回"FailInRecognition"
     *<br> &nbsp;"capital" : string, #注册资本，没有识别出来时返回"FailInRecognition"
     *<br> &nbsp;"business": string, #经营范围，没有识别出来时返回"FailInRecognition"
     *<br> &nbsp;"emblem" : string, #国徽位置［top,left,height,width］，没有识别出来时返回"FailInDetection"
     *<br> &nbsp;"title" : string, #标题位置［top,left,height,width］，没有识别出来时返回"FailInDetection"
     *<br> &nbsp;"stamp" : string, #印章位置［top,left,height,width］，没有识别出来时返回"FailInDetection"
     *<br> &nbsp;"qrcode" : string, #二维码位置［top,left,height,width］，没有识别出来时返回"FailInDetection"
     *<br> &nbsp; "success" : bool, #识别成功与否 true/false
     *<br> &nbsp; "request_id": string
     * <br> &nbsp;}
     */
    public static  String getOCRBusinessLiceseData(String img2Base64UtilStr) throws  Exception{
        String host = "https://dm-58.data.aliyun.com";
        String path = "/rest/160601/ocr/ocr_business_license.json";
        String method = "POST";
        String appcode = "75e01cec93374de7a5ba7addb06a3d36";//你自己的AppCode
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        //根据API的要求，定义相对应的Content-Type
        headers.put("Content-Type", "application/json; charset=UTF-8");
        Map<String, String> querys = new HashMap<String, String>();
//        String  img2Base64UtilStr = Img2Base64Util.getImgStr("e:\\1.jpg");
//        String bodys = "{\"image\":\"对图片内容进行Base64编码\"}";

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("image",img2Base64UtilStr);
        /**
         * 重要提示如下:
         * HttpUtils请从
         * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
         * 下载
         *
         * 相应的依赖请参照
         * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
         */
        HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, jsonObject.toJSONString());
//        System.out.println("response:"+response.toString());
        //获取response的body
//        System.out.println(EntityUtils.toString(response.getEntity()));


        //结果集返回
        return EntityUtils.toString(response.getEntity());
    }

}
