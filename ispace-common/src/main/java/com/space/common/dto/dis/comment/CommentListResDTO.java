package com.space.common.dto.dis.comment;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CommentListResDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer commentId;
	
	private String userId;
	
	private String userName;
	
	private String headImg;
	
	private String content;

	private String topicName;

	private Date createTime;
	
	private String answerTitle;
	
	private String answerCont;
	
	private Integer answerId;
	
	private String resourcePath;
	
	private Integer resourceType;

	private Date uT;

	private Integer isDeleted;

	private String uP;
}
