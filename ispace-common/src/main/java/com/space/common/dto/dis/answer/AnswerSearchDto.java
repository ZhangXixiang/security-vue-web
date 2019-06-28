package com.space.common.dto.dis.answer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Component
@Data
@ApiModel(value = "AnswerSearchDto")
public class AnswerSearchDto {

	@ApiModelProperty(value = "页码")
	@NotNull(message = "页码不能为空")
	private Integer pageNum;
	
	@ApiModelProperty(value = "每页条数")
	@NotNull(message = "每页大小不能为空")
	private Integer pageSize; 
	
	@ApiModelProperty(value = "点赞排序值:good_count, 发布排序值:create_time;")
	@NotNull(message = "排序字段不能为空")
	private String orderTag;
	
	@ApiModelProperty(value = "正序:ASC 倒序：DESC;")
	@NotNull(message = "排序方式不能为空")
	private String orderType;
	
	@ApiModelProperty(value = "话题ID")
	private Integer topicId;
	
	@ApiModelProperty(value = "搜索")
	private String search;
	
	@JsonIgnore
	private String userId;
	
}
