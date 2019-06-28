package com.space.common.lp.hsApi.req;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 投资人信息参数
 * 
 * @author Chency
 * @date 2018年11月19日
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReceiveInvestorReq {
	
	// 产品编号
	@NotNull
	private String productCode;
	// 投资人名册json数据
	@NotNull
	private List<ReceiveInvestorInfo> receiveInvestorList;
}
