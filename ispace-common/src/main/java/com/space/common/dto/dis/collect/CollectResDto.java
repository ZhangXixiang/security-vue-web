package com.space.common.dto.dis.collect;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
@Data
@ApiModel(value = "CollectResDto")
public class CollectResDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "点赞者姓名")
	private String userName;
	
	@ApiModelProperty(value = "点赞者头像")
	private String headImg;
	
	@ApiModelProperty(value = "点赞者id")
	private String userId;
	
	@ApiModelProperty(value = "点赞时间")
	private Date createTime;
	
	@ApiModelProperty(value = "点赞者来源")
	private String answerTitle;
	
	@ApiModelProperty(value = "文章")
	private String cont;
	
	@ApiModelProperty(value = "1：点赞   2：收藏")
	private Integer collectType;
	
	@ApiModelProperty(value = "0:图片   1:视频")
	private Integer resourceType;
	
	@ApiModelProperty(value = "资源地址")
	private String resourcePath;
	
	@ApiModelProperty(value = "回答id")
	private Integer answerId;
	
}
