package com.space.common.lp.hsApi.req;

import lombok.*;

import javax.validation.constraints.NotNull;

/**
 * LP项目受让人信息参数
 * 
 * @author Chency
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PushLPProjectUserInfo {
	
	// 会员手机号
	@NotNull
	private String userPhone;
	// 身份证
	@NotNull
	private String idCard;
	// 用户名
	@NotNull
	private String userName;
}
