package com.space.common.dto.dis.comment;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Component
@Data
@ApiModel(value = "CommentSearchDto")
public class CommentSearchDto {

	@ApiModelProperty(value = "页码")
	@NotNull(message = "页码不能为空")
	private Integer pageNum;
	
	@ApiModelProperty(value = "每页条数")
	@NotNull(message = "每页大小不能为空")
	private Integer pageSize; 
	
	@ApiModelProperty(value = "回答ID")
	@NotNull(message = "answerId不能为空")
	private Integer answerId;
	
	@JsonIgnore
	private String userId;
	
}
