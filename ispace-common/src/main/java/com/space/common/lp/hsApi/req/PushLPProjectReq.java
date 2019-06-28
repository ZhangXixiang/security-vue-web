package com.space.common.lp.hsApi.req;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

/**
 * LP项目信息参数
 * 
 * @author Chency
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PushLPProjectReq {
	
	// 产品名称
	@NotNull
	private String productName;
	// 单价（元）
	@NotNull
	private BigDecimal unitPrice;
	// 股权数量
	@NotNull
	private BigDecimal transferNum;
	// 项目其他说明
	private String memo;
	// 转让方手机号
	@NotNull
	private String transferUserPhone;
	// 转让方身份证号
	@NotNull
	private String transferIdCard;
	// 转让方姓名
	@NotNull
	private String transferUserName;
	// 受让人信息list
	@NotNull
	private List<PushLPProjectUserInfo> userInfoList;
}
