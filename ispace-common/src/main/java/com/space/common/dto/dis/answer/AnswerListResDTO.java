package com.space.common.dto.dis.answer;

import com.space.common.dto.dis.answer.resource.ResourceResDto;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 查询回答列表 返回实体
 */
@Data
public class AnswerListResDTO implements Serializable {

    private Integer answerId;

    private String title;

    private String cont;

    private String topName;

    private Date createTime;

    private Integer goodCount;

    private Integer collectCount;

    private Integer commentCount;

    private String userName;

    private List<ResourceResDto> resourceDtos;

    private String headImg;

    private Integer isGood;

    private Integer isCollect;

    private Date uT;

    private Integer isDeleted;

    private String uP;

}
