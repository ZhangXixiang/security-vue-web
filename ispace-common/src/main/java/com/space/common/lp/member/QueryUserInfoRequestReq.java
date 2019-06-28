package com.space.common.lp.member;

/**
 * 个人信息查询请求
 * @author changl
 *
 */
@lombok.Data
public class QueryUserInfoRequestReq {

	/** 会员登陆账号 */
	private String loginAccount;
	
	/** 会员编号 */
	private String userId;
	
}
