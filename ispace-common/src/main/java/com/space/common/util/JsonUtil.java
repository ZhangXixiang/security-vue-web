package com.space.common.util;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;
import java.util.List;

public abstract class JsonUtil {
	
	static{
		JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
	}
	
	public static String objectToStr(Object object){
		return JSON.toJSONString(object);
	}
	
	public  static <T> String objectToStr(List<T> list){
		
		return JSON.toJSONString(list);
	}
	
	public static <T> T jsonStrToObject(String jsonStr, Class<T> c){
		return JSON.parseObject(jsonStr, c);
	}
	
	public static <T>  List<T>  jsonStrToList(String jsonString, Class<T> c){
		try {
			return JSON.parseArray(jsonString, c);
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 将json字符串转换成泛型的对象
	 * @param jsonString  json字符串
	 * @param c 泛型的对象
	 * @return 泛型的对象
	 */
	public static <T> T jsonStringToObject(String jsonString, Class<T> c){
		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.setSerializationInclusion(Include.NON_NULL);  
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			return mapper.readValue(jsonString, c);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public static String jsonStringToObject(String jsonString){
		try {
			ObjectMapper mapper = new ObjectMapper();
			return mapper.readValue(jsonString, String.class);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * 将json字符串转换成泛型的集合对象
	 * @param jsonString json字符串
	 * @param collectionClass 泛型的Collection
	 * @param elementClasses 元素类 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T, E> T jsonStringToCollection(String jsonString,Class<T> collectionClass, Class<E>... elementClasses){
		try {
			ObjectMapper mapper = new ObjectMapper();
			JavaType javaType = mapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);
			return mapper.readValue(jsonString, javaType);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * 将对象转换成json字符串
	 * @param obj Object
	 * @return String
	 */
	public static String objectToJsonString(Object obj){
		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.disable(SerializationFeature.INDENT_OUTPUT);
			mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
			return mapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return null;
		}
	}
}
