package com.space.common.dto.dis.comment;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Component
@Data
@ApiModel(value = "CommentReqDto", description = "评论")
public class CommentReqDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@NotNull(message = "回答ID不能为空")
	@ApiModelProperty(value = "回答ID")
	private Integer answerId;
	
	@NotNull(message = "评论内容不能为空")
	@ApiModelProperty(value = "评论内容")
	private String content;
	
/*	@NotNull(message = "action不能为空")
	@ApiModelProperty(value = "1：新增   2：取消")
	private Integer action;*/
	
	@JsonIgnore
	private String userId;


}
