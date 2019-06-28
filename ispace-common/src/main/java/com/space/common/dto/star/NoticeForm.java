package com.space.common.dto.star;

import lombok.Getter;
import lombok.Setter;

/**
 * 公告,资讯类
 */
@Setter
@Getter
public class NoticeForm {

    /**
     * id
     */
    private String contId;
    private String link;

    /**
     * 公告标题
     */
    private String title;

    /**
     * 标题图片
     */
    private String titleImg;

    /**
     * 资讯公告类型，对应表channle code
     */
    private String type;

    /**
     *备注
     */
    private String remark;

    /**
     *发布日期
     */
    private String releaseDate;

    /**
     *浏览次数
     */
    private String viewCount;
    private String channelName;

}
