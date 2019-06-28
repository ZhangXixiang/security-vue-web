package com.space.common.dto.star;

import com.space.common.util.DateUtils;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


/**
 * 
* @ClassName: FindForm 
* @Description: 发现form返回字段
* @author lihan 
* @date 2019年1月31日 上午10:41:31 
*
 */
@Getter
@Setter
public class FindShowForm {


    /**
     *项目编号
     */
    private String 	fundCode	="123121";
	 /**
     *项目名称
     */
    private String 	fundName	="官方发布";
    /**
     * 项目总金额
     */
    private String totalAmount;
    /**
     * 发布时间
     */
    private String pubDate= DateUtils.parseDateForStandard(new Date());
    /**
     * 浏览次数
     */
    private String views="111";
 

    /**
     *收藏量
     */
    private String collectionCount="112";


}
