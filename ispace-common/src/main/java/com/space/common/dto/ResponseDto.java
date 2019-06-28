package com.space.common.dto;

import java.io.Serializable;

public class ResponseDto<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	private String result;//http返回码
	private String msg;//提示消息
	private T t;//返回的数据
	
	public ResponseDto() {
	
	}

	public ResponseDto(String result) {
		super();
		this.result = result;
	}

	public ResponseDto(String result, String msg) {
		super();
		this.result = result;
		this.msg = msg;
	}

	public ResponseDto(String result, String msg, T t) {
		super();
		this.result = result;
		this.msg = msg;
		this.t = t;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
