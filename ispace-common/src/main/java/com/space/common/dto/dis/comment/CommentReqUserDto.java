package com.space.common.dto.dis.comment;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Component
@Data
@ApiModel(value = "CommentReqUserDto")
public class CommentReqUserDto {

	@ApiModelProperty(value = "页码")
	@NotNull(message = "页码不能为空")
	private Integer pageNum;
	
	@ApiModelProperty(value = "每页条数")
	@NotNull(message = "每页大小不能为空")
	private Integer pageSize; 
	
	@ApiModelProperty(value = "1:我收到  2:我发布")
	@NotNull(message = "type不能为空")
	private Integer type; 
	
	@JsonIgnore
	private String userId;
	
}
