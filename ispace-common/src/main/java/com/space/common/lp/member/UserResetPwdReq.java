package com.space.common.lp.member;

/**
 * 用户登陆Req
 * @author changl
 *
 */
@lombok.Data
public class UserResetPwdReq {

	private String loginAccount; //投资人登录账户
	private String mobile; //登录手机号

	/**
	 * 主要有两类: 	 forget(忘记密码获取的 验证码 ) 	 reset(重置密码获取验证码)   reg_mobile(注册时获取的)
	 */
	private String bizType = "forget"; //短信验证码获取类型
	/**
	 * 1. 当 bizType 的值是“reg_mobile”	 时不需要传递；
	 2. 当 bizType 的值是“forget”时要按	 照下列参数值传递：
		 password：忘记登录密码
		 payPwd：忘记支付密码
		 默认值是：password
	 */
	private String forgetType = "password"; //忘记密码类型

	private String newPsw;   //新密码
	
	private String oldPsw; //旧密码

	/**
	 * 密码类型
	 * 登陆密码：password	 支付密码：payPwd
	 */
	private String pwdType = "password";

	/**
	 * 手机验证码
	 */
	private String checkCode;

}
