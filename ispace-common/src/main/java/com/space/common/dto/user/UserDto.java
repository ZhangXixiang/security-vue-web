package com.space.common.dto.user;

import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "UserDto", description = "UserDto对象")
public class UserDto implements Serializable {
    
	/**   
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)   
	 */  
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "id")
	private String id;

	@ApiModelProperty(value = "唯一值")
    private String account;

	@ApiModelProperty(value = "名称")
    private String name;
	
	private Date time;
	
}