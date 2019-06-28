package com.space.common.lp.member;

import com.space.common.lp.hsApi.req.BaseResp;
import lombok.*;

/**
 * 个人信息查询返回
 * @author changl
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Getter
@Setter
public class QueryUserInfoRequestRep  extends BaseResp {

	private String userId ;//会员编号
	private String account; //会员用户名
	private String name; //用户姓名
	private String flowerName; //花名
	private String gender;//性别
	private String certificatesId; //证件号
	private String partCategories; //会员类型 01：个人02：机构
	private String isOperator; //是否是操作员
	private String optCompCode; //绑定的企业账号 (关联企业信息表的企业账号)
	private String optCode; //绑定的操作员账号
	private String optCompName; //绑定的企业名称
	private String optName; //绑定的操作员名称
	private String socialCode; //绑定的企业信用代码
	private String sessionId; //sessionId
	private String userToken; //userToken
	private String cellPhone; //手机号
	private String imToken; //即时通讯token
	private String headImg; //头像url

}
