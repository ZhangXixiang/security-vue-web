package com.space.common.dto.dis.answer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Component
@Data
@ApiModel(value = "AnswerReqDto", description = "发布")
public class AnswerReqDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "文章标题")
	@NotNull(message = "文章标题不能为空")
    private String title;
	
	@ApiModelProperty(value = "文章内容")
	@NotNull(message = "文章内容不能为空")
    private String cont;
	
	@ApiModelProperty(value = "0：转发    1：原创")
	@NotNull(message = "isOrigin不能为空")
	private String isOrigin; //app使用的框架不能传递int

	@ApiModelProperty(value = "话题id")
	@NotNull(message = "话题id不能为空")
	private String topicId; //app使用的框架不能传递int
	
	@ApiModelProperty(value = "0:图片   1:视频")
	private String type; //app使用的框架不能传递int
}
