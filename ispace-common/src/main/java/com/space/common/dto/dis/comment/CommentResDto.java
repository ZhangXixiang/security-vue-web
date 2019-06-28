package com.space.common.dto.dis.comment;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Data
@Component
@ApiModel(value = "CommentResDto")
public class CommentResDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "评论id")
	private Integer commentId;
	
	@ApiModelProperty(value = "评论者id")
	private String userId;
	
	@ApiModelProperty(value = "评论者姓名")
	private String userName;
	
	@ApiModelProperty(value = "评论者头像")
	private String headImg;
	
	@ApiModelProperty(value = "评论内容")
	private String content;
	
	@ApiModelProperty(value = "评论时间")
	private Date createTime;
	
	@ApiModelProperty(value = "评论来源")
	private String answerTitle;
	
	@ApiModelProperty(value = "回答内容")
	private String answerCont;
	
	@ApiModelProperty(value = "回答id")
	private Integer answerId;
	
	@ApiModelProperty(value = "资源地址")
	private String resourcePath;
	
	@ApiModelProperty(value = "0:图片   1:视频")
	private Integer resourceType;
	
}
