package com.space.common.lp.member;

import com.space.common.lp.hsApi.req.BaseResp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


/**
 * 用户登陆Rep
 * @author changl
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class UserRegisterRequestRep  extends BaseResp {

    private String account;   //会员用户名
    
    private String userPhone;    //注册手机号
    
    private String userName; //用户名称
    
}
