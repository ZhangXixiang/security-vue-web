package com.space.common.dto.dis.collect;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Component
@Data
@ApiModel(value = "CollectReqDto")
public class CollectReqDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@NotNull(message = "回答ID不能为空")
	@ApiModelProperty(value = "回答ID")
	private Integer answerId;
	
	@NotNull(message = "type不能为空")
	@ApiModelProperty(value = "1：点赞   2：收藏")
	private Integer type;

	@NotNull(message = "action不能为空")
	@ApiModelProperty(value = "1：新增   2：取消")
	private Integer action;
	
	@JsonIgnore
	private String userId;

}
