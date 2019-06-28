package com.space.common.dto.star;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NewsInfoForm {

    /**
     * 名称
     */
    private String title;

    private String imageUrl;
    private String desStr;
}
