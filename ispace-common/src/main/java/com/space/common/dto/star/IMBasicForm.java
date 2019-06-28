package com.space.common.dto.star;

import com.space.common.lp.hsApi.req.BaseResp;
import lombok.Getter;
import lombok.Setter;

/**
 * 请求参数基类
 */
@Setter
@Getter
public class IMBasicForm  extends BaseResp {

    /**
     * 类别类型  （1直接加好友，2请求加好友，3同意加好友，4拒绝加好友）
     */
    private String type;

    /**
     *登录账号
     */
    private String account;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 名字  /花名
     */
    private String name;

    private String imToken;

    /**
     * 加好友对应的请求消息，第三方组装，最长256字符
     */
    private String msg;

}
