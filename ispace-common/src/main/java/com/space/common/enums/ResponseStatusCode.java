package com.space.common.enums;

/**
 * @author lihan
 * @Title: ResponseStatusCode
 * @Description: TODO
 * @date 2018-12-05 18:44
 */
public enum ResponseStatusCode {
    /***********************************00000000 - 00000050 错误码段******************************/
    //短信验证错误码
    success("00000000","操作成功"),
    serverError("10000000","服务器开小差了,请稍后重试吧~"),
    errerSource("10000001","数据来源不正确"),
    errerPhoneNum("10000002","手机号不合法"),
    errerMsgCode("10000003","验证码不正确"),
    fastMsgCode("10000004","验证码还有效呢"),
    lostMsgCode("10000005","验证码不能为空"),
    failureMsgCode("10000006","验证码超时失效"),
    userError("10000007","需要用户登录"),
    lostParams("10000008","参数不全，请检查参数！"),
    hsRetrunNull("10000009","查询恒生返回空！"),
    hsFail("10000010","恒生接口调用失败！"),
    pwdFail("10000011","密码必须为6-15位字母加数字组合！"),
    IMServiceFail("10000012","网易云信服务异常！"),
    IMNoSuchUser("10000013","该用户不存在！"),
    idCardFailed("10000014","ocr识别识别，请重试！"),
    lastNotice("10000015","已是最后一条！"),
    failUrl("10000016","url解析失败！");

    private final String code;
    private final String desc;

    public String getCode() {
        return code;
    }
    public String getDesc() {
        return desc;
    }

    private ResponseStatusCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
