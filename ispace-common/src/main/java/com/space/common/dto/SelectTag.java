package com.space.common.dto;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;
import org.springframework.stereotype.Component;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Component
@Data
@ApiModel(value = "SelectTag", description = "SelectTag对象")
public class SelectTag {

	@ApiModelProperty(value = "页码")
	@NotNull(message = "页码不能为空")
	private Integer pageNum;
	
	@ApiModelProperty(value = "每页数据条数")
	@NotNull(message = "每页大小不能为空")
	private Integer pageSize; 
	
	@ApiModelProperty(value = "排序字段")
	private String tag; 
	
	@ApiModelProperty(value = "排序方式")
	private String type;
	
	@ApiModelProperty(value = "json格式的键值对，key取值看具体接口描述。value为查询值。key与value类型为String")
	private Map<String, String> search = new HashMap<String, String>(); 
	
	/*@ApiModelProperty(value = "时间")
	@JsonDeserialize(using = JsonDateDeserializer.class) 
	private Date time;*/
	
}
