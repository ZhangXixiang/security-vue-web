package com.space.controller;

import com.alibaba.fastjson.JSONObject;
import com.space.common.dto.model.RestApiModel;
import com.space.common.dto.star.UserForm;
import com.space.common.enums.ResponseStatusCode;
import com.space.common.lp.hsApi.HsMemberService;
import com.space.common.lp.hsApi.req.PersonRegisterForm;
import com.space.common.lp.hsApi.req.UpdateUserImageForm;
import com.space.common.lp.member.*;
import com.space.common.util.OCR_IdCard;
import com.space.common.util.ValidateUtils;
import com.space.common.util.VerifyCodeUtils;
import com.space.service.IMService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;


/**
 * 用户相关
 */
@RestController
@RequestMapping(value = "/starspace/restapi/user", produces = "application/json")
public class UserController extends BaseMobileController{


    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private HsMemberService hsMemberService;

    @Autowired
    private IMService imService;


    /**
     * 登陆接口
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(LoginByAccountRequestReq loginByAccountRequestReq) {
        logger.info("请求登陆接口开始：");
        RestApiModel resultApiModel = new RestApiModel();
        try {
            LoginByAccountRequestRep loginByAccountRequestRep = hsMemberService.LoginByAccountRequest(loginByAccountRequestReq);
           if(loginByAccountRequestRep.getErrorCode() <0){
               resultApiModel.setCodeMessage(ResponseStatusCode.serverError.getCode(),loginByAccountRequestRep.getErrorMessage());
           }else{
               /**请求用户信息*/
               QueryUserInfoRequestReq userReq = new QueryUserInfoRequestReq();
               userReq.setLoginAccount(loginByAccountRequestReq.getLoginAccount());
               QueryUserInfoRequestRep userInfoRep = hsMemberService.QueryUserInfoRequest(userReq);
               if(userInfoRep.getErrorCode() <0){
                   resultApiModel.setCodeMessage(ResponseStatusCode.serverError.getCode(),userInfoRep.getErrorMessage());
               }
               userInfoRep.setSessionId(loginByAccountRequestRep.getSessionId());
               userInfoRep.setUserToken(loginByAccountRequestRep.getUserToken());
               /**
                * 获取即时通讯token
                */
               String account = userInfoRep.getAccount();
               String imToken = imService.getIMTokenByAccount(account);
               userInfoRep.setImToken(imToken);
               resultApiModel.setContent(userInfoRep);
           }
        } catch (Exception e) {
            logger.error("login error message:{},exception:{}", e.getMessage(), e);
            resultApiModel.setCodeMessage(ResponseStatusCode.serverError.getCode(), ResponseStatusCode.serverError.getDesc());
        }
        logger.info("请求登陆接口结束：结果："+ resultApiModel.toJson());
        return resultApiModel.toJson();
    }

    /**
     * 请求pc版注册接口
     * @param personRegisterForm
     * @param response
     * @return
     */
    @RequestMapping(value = "/personRegister", method = RequestMethod.POST)
    public String personRegister(PersonRegisterForm personRegisterForm, HttpServletResponse response) {
        logger.info("请求pc版注册接口开始：");
        RestApiModel resultApiModel = new RestApiModel();
        /**校验参数*/
        if(StringUtils.isBlank(personRegisterForm.getFlowerName()) || StringUtils.isBlank(personRegisterForm.getUserPsw())
                || StringUtils.isBlank(personRegisterForm.getRegChkCode())
                || StringUtils.isBlank(personRegisterForm.getUserPhone())){
            resultApiModel.setCodeMessage(ResponseStatusCode.lostParams.getCode(),ResponseStatusCode.lostParams.getDesc());
        }else if(!ValidateUtils.isMobiPhoneNum(personRegisterForm.getUserPhone())){
            resultApiModel.setCodeMessage(ResponseStatusCode.errerPhoneNum.getCode(),ResponseStatusCode.errerPhoneNum.getDesc());
        }else if(!ValidateUtils.checkUserPwd(personRegisterForm.getUserPsw())){
            resultApiModel.setCodeMessage(ResponseStatusCode.pwdFail.getCode(),ResponseStatusCode.pwdFail.getDesc());
        }
        else {
            try {
                resultApiModel = hsMemberService.personRegister(personRegisterForm);
            } catch (Exception e) {
                logger.error("register error message:{},exception:{}", e.getMessage(), e);
                //错误信息
                resultApiModel.setCodeMessage(ResponseStatusCode.serverError.getCode(), e.getMessage());
            }
        }
        logger.info("请求pc版注册接口结束：结果："+ resultApiModel.toJson());
        response.setHeader("Access-Control-Allow-Origin", "*");
        return resultApiModel.toJson();
    }

    /**
     * 更新用户头像
     * @param updateUserImageForm
     * @param response
     * @return
     */
    @RequestMapping(value = "/UpdateUserImageRequest", method = RequestMethod.POST)
    public String UpdateUserImageRequest(UpdateUserImageForm updateUserImageForm, HttpServletResponse response) {
        logger.info("请求更新头像接口开始：");
        RestApiModel resultApiModel = new RestApiModel();
        /**校验参数*/
        if(StringUtils.isBlank(updateUserImageForm.getAccount()) || StringUtils.isBlank(updateUserImageForm.getImageData())){
            resultApiModel.setCodeMessage(ResponseStatusCode.lostParams.getCode(),ResponseStatusCode.lostParams.getDesc());
        }
        else {
            try {
                resultApiModel = hsMemberService.UpdateUserImageRequest(updateUserImageForm);
            } catch (Exception e) {
                logger.error("register error message:{},exception:{}", e.getMessage(), e);
                resultApiModel.setCodeMessage(ResponseStatusCode.serverError.getCode(), e.getMessage());
            }
        }
        logger.info("请求更新头像接口结束，结果："+ resultApiModel.toJson());
        response.setHeader("Access-Control-Allow-Origin", "*");
        return resultApiModel.toJson();
    }


    /**
     * 用户密码修改接口
      功能说明：用户进行密码修改。
     * @param userResetPwdReq
     * @return
     */
    @RequestMapping(value = "/userChangePwd", method = RequestMethod.POST)
    public String userChangePwd(UserResetPwdReq userResetPwdReq){
        logger.info("用户修改密码接口开始：");
        RestApiModel resultApiModel = new RestApiModel();
        /**校验参数*/
        if(StringUtils.isBlank(userResetPwdReq.getLoginAccount()) || StringUtils.isBlank(userResetPwdReq.getNewPsw())
                ||(StringUtils.isBlank(userResetPwdReq.getOldPsw()) && StringUtils.isBlank(userResetPwdReq.getCheckCode()))){
            resultApiModel.setCodeMessage(ResponseStatusCode.lostParams.getCode(),ResponseStatusCode.lostParams.getDesc());
        }
        if(!ValidateUtils.checkUserPwd(userResetPwdReq.getNewPsw())){
            resultApiModel.setCodeMessage(ResponseStatusCode.pwdFail.getCode(),ResponseStatusCode.pwdFail.getDesc());
        }else {
            resultApiModel = hsMemberService.editPwd(userResetPwdReq);
        }
        logger.info("用户修改密码接口结束，结果："+resultApiModel.toJson());
        return resultApiModel.toJson();
    }

    /**
     * 注册和忘记密码重置密码手机验证码获取接口
      功能说明：用户帐号手机验证获取短信验证码。
     * @param userResetPwdReq
     * @return
     */
    @RequestMapping(value = "/userMobileCode", method = RequestMethod.POST)
    public String userMobileCode(UserResetPwdReq userResetPwdReq, HttpServletResponse response){
        logger.info("手机验证码获取接口开始：");
        RestApiModel resultApiModel = new RestApiModel();
        /**校验参数*/
        if( StringUtils.isBlank(userResetPwdReq.getMobile()) || StringUtils.isBlank(userResetPwdReq.getBizType())){
            resultApiModel.setCodeMessage(ResponseStatusCode.lostParams.getCode(),ResponseStatusCode.lostParams.getDesc());
        }else {
            resultApiModel = hsMemberService.userMobileCodeRequest(userResetPwdReq);
        }
        logger.info("手机验证码获取接口结束，结果："+resultApiModel.toJson());
        response.setHeader("Access-Control-Allow-Origin", "*");
        return resultApiModel.toJson();
    }


    /**
     * 发送验证码接口
     * @param userResetPwdReq
     * @return
     */
    @RequestMapping(value = "/getVerifyCode", method = RequestMethod.POST)
    public String getVerifyCode(UserResetPwdReq userResetPwdReq){
        logger.info("手机号:"+userResetPwdReq.getMobile()+"图形验证码获取接口开始：");
        RestApiModel resultApiModel = new RestApiModel();
        if( StringUtils.isBlank(userResetPwdReq.getMobile()) || !ValidateUtils.isMobiPhoneNum(userResetPwdReq.getMobile())){
            resultApiModel.setCodeMessage(ResponseStatusCode.errerPhoneNum.getCode(),ResponseStatusCode.errerPhoneNum.getDesc());
        }else{
            String verifyCode = VerifyCodeUtils.generateVerifyCode(6);
            resultApiModel.setContent(verifyCode);
        }
        logger.info("图形验证码获取接口结束，结果："+resultApiModel.toJson());
        return resultApiModel.toJson();
    }

    /**
     * 身份证ocr识别
     * @param baseForm
     * @return
     */
    @RequestMapping("/getOcrIdCard")
    public String getOcrIdCard(UserForm baseForm, HttpServletResponse response) {
        try {
            String idFront = baseForm.getIdFront();
            if(StringUtils.isEmpty(idFront)){
                return new RestApiModel(ResponseStatusCode.lostParams).toJson();
            }
            response.setHeader("Access-Control-Allow-Origin", "*");
            Map map = new HashMap();
            Map face = OCR_IdCard.verificationId(idFront, "face");
            logger.info(face.toString());
            String returnMsg = (String)face.get("returnMsg");
            JSONObject jsonObject = JSONObject.parseObject(returnMsg);
            boolean flag = (boolean) jsonObject.get("success");
            if(flag){
                map.put("realName",jsonObject.get("name"));//姓名
                map.put("idNum",jsonObject.get("num")); //身份证号
                RestApiModel restApiModel = new RestApiModel(ResponseStatusCode.success,map);
                return restApiModel.toJson();
            }else {
                RestApiModel restApiModel = new RestApiModel(ResponseStatusCode.idCardFailed);
                return restApiModel.toJson();
            }
        }catch (Exception e){
            return new RestApiModel(ResponseStatusCode.idCardFailed).toJson();
        }

    }

    /**
     * 机构注册
     * @param personRegisterForm
     * @param response
     * @return
     */
    @RequestMapping(value = "AgentRegisterRequest", method = RequestMethod.POST)
    public String agentRegisterRequest(PersonRegisterForm personRegisterForm, HttpServletResponse response) {
        logger.info("请求企业注册接口开始：");
        RestApiModel resultApiModel = new RestApiModel();
        /**校验参数*/
        if(StringUtils.isBlank(personRegisterForm.getFlowerName()) || StringUtils.isBlank(personRegisterForm.getPartFullName())
                || StringUtils.isBlank(personRegisterForm.getSocialCode())
                || StringUtils.isBlank(personRegisterForm.getContacts())){
            resultApiModel.setCodeMessage(ResponseStatusCode.lostParams.getCode(),ResponseStatusCode.lostParams.getDesc());
        }
        else if(!ValidateUtils.isMobiPhoneNum(personRegisterForm.getCellPhone())){
            resultApiModel.setCodeMessage(ResponseStatusCode.errerPhoneNum.getCode(),ResponseStatusCode.errerPhoneNum.getDesc());
        }
        else if(!ValidateUtils.checkUserPwd(personRegisterForm.getUserPsw())){
            resultApiModel.setCodeMessage(ResponseStatusCode.pwdFail.getCode(),ResponseStatusCode.pwdFail.getDesc());
        }
        else {
            try {
                resultApiModel = hsMemberService.agentRegisterRequest(personRegisterForm);
            } catch (Exception e) {
                logger.error("register error message:{},exception:{}", e.getMessage(), e);
                //错误信息
                resultApiModel.setCodeMessage(ResponseStatusCode.serverError.getCode(), e.getMessage());
            }
        }
        logger.info("请求企业注册接口结束：结果："+ resultApiModel.toJson());
        response.setHeader("Access-Control-Allow-Origin", "*");
        return resultApiModel.toJson();
    }

}
