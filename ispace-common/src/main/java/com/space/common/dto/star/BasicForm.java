package com.space.common.dto.star;

import lombok.Getter;
import lombok.Setter;

/**
 * 请求参数基类
 */
@Setter
@Getter
public class BasicForm {

    /**
     * 类别类型
     */
    private String type;

    /**
     * 当前页
     */
    private String currPage;

    /**
     * 一页多少条
     */
    private String pageSize;

    /**
     *登录账号
     */
    private String ownerAccout;

    /**
     *排序字段
     */
    private String orderBy;

    /**
     * 排序规则
     */
    private String orderAsc;

    /**
     * id,业务id
     */
    private String id;

    /**
     * 是否是操作员，统一会员个人信息查阅返回属性
     */
    private String isOperator;

    /**
     * 绑定的企业账号，统一会员个人信息查阅返回属性
     */
    private String optCompCode;

    /**
     *绑定的操作员账号	  统一会员个人信息查阅返回属性
     */
    private String optCode;

    /**
     * 提交内容
     */
    private String commentText;

    /**
     * 是否提交
     */
    private String isAnonymous;

    /**
     * 	项目价格评分
     */
    private String indexPrice;
    /**
     * 资产质量评分
     */
    private String indexQuality;
    /**
     * 描述清晰度评分
     */
    private String indexDetail;

}
