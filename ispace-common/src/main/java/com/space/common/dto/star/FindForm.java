package com.space.common.dto.star;

import lombok.Getter;
import lombok.Setter;

/**
 * 
* @ClassName: FindForm 
* @Description: 发现接口接收参数form
* @author lihan 
* @date 2019年2月1日 下午3:30:46 
*
 */
@Getter
@Setter
public class FindForm {

	/**每次请求的条数**/
	private String perpage;
	/**每次请求的条数**/
	private String orderBy;
	/**
	 * 升序：asc 降序：desc
	 */
	private String orderAsc;
	
	
}
