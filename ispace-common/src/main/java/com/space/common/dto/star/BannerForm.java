package com.space.common.dto.star;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class BannerForm implements Serializable {
    /**
     * 需要跳转的url
     */
    private String link;

    /**
     *banner图片所在地址
     */
    private String bannerUrl;

    /**
     *banner图片文件名
     */
    private String bannerName;

    /**
     *banner类型(1轮播2资产转让轮播3首页焦点图4首页重点推荐 )
     */
    private  String bannerType;

    /**
     * 排序
     */
    private  String priority;
}
