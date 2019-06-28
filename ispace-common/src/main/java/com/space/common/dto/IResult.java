package com.space.common.dto;

public interface IResult {
	
	public String SUCCESS = "200"; // 操作成功
	public String FAILING = "300"; // 操作失败
	public String UNAUTHORIZED = "401"; //用户认证失败，当前登录用户无权进行本项操作
	public String LOLOGIN_FAILURE = "401.1";//登陆失败
	public String PARAM_ERROR = "401.2"; //请求参数错误
	public String PARAM_NULL = "401.3";//请求参数不能为空
	public String SUCCESS_NoRESULT = "403"; // 操作成功,但是没有符合条件的记录
	public String ERROR = "500";   //系统发生错误
	
}
 