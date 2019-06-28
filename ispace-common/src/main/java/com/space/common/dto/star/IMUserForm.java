package com.space.common.dto.star;

import lombok.Getter;
import lombok.Setter;

/**
 * 请求参数基类
 */
@Setter
@Getter
public class IMUserForm {

    private String uname;

    private String type;

    private String account;

    private String headImg;
    private String flowerName;
    private String mobile;

}
