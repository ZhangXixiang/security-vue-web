package com.space.common.dto.dis.answer;

import com.space.common.dto.dis.answer.resource.ResourceResDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Component
@Data
@ApiModel(value = "AnswerResDto", description = "回答")
public class AnswerResDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "回答ID")
	private Integer answerId;

	@ApiModelProperty(value = "回答标题")
    private String title;

	@ApiModelProperty(value = "回答内容")
    private String cont;

	@ApiModelProperty(value = "话题来源")
    private String topName;

	@ApiModelProperty(value = "创建时间")
    private Date createTime;

	@ApiModelProperty(value = "点赞数")
    private Integer goodCount;

	@ApiModelProperty(value = "收藏数")
    private Integer collectCount;

	@ApiModelProperty(value = "评论数")
    private Integer commentCount;

	@ApiModelProperty(value = "回答人名称")
    private String userName;

	@ApiModelProperty(value = "资源对象")
	private List<ResourceResDto> resourceDtos;
	
	@ApiModelProperty(value = "回答人头像")
    private String headImg;
	
	@ApiModelProperty(value = "1:点赞   0:未点赞")
	private Integer isGood;
	
	@ApiModelProperty(value = "1:收藏   0:未收藏")
	private Integer isCollect;
	
}







