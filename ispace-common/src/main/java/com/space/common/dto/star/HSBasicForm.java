package com.space.common.dto.star;

import lombok.Getter;
import lombok.Setter;

/**
 * 请求恒生接口参数基类
 */
@Setter
@Getter
public class HSBasicForm {

    /**
     * 交易方式
     */
    private String tradeType;
    private String platformId;
    private String appKey;
    private String channel;

    private String certNo;
    private String userName;
    private String frontData;
    private String backData;
    private String ocrCertNo;
    private String ocrUserName;
    private String checkcode;
    private String modifyEmail;
    private String flag;
    private String questionId1;
    private String answer1;
    private String questionId2;
    private String answer2;
    private String publishAccount;
    private String code;
    private String chkCode;
    private String activeCode;

    /**
     * 偏移值
     */
    private String offset;

    /**
     * 每次请求的条数
     */
    private String perpage;

    /**
     * 排序字段
     */
    private String orderBy;

    /**
     *登录账号
     */
    private String ownerAccout;

    private String loginAccount;

    /**
     * 项目编号
     */
    private String productCode;

    /**
     * 当前登录账户
     */
    private String account;


    /**
     * 排序规则
     */
    private String orderAsc;

    /**
     * 项目ID
     */
    private String fundId;

    /**
     * 业务id
     */
    private String id;

    /**
     * 当前站内信id
     */
    private String Id;

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
     * 提交内容 留言内容
     */
    private String commentText;

    /**
     * 是否提交 是否匿名
     */
    private String isAnonymous;
    /**
     * 接收人账号登录账号
     */
    private String receiverAccount;

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

    /**
     * 资产类型
     */
    private String fundType;
    /**
     * 基础资产类型
     */
    private String baseAssetType;

    /**
     * 资产类型   private_enterprise_assets：民营企业资产|stateowned_asset：国有资产|personal_asset：个人资产
     *留言类型
     */
    private String projectType;

    /**
     * 资产金额
     */
    private String totalAmount;

    /**
     * 项目名称模糊值
     */
    private String fundNameLike;

    /**
     * 省
     */
    private String province;

    /**
     * 省份ID
     */
    private String proId;

    /**
     * 市
     */
    private String location;
    /**
     * 标的所在市
     */
    private String city;

    /**
     * 项目状态
     */
    private String status;

    /**
     * 产品名称模糊值
     */
    private String productNameLike;

    /**
     * 信息发布方
     */
    private String publisherAccount;

    /**
     * 留言人账号
     */
    private String messageAccount;
    /**
     * 业务类型
     */
    private String type;
    /**
     * 业务类型 撮合项目：asset_mardeal
     资产交易：asset_trade
     */
    private String bizType;
    /**
     * 培训、会议id
     */
    private String bizId;
    /**
     * 业务id
     */
    private String biz_id;
    /**
     * 业务ID
     */
    private String targetId;

    /**
     * 花名
     */
    private String flowerName;

    /**
     * 路演主题
     */
    private String topic;
    /**
     * 开始时间
     */
    private String startTime;
    private String endTime;
    private String knowTheme;
    private String knowPlate;
    private String contentLabel;
    private String knowCode;
    private String isShowAtt;
    private String businessId;
    private String businessType;
    private String intentUserName;
    private String idNo;
    private String mobile;
    private String sex;
    private String company;
    private String job;
    private String address;
    private String telephone;
    private String email;
    private String fax;
    private String isLive;
    private String fileId;
    private String fileUrl;
    private String conferenceId;
    private String fundName;
    private String indexVal1;
    private String indexVal2;
    private String indexVal3;
    private String replyId;//回复评论的id
    private String theme;//主题
    private String mode;//onLine:线上，Live:直播，offLine:线下  不传则查全部

    private String userPsw;
    private String userPhone;
    private String regChkCode;
    private String parentAgentUser;

}
