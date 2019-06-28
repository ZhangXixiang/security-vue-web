package com.space.common.dto.dis.binner;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "BinnerResDto")
public class BinnerResDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "banner_id")
	private Integer bannerId;

	@ApiModelProperty(value = "图片地址")
    private String path;

}
