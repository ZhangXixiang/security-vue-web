package com.space.common.lp.hsApi.req;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * 产品投资信息参数
 * @author Chency
 * @date 2018年11月19日
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReceiveInvestorInfo {
	
	@NotNull
	private String childCode;				// 产品子代码(子产品编号，无子产品传递001)
	@NotNull
	private String salePlatform;			// 销售平台代码 
	@NotNull
	private String flowNo;					// 销售平台购买交易流水号(交易认购流水号(唯一校验))
	@NotNull
	private String salePlatfromChannel;		// 销售平台交易渠道
	@NotNull
	private String saleProductCode;			// 销售平台产品代码
	@NotNull
	private String investorName;			// 投资人姓名
	@NotNull
	private String customerType;			// 客户类型[0:中国人,1:外国人,2:机构,3:港澳居民,4:台湾居民]
	@NotNull
	private String certificatesType;		// 投资人证件编码[0:身份证]
	@NotNull
	private String certificatesNo;			// 投资人证件号码
	@NotNull
	private String mobileNo;				// 投资人手机号
	@NotNull
	private String phoneNo;					// 投资人住宅电话
	@NotNull
	private String address;					// 投资人地址
	@NotNull
	private String email;					// 投资人Email
	@NotNull
	private BigDecimal investAmount;		// 投资金额（元为单位，保留小数点后两位）
	@NotNull
	private BigDecimal rate;				// 对应产品收益率（%）
	@NotNull
	private String currencyUnit;			// 货币单位[156:人民币]
	@NotNull
	private String tradeAgencyCode;			// 交易机构代号
	@NotNull
	private String tradeAgencyName;			// 交易机构名称
	@NotNull
	private String tradeAgencyBank;			// 投资人开户分支行
	@NotNull
	private String bankNo;					// 投资人卡号
	@NotNull
	private String investDate;				// 交易日期(yyyymmdd)
	@NotNull
	private String payTime;					// 支付时间(yyymmddhhMMss)
	@NotNull
	private String isRiskAssessment;		// 是否完成风险评估[0:否，1:是]
	@NotNull
	private String assessmentPoint;		// 风险评估得分[0:否，1:是]
	@NotNull
	private String isMeetPoint;			// 是否满足得分要求[0:否，1:是]
}
