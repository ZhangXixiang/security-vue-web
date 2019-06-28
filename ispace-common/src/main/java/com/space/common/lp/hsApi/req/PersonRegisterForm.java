package com.space.common.lp.hsApi.req;

import lombok.Getter;
import lombok.Setter;

/**
 * 用户注册实体
 */
@Setter
@Getter
public class PersonRegisterForm {

    /**
     * 注册密码
     */
    private String userPsw;
    /**
     * 注册手机号
     */
    private String userPhone;
    /**
     * 短信验证码
     */
    private String regChkCode;
    /**
     * 花名
     */
    private String flowerName;
    /**
     * 推荐人
     */
    private String parentAgentUser;

    private String partFullName;
    private String compType;
    private String socialCode;
    private String legalRepr;
    private String orgAddress;
    private String orgEmail;
    private String contacts;
    private String cellPhone;
}
