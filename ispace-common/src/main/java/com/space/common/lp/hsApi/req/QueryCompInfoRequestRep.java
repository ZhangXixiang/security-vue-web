package com.space.common.lp.hsApi.req;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class QueryCompInfoRequestRep  extends BaseResp {

	/**
	 * 企业编号
	 */
	private String userId;
	
	/**
	 * 企业账号
	 */
	private String account;
	
	/**
	 * 企业名称
	 */
	private String name;
	
	/**
	 * 企业社会信用代码
	 */
	private String socialCode;
		
	/**
	 * 机构常用邮箱
	 */
	private String orgEmail;
	
	/**
	 * 机构联系地址
	 */
	private String orgAddress;
	
	/**
	 * 联系人
	 */
	private String contacts;
	
	/**
	 * 经办人手机号
	 */
	private String cellPhone;
	
	/**
	 * 法定代表人姓名
	 */
	private String legalRepr;
	
}
