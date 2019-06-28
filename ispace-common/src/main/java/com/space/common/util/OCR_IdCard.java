package com.space.common.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.apache.commons.codec.binary.Base64.encodeBase64;

/**
 * @Author
 */

public class OCR_IdCard {

    /**
     * 获取参数的json对象
     */
    public static JSONObject getParam(int type, String dataValue) {
        JSONObject obj = new JSONObject();
        try {
            obj.put("dataType", type);
            obj.put("dataValue", dataValue);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return obj;
    }

    /**
     *
     * @param file
     * 图片路径
     * @param side
     * "face" / "back"
     * @return
     */
    public static Map verificationId(File file,String side){
        String appcode = "75e01cec93374de7a5ba7addb06a3d36";
        String host = "http://dm-51.data.aliyun.com";
        String path = "/rest/160601/ocr/ocr_idcard.json";
        //如果文档的输入中含有inputs字段，设置为True， 否则设置为False
        Boolean is_old_format = false;
        //请根据线上文档修改configure字段
        JSONObject configObj = new JSONObject();
        configObj.put("side", side);
        String config_str = configObj.toString();
        //            configObj.put("min_size", 5);
        //            String config_str = "";
        String method = "POST";
        Map<String, String> headers = new HashMap();
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap();

        // 对图像进行base64编码
        String imgBase64 = "";
        try {

            byte[] content = new byte[(int) file.length()];
            FileInputStream finputstream = new FileInputStream(file);
            finputstream.read(content);
            finputstream.close();
            imgBase64 = new String(encodeBase64(content));
        } catch (IOException e) {
            e.printStackTrace();
        }


        // 拼装请求body的json字符串
        JSONObject requestObj = new JSONObject();
        try {
            if(is_old_format) {
                JSONObject obj = new JSONObject();
                obj.put("image", getParam(50, imgBase64));
                if(config_str.length() > 0) {
                    obj.put("configure", getParam(50, config_str));
                }
                JSONArray inputArray = new JSONArray();
                inputArray.add(obj);
                requestObj.put("inputs", inputArray);
            }else{
                requestObj.put("image", imgBase64);
                if(config_str.length() > 0) {
                    requestObj.put("configure", config_str);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String bodys = requestObj.toString();
        Map<Object,Object> idCardMap = new HashMap<Object, Object>();

        try {
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            String returnMsg = EntityUtils.toString(response.getEntity());
            idCardMap.put("returnMsg",returnMsg);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return idCardMap;
    }

    public static Map verificationId(String imgBase64,String side){
        String appcode = "75e01cec93374de7a5ba7addb06a3d36";
        String host = "http://dm-51.data.aliyun.com";
        String path = "/rest/160601/ocr/ocr_idcard.json";
        //如果文档的输入中含有inputs字段，设置为True， 否则设置为False
        Boolean is_old_format = false;
        //请根据线上文档修改configure字段
        JSONObject configObj = new JSONObject();
        configObj.put("side", side);
        String config_str = configObj.toString();
        //            configObj.put("min_size", 5);
        //            String config_str = "";
        String method = "POST";
        Map<String, String> headers = new HashMap();
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap();

        // 拼装请求body的json字符串
        JSONObject requestObj = new JSONObject();
        try {
            if(is_old_format) {
                JSONObject obj = new JSONObject();
                obj.put("image", getParam(50, imgBase64));
                if(config_str.length() > 0) {
                    obj.put("configure", getParam(50, config_str));
                }
                JSONArray inputArray = new JSONArray();
                inputArray.add(obj);
                requestObj.put("inputs", inputArray);
            }else{
                requestObj.put("image", imgBase64);
                if(config_str.length() > 0) {
                    requestObj.put("configure", config_str);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String bodys = requestObj.toString();
        Map<Object,Object> idCardMap = new HashMap<Object, Object>();
        try {
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            String returnMsg = EntityUtils.toString(response.getEntity());
            System.out.print("OCR识别返回："+returnMsg);
            idCardMap.put("returnMsg",returnMsg);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return idCardMap;
    }
}
