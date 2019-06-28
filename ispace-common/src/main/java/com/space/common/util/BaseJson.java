package com.space.common.util;

import com.space.common.enums.ResponseStatusCode;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lihan
 * @Title: BaseJson
 * @Description: 基础返回类
 * @date 2018-12-05 18:37
 */
public class BaseJson implements Serializable {
    private static final long serialVersionUID = -6475681946464041197L;
    public Map<String, Object> result = null;

    public BaseJson() {
        result = new HashMap<String, Object>();
        result.put("code", ResponseStatusCode.success.getCode());
        result.put("message", ResponseStatusCode.success.getDesc());
        result.put("responseTime", DateUtils.parseDateForStandard(new Date()));
    }


    public void putContent(Object value){
        result.put("content", value);
    }

    public void putPageData(int pageNow,Object value){
        result.put("pageNow", pageNow);
        result.put("data", value);
    }
    public void putMessage(String code,String message){
        result.put("code", code);
        result.put("message", message);
    }

    public void put(String key, Object value){
        result.put(key, value);
    }
    public Object get(String key){
        return  result.get(key);
    }

    public String toJson(){
        if(result == null){
            return fail();
        }
        return   StringUtils.paseObjToString(result);
    }

    public BaseJson(ResponseStatusCode responseStatusCode) {
        result = new HashMap<String, Object>();
        result.put("code", responseStatusCode.getCode());
        result.put("message", responseStatusCode.getDesc());
        result.put("responseTime", DateUtils.parseDateForStandard(new Date()));
    }

    public String fail() {
        result = new HashMap<String, Object>();
        result.put("code", ResponseStatusCode.serverError.getCode());
        result.put("message", "failed");
        result.put("responseTime", DateUtils.parseDateForStandard(new Date()));
        return null;
    }
}
