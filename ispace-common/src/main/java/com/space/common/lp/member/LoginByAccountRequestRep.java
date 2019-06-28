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
public class LoginByAccountRequestRep  extends BaseResp {

    private String userName;   //投资人名称
    
    private String userId;    //投资人ID
    
    private String userOid; //用户id

    private String sessionId; //sessionId
    private String userToken; //userToken

}
