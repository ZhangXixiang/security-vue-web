package com.space.common.dto.dis.follow;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Component
@Data
@ApiModel(value = "FollowReqDto", description = "关注参数实体")
public class FollowReqDto implements Serializable {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "话题ID")
	@NotNull(message = "话题ID不能为空")
	private Integer topicId;
	
	@ApiModelProperty(value = "1:关注   0:取消")
	@NotNull(message = "type不能为空")
	private Integer type;
	
	@JsonIgnore
	private String userId;
	
}
