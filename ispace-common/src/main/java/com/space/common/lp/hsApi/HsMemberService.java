package com.space.common.lp.hsApi;

import com.space.common.dto.model.RestApiModel;
import com.space.common.lp.hsApi.req.*;
import com.space.common.lp.member.*;
import org.springframework.stereotype.Service;


@Service
public interface HsMemberService {
	
	/**
	 * 恒生会员系统企业信息查询
	 * @param infoReq
	 * @return
	 */
	QueryCompInfoRequestRep QueryCompInfoRequest(QueryCompInfoRequestReq infoReq);
	
	/**
	 * 恒生会员系统个人信息查询
	 * @param userReq
	 * @return
	 */
	QueryUserInfoRequestRep QueryUserInfoRequest(QueryUserInfoRequestReq userReq);
	
	
	/**
	 * 恒生会员系统用户登陆
	 * @param loginReq
	 * @return
	 */
	LoginByAccountRequestRep LoginByAccountRequest(LoginByAccountRequestReq loginReq);
	
	/**
	 * 是否调用恒生接口
	 */
	boolean checkHsApiStatus();
	
	/**
	 * 恒生注册接口
	 * @return
	 */
	UserRegisterRequestRep UserRegisterRequest(InvestorBaseAccountAddReq req);
	
	/**
	 * 恒生发短信接口
	 */
	RestApiModel userMobileCodeRequest(UserResetPwdReq userResetPwdReq);
	
	/**
	 * 恒生发送快捷登录接口
	 */
	void SendMessageRequest(String mobile);

	/**
	 * 恒生修改密码
	 * @param userResetPwdReq
	 */
	RestApiModel editPwd(UserResetPwdReq userResetPwdReq);


	/**
	 * 用户手机密码重置接口
	  功能说明：用户使用验证手机获取密码。 通过短信，发送用户密码到
	 用户手机（由于密码不是明文存储，所以发送一个自动生成的密码）
	 * @param userResetPwdReq
	 * @return
	 */
	RestApiModel resetPwd(UserResetPwdReq userResetPwdReq);

	/**
	 * 用户注册手机号校验接口
	 */
	void CheckUserPhoneRequest(String userPhone);
	
	/**
	 * 实名认证结果通知
	 */
	void certificationRequest(String account, String idCard, String realName);
	
	/**
	 * 投资人名册同步接口
	 * 
	 * @param req
	 * @return
	 */
	BaseResp receiveInvestorRequest(ReceiveInvestorReq req);
	
	/**
	 * 是否对接恒生登记结算系统
	 * 
	 * @return
	 */
	public boolean isConnectIpodreg();
	
	
	public void userChangeCellPhoneRequest(String account, String oldUserPhone, String newUserPhone);

	/**
	 * 用户注册
	 * 根据pc端个人注册方式提供个人会员注册接口。
	 */
	public RestApiModel personRegister(PersonRegisterForm personRegisterForm);

	/**
	 * 更新头像
	 *
	 */
	public RestApiModel UpdateUserImageRequest(UpdateUserImageForm updateUserImageForm);

	/**
	 * 机构注册
	 * @param personRegisterForm
	 * @return
	 */
	public RestApiModel agentRegisterRequest(PersonRegisterForm personRegisterForm);


	/**
	 * 请求恒生接口获取当前日期的平台访问量
	 * @param s
	 * @return
	 */
    int QueryTodayAccessNum(String s);
}
