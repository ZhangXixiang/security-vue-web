package com.space.common.dto.star;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InfoForm extends BaseEntity{

    /**
     * 名称
     */
    private String title;

    /**
     *类别
     */
    private String code;
}
