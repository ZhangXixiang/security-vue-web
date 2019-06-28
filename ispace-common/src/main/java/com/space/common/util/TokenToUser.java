package com.space.common.util;

import java.util.Map;
import com.alibaba.fastjson.JSON;

public abstract class TokenToUser {

	public static <T> T convert(Map<String, Object> map, Class<T> t, String key){
		Object temp = map.get(key);
		String params = JSON.toJSONString(temp);  
		return JsonUtil.jsonStringToObject(params, t );
	}
	
}
