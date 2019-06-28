package com.space.common.lp.hsApi.req;

import lombok.Getter;
import lombok.Setter;

/**
 * @desc 更新头像实体
 * @author z.xx
 */
@Setter
@Getter
public class UpdateUserImageForm {

    /**
     * 当前登录账户
     */
    private String account;

    /**
     * 头像数据 Base64编码
     */
    private String imageData;

}
