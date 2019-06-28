package com.space.common.dto.dis.topic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "TopicResDto", description = "话题")
public class TopicResDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "topic_id")
	private Integer topicId;

	@ApiModelProperty(value = "名称")
    private String name;

	@ApiModelProperty(value = "话题内容")
    private String content;

	@ApiModelProperty(value = "图标地址")
    private String icon;

	@ApiModelProperty(value = "回答数")
    private Integer commentCount;

	@ApiModelProperty(value = "关注数")
    private Integer collectCount;
	
	@ApiModelProperty(value = "是否已关注。null:未关注   大于0:已关注")
    private Integer isFollow;
	
}
