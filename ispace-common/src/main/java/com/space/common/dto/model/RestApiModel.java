package com.space.common.dto.model;

import com.space.common.enums.ResponseStatusCode;
import com.space.common.util.DateUtils;
import com.space.common.util.StringUtils;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *返回工具类
 */
@Getter
@Setter
public class RestApiModel implements Serializable  {
	
	
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1L;
	
	private Map<Object, Object> data = new HashMap<Object, Object>();

    public void setCodeMessage(String code, String message){
    	data.put("code", code);
    	data.put("message", message);
    }
    public void setRestApiModel(ResponseStatusCode responseStatusCode){
    	data.put("code", responseStatusCode.getCode());
    	data.put("message", responseStatusCode.getDesc());
    }
    
    public void setContent(Object content){
    	data.put("content", content);
    }
    public void setKeyAndValue(Object key,Object value){
    	data.put(key, value);
    }

    /**
     * 成功相应码
     */
    public RestApiModel(){
        data.put("code", ResponseStatusCode.success.getCode());
        data.put("message", ResponseStatusCode.success.getDesc());
        data.put("responseTime", DateUtils.parseDateForStandard(new Date()));
    }

    /**
     * 自定义相应对象
     * @param responseStatusCode
     * @param content
     */
    public RestApiModel(ResponseStatusCode responseStatusCode, Object content) {
    	 data.put("code", responseStatusCode.getCode());
    	 data.put("message", responseStatusCode.getDesc());
    	 data.put("responseTime",DateUtils.parseDateForStandard(new Date()));
    	 data.put("content",  content);
    }

    public RestApiModel(ResponseStatusCode responseStatusCode) {
    	 data.put("code", responseStatusCode.getCode());
    	 data.put("message", responseStatusCode.getDesc());
    	 data.put("responseTime",DateUtils.parseDateForStandard(new Date()));
    }

	public String toJson(){
		 return StringUtils.paseObjToString(data);
	}

}