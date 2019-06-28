package com.space.common.dto.dis.collect;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Component
@Data
@ApiModel(value = "CollectSerachDto")
public class CollectSerachDto {

	@ApiModelProperty(value = "页码")
	@NotNull(message = "页码不能为空")
	private Integer pageNum;
	
	@ApiModelProperty(value = "每页条数")
	@NotNull(message = "每页大小不能为空")
	private Integer pageSize; 
	
	@JsonIgnore
	private String userId;
	
}
