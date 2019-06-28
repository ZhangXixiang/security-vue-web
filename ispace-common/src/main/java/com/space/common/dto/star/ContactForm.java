package com.space.common.dto.star;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class ContactForm implements Serializable {
    private String mobile;//手机号
    private String name;//名称称呼
    private String email;//邮箱
}
