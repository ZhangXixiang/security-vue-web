package com.space.common.lp.member;

/**
 * 用户登陆Req
 * @author changl
 *
 */
@lombok.Data
public class LoginByAccountRequestReq {

	private String loginAccount; //投资人登录账户
	
	private String userPsw;   //投资人登录密码
	
	private String userPhone; //注册手机号
	
	private String smsCode;//短信验证码
	
}
