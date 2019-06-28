package com.space.common.util;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author
 */
public class IdCardAuthentication {
    /**
     *
     * @param uid 用户id(可为空)
     * @param idCardNum 用户身份证号码(必须)
     * @param userName 用户姓名(必须)
     * @return
     */

    public Map checkId(String uid,String idCardNum,String userName) {
        String host = "https://safrvcert.market.alicloudapi.com";
        String path = "/safrv_2meta_id_name/";
        String method = "GET";
        Map<String, String> headers = new HashMap();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + "75e01cec93374de7a5ba7addb06a3d36");
        Map<String, String> querys = new HashMap();
        querys.put("__userId", "1600049046721866");
        //用户id为非必需参数
        querys.put("customerID", uid);
        querys.put("identifyNum", idCardNum);
        querys.put("userName", userName);
        querys.put("verifyKey", "IVV2FXoe38sWnp");
        Map<String,String> resultmap = new HashMap<String, String>();
        try {
            HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
            //状态码为200成功,400表示证件号码格式错误,500表示缺少参数(身份证号/姓名为空)
            //200中又含是否匹配等信息,在message字段中
            //例:{"code":200,"message":"姓名证件号校验不匹配","value":{"bizCode":13053,"message":"姓名证件号校验不匹配"}}
            String resultbody = EntityUtils.toString(response.getEntity());
            resultmap.put("reslut",resultbody);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultmap;
    }
}
