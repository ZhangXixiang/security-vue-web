package com.space.common.dto.star;

import lombok.Getter;
import lombok.Setter;

/**
 * 请求参数基类
 */
@Setter
@Getter
public class UserForm {

    /**
     * base64 身份证号
     */
    private String idNum;

    /**
     *真实姓名
     */
    private String realName;
    /**
     *地址
     */
    private String address;
    /**
     *民族
     */
    private String nationality;
    /**
     *性别
     */
    private String sex;
    /**
     *出生日期
     */
    private String birth;

    /**
     * base64 身份证正面
     */
    private String idFront;

}
