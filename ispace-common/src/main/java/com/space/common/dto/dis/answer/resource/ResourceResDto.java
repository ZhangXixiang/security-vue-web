package com.space.common.dto.dis.answer.resource;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "ResourceResDto", description = "资源")
public class ResourceResDto implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "资源ID")
	private Integer resourceId;

	@ApiModelProperty(value = "资源地址")
    private String path;

	@ApiModelProperty(value = "0:图片   1:视频")
    private Integer type;
	
	@ApiModelProperty(value = "资源宽度")
	private Float wide;
	
	@ApiModelProperty(value = "资源高度")
	private Float high;
	
}
