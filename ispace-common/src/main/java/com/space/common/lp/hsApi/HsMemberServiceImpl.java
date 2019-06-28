package com.space.common.lp.hsApi;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.space.common.dto.model.RestApiModel;
import com.space.common.enums.ResponseStatusCode;
import com.space.common.lp.exception.GHException;
import com.space.common.lp.hsApi.req.*;
import com.space.common.lp.member.*;
import com.space.common.lp.util.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.security.PrivateKey;
import java.util.HashMap;
import java.util.Map;


@Service
@Slf4j
public class HsMemberServiceImpl implements HsMemberService{

	@Autowired
	HttpUtil httpUtil;
	@Autowired
	SignUtil sign;
	//平台ID
	@Value("${hshuiyuan.status:0}")
	private  String hsStatus;
	// 是否对接恒生登记结算系统0：不对接，1：对接
	@Value("${hshuiyuan.isConnectIpodreg:0}")
	private String isConnectIpodreg;

	@Value("${defaultlHeadImg}")
	private String defaultlHeadImg;
	@Value("${prefixHeadImg}")
	private String prefixHeadImg;

	@Override
	public QueryCompInfoRequestRep QueryCompInfoRequest(
			QueryCompInfoRequestReq infoReq) {
	QueryCompInfoRequestRep infoRep = new QueryCompInfoRequestRep();
	Map<String,Object> paramMap = new HashMap<String, Object>();
	if(infoReq==null){
		infoRep.setErrorCode(-1);
		infoRep.setErrorMessage("请求参数不能为空");
		return infoRep;
	}
	if(infoReq.getOptCompCode()!=null) {
		paramMap.put("optCompCode", infoReq.getOptCompCode());
	}
	if(infoReq.getSocialCode()!=null) {
		paramMap.put("socialCode", infoReq.getSocialCode());
	}
	if(infoReq.getOptCompCode() == null && infoReq.getSocialCode() == null){
		infoRep.setErrorCode(-1);
		infoRep.setErrorMessage("企业编号和统一社会信用编码不能都为空");
		return infoRep;
	}
	//参数加签
	paramMap.put("sign", sign.genSignTJS(paramMap));
	String rep = httpUtil.doPostTJS(paramMap,sign.QUERYCOMPINFOREQUEST);
	log.info("恒生企业信息查询返回："+ JSON.toJSONString(rep));
	if(rep==null){
		infoRep.setErrorCode(-1);
		infoRep.setErrorMessage("企业信息查询，恒生返回空");
	}
	JSONObject gson = JSONObject.parseObject(rep);
		if(HttpUtil.returnCode_success.equals(gson.get("code"))){
			if(gson.get("companyInfoBo")!=null){
				Map<String, String> map = (Map) gson.get("companyInfoBo");
				infoRep.setAccount(map.get("account"));
				infoRep.setName(map.get("name"));
				infoRep.setUserId(map.get("userId"));
				infoRep.setSocialCode(map.get("socialCode"));

				infoRep.setOrgEmail(map.get("orgEmail"));
				infoRep.setOrgAddress(map.get("orgAddress"));
				infoRep.setContacts(map.get("contacts"));
				infoRep.setCellPhone(map.get("cellPhone"));
				infoRep.setLegalRepr(map.get("legalRepr"));
				log.info("企业信息查询返回："+ JSON.toJSONString(infoRep));
			}else{
				infoRep.setErrorCode(-1);
				infoRep.setErrorMessage("企业信息查询，恒生返回空");
			}

		}else{
			infoRep.setErrorCode(-1);
			infoRep.setErrorMessage(gson.get("result")!=null?(String)gson.get("result"):null);
		}
		return infoRep;
	}

	/**
	 * 查询个人信息
	 * @param userReq
	 * @return
	 */
	@Override
	public QueryUserInfoRequestRep QueryUserInfoRequest(
			QueryUserInfoRequestReq userReq) {
		QueryUserInfoRequestRep userRep = new QueryUserInfoRequestRep();
		Map<String,Object> paramMap = new HashMap<String, Object>();
		if(userReq==null){
			userRep.setErrorCode(-1);
			userRep.setErrorMessage("请求参数不能为空");
			return userRep;
		}
		if(userReq.getLoginAccount() == null && userReq.getUserId() == null){
			userRep.setErrorCode(-1);
			userRep.setErrorMessage("会员账号和会员编号不能都为空");
			return userRep;
		}
		if(userReq.getLoginAccount()!=null) {
			paramMap.put("loginAccount", userReq.getLoginAccount());
		}
		if(userReq.getUserId()!=null){
			paramMap.put("userId", userReq.getUserId());
		}
		//参数加签
		//paramMap.put("sign", sign.genSignTJS(paramMap));
		String rep = httpUtil.doPostTJS(paramMap,sign.QUERYUSERINFOREQUEST);
		log.info("恒生个人信息查询返回："+rep);
		if(rep==null){
			userRep.setErrorCode(-1);
			userRep.setErrorMessage("企业信息查询，恒生返回空");
			return userRep;
		}
		JSONObject gson = JSONObject.parseObject(rep);
			if(HttpUtil.returnCode_success.equals(gson.get("code"))){
				if(gson.get("userInfoBo")!=null){
					Map<String, String> map = (Map) gson.get("userInfoBo");
					userRep.setUserId(map.get("userId"));
					userRep.setAccount(map.get("account"));
					userRep.setName(map.get("name"));
					userRep.setFlowerName(map.get("flowerName"));
					userRep.setGender(map.get("gender"));
					userRep.setCertificatesId(map.get("certificatesId"));
					userRep.setCellPhone(map.get("cellPhone"));
					if(StringUtils.isBlank(map.get("headImg"))){
						userRep.setHeadImg(defaultlHeadImg);
					}else {
						userRep.setHeadImg(prefixHeadImg+map.get("headImg"));
					}

					// 非必返回的
					userRep.setPartCategories(map.containsKey("partCategories")?map.get("partCategories"):null);
					userRep.setIsOperator(map.containsKey("isOperator")?map.get("isOperator"):null);
					userRep.setOptCompCode(map.containsKey("optCompCode")?map.get("optCompCode"):null);
					userRep.setOptCode(map.containsKey("optCode")?map.get("optCode"):null);
					userRep.setOptCompName(map.containsKey("optCompName")?map.get("optCompName"):null);
              		userRep.setOptName(map.containsKey("optName")?map.get("optName"):null);
              		userRep.setSocialCode(map.containsKey("socialCode")?map.get("socialCode"):null);



				}else{
					userRep.setErrorCode(-1);
					userRep.setErrorMessage("企业信息查询，恒生返回空");
				}

			}else{
				userRep.setErrorCode(-1);
				userRep.setErrorMessage(gson.get("result")!=null?(String)gson.get("result"):null);
			}
			return userRep;
	}

	@Override
	public LoginByAccountRequestRep LoginByAccountRequest(LoginByAccountRequestReq loginReq) {
		LoginByAccountRequestRep loginRep = new LoginByAccountRequestRep();
		Map<String,Object> paramMap = new HashMap<String, Object>();
		if(loginReq==null){
			loginRep.setErrorCode(-1);
			loginRep.setErrorMessage("请求参数不能为空");
			return loginRep;
		}
		if(StringUtils.isBlank(loginReq.getUserPhone()) && loginReq.getLoginAccount()==null && loginReq.getUserPsw()==null){
			loginRep.setErrorCode(-1);
			loginRep.setErrorMessage("登陆用户名或密码不能为空");
			return loginRep;
		}
		/**
		 * 登录方式，01 为快捷登录，02 为密码登录
		 */
		if(StringUtils.isNotBlank(loginReq.getSmsCode())) {   //当验证码不为空时  快捷登录
			paramMap.put("userPhone", loginReq.getUserPhone());
			paramMap.put("smsCode", loginReq.getSmsCode());
			paramMap.put("loginType", "01");
		}else {
			paramMap.put("loginAccount", loginReq.getLoginAccount());
			paramMap.put("userPsw", EncryptAndSign.encryptBasedRSA(loginReq.getUserPsw(), sign.getPublicKeyHS()));
			//paramMap.put("userPsw", loginReq.getUserPsw());
			paramMap.put("loginType", "02");
		}

		String rep = httpUtil.doPostTJS(paramMap,sign.LOGINBYACCOUNTREQUEST, HttpUtil.HEADER_CONTENT_TYPE_FORM);
		log.info("恒生用户登陆返回："+ JSON.toJSONString(rep));
		if(rep==null){
			loginRep.setErrorCode(-1);
			loginRep.setErrorMessage("恒生登录返回为空");
			return loginRep;
		}
		JSONObject gson = JSONObject.parseObject(rep);
		if(HttpUtil.returnCode_success.equals(gson.get("code"))){
			loginRep.setErrorCode(0);
			loginRep.setSessionId(gson.get("sessionId").toString());
			loginRep.setUserToken(gson.get("userToken").toString());
		}
		/*else if(HttpUtil.login_success.equals(gson.get("code"))) {
			loginRep.setErrorCode(1);
		}*/
		else{
			loginRep.setErrorCode(-1);
			loginRep.setErrorMessage(gson.get("result")!=null?(String)gson.get("result"):null);
		}
		return loginRep;
	}

	@Override
	public boolean checkHsApiStatus() {
		//根据配置查询是否调用恒生接口
		return true;
	}

	/**
	 * 恒生注册接口
	 */
	@Override
	public UserRegisterRequestRep UserRegisterRequest(InvestorBaseAccountAddReq req) {
		UserRegisterRequestRep resp = new UserRegisterRequestRep();
		Map<String,Object> paramMap = new HashMap<String, Object>();
		paramMap.put("userPhone", req.getUserAcc());  //注册手机号
		if(StringUtils.isNotBlank(req.getVericode())) {  //短信验证码
			paramMap.put("regChkCode", req.getVericode());
		}
		//如果有密码  则先加密密码
		if(StringUtils.isNotBlank(req.getUserPwd())) {
			paramMap.put("userPsw", EncryptAndSign.encryptBasedRSA(req.getUserPwd(), sign.getPublicKeyHS()));
		}
		//参数加签
		paramMap.put("sign", sign.genSignTJS(paramMap));
		log.info("恒生个人注册请求："+ JSON.toJSONString(paramMap));
		String rep = new String();
		try {
			rep =  httpUtil.doPostTJS(paramMap,sign.USERREGISTERREQUEST);
		} catch (Exception e) {
			log.error("接口调用异常");
			throw new GHException("接口调用异常");
		}
		log.info("恒生个人注册返回："+rep);
		if(StringUtils.isBlank(rep)){
			log.error("接口返回信息为空");
			throw new GHException("接口返回信息为空");
		}
		JSONObject resJson = JSONObject.parseObject(rep);
		if(HttpUtil.returnCode_success.equals(resJson.get("code"))){
			Map<String, String> userInfoBo = (Map<String, String>)resJson.get("registerBo");
			if(userInfoBo!=null){
				resp.setAccount(userInfoBo.get("account"));
				resp.setUserPhone(userInfoBo.get("userPhone"));
				resp.setUserName(userInfoBo.get("userName"));
			}else{
				log.error("接口返回个人信息为空");
				throw new GHException("接口返回个人信息为空");
			}
		}else{
			//log.error(resJson.get("result")!=null?(String)resJson.get("result"):"接口调用异常");
			throw new GHException(resJson.get("result")!=null?(String)resJson.get("result"):"接口调用异常");
		}
		return resp;
	}


	@Override
	public RestApiModel userMobileCodeRequest(UserResetPwdReq userResetPwdReq) {
		RestApiModel restApiModel = new RestApiModel();
		Map<String,Object> paramMap = new HashMap<String, Object>();
		paramMap.put("mobile", userResetPwdReq.getMobile());
		if("forget".equals(userResetPwdReq.getBizType())) {
			paramMap.put("loginAccount", userResetPwdReq.getLoginAccount());
			paramMap.put("forgetType", userResetPwdReq.getForgetType());
		}
		paramMap.put("bizType", userResetPwdReq.getBizType());
		//paramMap.put("sign", sign.genSignTJS(paramMap));
		//参数加签
		log.info("恒生发送短信请求："+ JSON.toJSONString(paramMap));
		String rep = new String();
		try {
			rep =  httpUtil.doPostTJS(paramMap,sign.USERMOBILECODEREQUEST, HttpUtil.HEADER_CONTENT_TYPE_FORM);
		} catch (Exception e) {
			log.error("接口调用异常");
			restApiModel.setCodeMessage(ResponseStatusCode.hsFail.getCode(),ResponseStatusCode.hsFail.getDesc());
			//throw new GHException("接口调用异常");
		}
		log.info("恒生发送短信返回："+rep);
		if(StringUtils.isBlank(rep)){
			log.error("恒生发送短信返回信息为空");
			restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
			//throw new GHException("恒生发送短信返回信息为空");
		}
		JSONObject resJson = JSONObject.parseObject(rep);
		if(!HttpUtil.returnCode_success.equals(resJson.get("code"))){
			log.error(resJson.get("result")!=null?(String)resJson.get("result"):"恒生发送短信调用异常");
			restApiModel.setCodeMessage(ResponseStatusCode.hsFail.getCode(),resJson.get("result")!=null?(String)resJson.get("result"):ResponseStatusCode.hsFail.getDesc());
			//throw new GHException(resJson.get("result")!=null?(String)resJson.get("result"):"恒生发送短信调用异常");
		}
		return restApiModel;
	}

	@Override
	public void SendMessageRequest(String mobile) {
		Map<String,Object> paramMap = new HashMap<String, Object>();
		paramMap.put("userPhone", mobile);
		paramMap.put("sign", sign.genSignTJS(paramMap));
		//参数加签
		log.info("恒生发送短信请求："+ JSON.toJSONString(paramMap));
		String rep = new String();
		try {
			rep =  httpUtil.doPostTJS(paramMap,sign.SENDMESSAGEREQUEST);
		} catch (Exception e) {
			log.error("接口调用异常");
			 throw new GHException("接口调用异常");
		}
		log.info("恒生发送短信返回："+rep);
		if(StringUtils.isBlank(rep)){
			log.error("恒生发送短信返回信息为空");
			 throw new GHException("恒生发送短信返回信息为空");
		}
		JSONObject resJson = JSONObject.parseObject(rep);
		if(!HttpUtil.returnCode_success.equals(resJson.get("code"))){
			log.error(resJson.get("result")!=null?(String)resJson.get("result"):"恒生发送短信调用异常");
			 throw new GHException(resJson.get("result")!=null?(String)resJson.get("result"):"恒生发送短信调用异常");
		}
	}

	/**
	 * 修改密码
	 * @param userResetPwdReq
	 * @return
	 */
	@Override
	public RestApiModel editPwd(UserResetPwdReq userResetPwdReq) {
		RestApiModel restApiModel = new RestApiModel();
		Map<String,Object> paramMap = new HashMap<String, Object>();
		paramMap.put("loginAccount", userResetPwdReq.getLoginAccount());
		paramMap.put("pwdType", userResetPwdReq.getPwdType());
		paramMap.put("newPsw", EncryptAndSign.encryptBasedRSA(userResetPwdReq.getNewPsw(), sign.getPublicKeyHS()));
		if(!StringUtils.isBlank(userResetPwdReq.getOldPsw())){
			paramMap.put("oldPsw", EncryptAndSign.encryptBasedRSA(userResetPwdReq.getOldPsw(), sign.getPublicKeyHS()));
		}else {
			paramMap.put("checkCode", userResetPwdReq.getCheckCode());
		}
		//参数加签
		log.info("恒生修改密码请求："+ JSON.toJSONString(paramMap));
		String rep = new String();
		try {
			rep =  httpUtil.doPostTJS(paramMap,sign.USERCHANGEPWDREQUEST);
		} catch (Exception e) {
			log.error("接口调用异常");
			restApiModel.setCodeMessage(ResponseStatusCode.hsFail.getCode(),ResponseStatusCode.hsFail.getDesc());
			//throw new GHException("接口调用异常");
		}
		log.info("恒生修改密码返回："+rep);
		if(StringUtils.isBlank(rep)){
			log.error("恒生修改密码返回信息为空");
			restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
			 //throw new GHException("恒生修改密码返回信息为空");
		}
		JSONObject resJson = JSONObject.parseObject(rep);
		if(!HttpUtil.returnCode_success.equals(resJson.get("code"))){
			log.error(resJson.get("result")!=null?(String)resJson.get("result"):"恒生修改密码调用异常");
			restApiModel.setCodeMessage(ResponseStatusCode.hsFail.getCode(),resJson.get("result")!=null?(String)resJson.get("result"):ResponseStatusCode.hsFail.getDesc());
			// throw new GHException(resJson.get("result")!=null?(String)resJson.get("result"):"恒生修改密码调用异常");
		}
		return restApiModel;
	}

	/**
	 * 用户手机密码重置接口
	  功能说明：用户使用验证手机获取密码。 通过短信，发送用户密码到
	 用户手机（由于密码不是明文存储，所以发送一个自动生成的密码）
	 * @param userResetPwdReq
	 * @return
	 */
	@Override
	public RestApiModel resetPwd(UserResetPwdReq userResetPwdReq) {
		RestApiModel restApiModel = new RestApiModel();
		Map<String,Object> paramMap = new HashMap<String, Object>();
		paramMap.put("loginAccount", userResetPwdReq.getLoginAccount());
		paramMap.put("phoneKey", userResetPwdReq.getCheckCode());
		paramMap.put("pwdType", userResetPwdReq.getPwdType());

		//参数加签
		log.info("恒生密码重置请求："+ JSON.toJSONString(paramMap));
		String rep = new String();
		try {
			rep =  httpUtil.doPostTJS(paramMap,sign.USERRESETPWDREQUEST);
		} catch (Exception e) {
			log.error("接口调用异常");
			restApiModel.setCodeMessage(ResponseStatusCode.hsFail.getCode(),ResponseStatusCode.hsFail.getDesc());
			//throw new GHException("接口调用异常");
		}
		log.info("恒生密码重置返回："+rep);
		if(StringUtils.isBlank(rep)){
			log.error("恒生密码重置返回信息为空");
			restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
			//throw new GHException("恒生修改密码返回信息为空");
		}
		JSONObject resJson = JSONObject.parseObject(rep);
		if(!HttpUtil.returnCode_success.equals(resJson.get("code"))){
			log.error(resJson.get("result")!=null?(String)resJson.get("result"):"恒生密码重置调用异常");
			restApiModel.setCodeMessage(ResponseStatusCode.hsFail.getCode(),resJson.get("result")!=null?(String)resJson.get("result"):ResponseStatusCode.hsFail.getDesc());
			// throw new GHException(resJson.get("result")!=null?(String)resJson.get("result"):"恒生修改密码调用异常");
		}
		return restApiModel;
	}

	@Override
	public void CheckUserPhoneRequest(String userPhone) {
		Map<String,Object> paramMap = new HashMap<String, Object>();
		paramMap.put("userPhone", userPhone);
		//参数加签
		log.info("恒生发送短信请求："+ JSON.toJSONString(paramMap));
		String rep = new String();
		try {
			rep =  httpUtil.doPostTJS(paramMap,sign.CHECKUSERPHONEREQUEST,HttpUtil.HEADER_CONTENT_TYPE_FORM);
		} catch (Exception e) {
			log.error("接口调用异常");
			 throw new GHException("接口调用异常");
		}
		log.info("恒生校验是否注册返回："+rep);
		if(StringUtils.isBlank(rep)){
			log.error("恒生校验是否注册返回信息为空");
			 throw new GHException("恒生校验是否注册返回信息为空");
		}
		JSONObject resJson = JSONObject.parseObject(rep);
		if(!HttpUtil.returnCode_success.equals(resJson.get("code"))){
			log.error(resJson.get("result")!=null?(String)resJson.get("result"):"恒生校验是否注册返回异常");
			 throw new GHException(resJson.get("result")!=null?(String)resJson.get("result"):"恒生校验是否注册返回异常");
		}
	}

	@Override
	public void certificationRequest(String account,String idCard,String realName) {
		Map<String,Object> paramMap = new HashMap<String, Object>();
		paramMap.put("account", account);
		paramMap.put("certNo", idCard);
		paramMap.put("userName", realName);
		paramMap.put("sign", sign.genSignTJS(paramMap));
		//参数加签
		log.info("恒生实名认证请求："+ JSON.toJSONString(paramMap));
		String rep = new String();
		try {
			rep =  httpUtil.doPostTJS(paramMap,sign.CERTIFICATIONREQUEST,HttpUtil.HEADER_CONTENT_TYPE_FORM);
		} catch (Exception e) {
			log.error("恒生实名认证接口调用异常");
		}
		log.info("恒生实名认证返回："+rep);
		if(StringUtils.isBlank(rep)){
			log.error("恒生实名认证册返回信息为空");
		}
		JSONObject resJson = JSONObject.parseObject(rep);
		if(!HttpUtil.returnCode_success.equals(resJson.get("code"))){
			log.error(resJson.get("result")!=null?(String)resJson.get("result"):"恒生实名认证返回异常");
		}
	}

	/**
	 * 投资人名册同步接口
	 *
	 * @param req
	 * @return
	 */
	@Override
	public BaseResp receiveInvestorRequest(ReceiveInvestorReq req) {
		return null;
	}


	/**
	 * 是否对接恒生登记结算系统
	 *
	 * @return
	 */
	@Override
	public boolean isConnectIpodreg() {
		return true;
	}

	/**
	 * 修改注册手机号
	 * @param account
	 * @param oldUserPhone
	 * @param newUserPhone
	 */
	@Override
	public void userChangeCellPhoneRequest(String account, String oldUserPhone, String newUserPhone) {
		Map<String,Object> paramMap = new HashMap<String, Object>();
		paramMap.put("account", account);
		paramMap.put("oldUserPhone", oldUserPhone);
		paramMap.put("newUserPhone", newUserPhone);
		paramMap.put("sign", sign.genSignTJS(paramMap));
		//参数加签
		log.info("修改手机号请求："+ JSON.toJSONString(paramMap));
		String rep = new String();
		try {
			rep =  httpUtil.doPostTJS(paramMap,sign.USERCHANGECELLPHONEREQUEST,HttpUtil.HEADER_CONTENT_TYPE_FORM);
		} catch (Exception e) {
			log.error("恒生实名认证接口调用异常");
		}
		log.info("更换手机号返回："+rep);
		if(StringUtils.isBlank(rep)){
			log.error("恒生更换手机号返回信息为空");
		}
		JSONObject resJson = JSONObject.parseObject(rep);
		if(!HttpUtil.returnCode_success.equals(resJson.get("code"))){
			log.error(resJson.get("result")!=null?(String)resJson.get("result"):"更换手机号异常");
			throw new GHException(resJson.get("result")!=null?(String)resJson.get("result"):"更换手机号异常");
		}
	}

	/**
	 * 用户注册
	 * 根据pc端个人注册方式提供个人会员注册接口。
	 *
	 * @param personRegisterForm
	 */
	@Override
	public RestApiModel personRegister(PersonRegisterForm personRegisterForm) {
		RestApiModel restApiModel = new RestApiModel();
		Map<String,Object> paramMap = new HashMap<String, Object>();
		paramMap.put("userPsw", EncryptAndSign.encryptBasedRSA(personRegisterForm.getUserPsw(), sign.getPublicKeySpace()));
		paramMap.put("userPhone",personRegisterForm.getUserPhone());
		paramMap.put("regChkCode",personRegisterForm.getRegChkCode());
		paramMap.put("flowerName",personRegisterForm.getFlowerName());
		if(!StringUtils.isBlank(personRegisterForm.getParentAgentUser())){
			paramMap.put("parentAgentUser",personRegisterForm.getParentAgentUser());
		}
		String rep = httpUtil.doPostSpace(paramMap,sign.PERSONREGISTERREQUEST);
		log.info("恒生用户注册返回："+rep);
		if(rep==null){
			restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
			return restApiModel;
		}
		JSONObject gson = JSONObject.parseObject(rep);
		if(HttpUtil.returnCode_success.equals(gson.get("code"))){
			if(gson.get("registerBo")!=null){
				Map<String, String> map = (Map) gson.get("registerBo");
				restApiModel.setContent(map);
			}else{
				restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
				return restApiModel;
			}
		}else{
			restApiModel.setCodeMessage(ResponseStatusCode.hsFail.getCode(),gson.get("result")!=null?(String)gson.get("result"):null);
			return restApiModel;
		}
		return restApiModel;
	}

	/**
	 * 更新头像
	 *
	 * @param updateUserImageForm
	 */
	@Override
	public RestApiModel UpdateUserImageRequest(UpdateUserImageForm updateUserImageForm) {
		RestApiModel restApiModel = new RestApiModel();
		Map<String,Object> paramMap = new HashMap<String, Object>();
		String account = updateUserImageForm.getAccount();
		paramMap.put("account",account);
		paramMap.put("imageData",updateUserImageForm.getImageData());
		String rep = httpUtil.doPostSpace(paramMap,sign.UPDATEUSERIMAGEREQUEST);
		log.info("恒生更新头像返回："+rep);
		if(rep==null){
			restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
			return restApiModel;
		}
		JSONObject gson = JSONObject.parseObject(rep);
		if(HttpUtil.returnCode_success.equals(gson.get("code"))){
			/**保存图片到本地服务器，这里还需要研究，登录的时候存比较好，调用hs接口查询用户信息返回头像url即可*/
			/**请求用户信息*/
			QueryUserInfoRequestReq userReq = new QueryUserInfoRequestReq();
			userReq.setLoginAccount(account);
			QueryUserInfoRequestRep userInfoRep = QueryUserInfoRequest(userReq);
			if(userInfoRep.getErrorCode() <0){
				restApiModel.setCodeMessage(ResponseStatusCode.serverError.getCode(),userInfoRep.getErrorMessage());
			}
			String url = userInfoRep.getHeadImg();
			restApiModel.setContent(url);
		}else{
			restApiModel.setCodeMessage(ResponseStatusCode.hsFail.getCode(),gson.get("result")!=null?(String)gson.get("result"):null);
			return restApiModel;
		}
		return restApiModel;
	}

	/**
	 * 机构注册
	 *
	 * @param personRegisterForm
	 * @return
	 */
	@Override
	public RestApiModel agentRegisterRequest(PersonRegisterForm personRegisterForm) {
		RestApiModel restApiModel = new RestApiModel();
		Map<String,Object> paramMap = new HashMap<String, Object>();
		paramMap.put("userPsw", EncryptAndSign.encryptBasedRSA(personRegisterForm.getUserPsw(), sign.getPublicKeySpace()));
		paramMap.put("cellPhone",personRegisterForm.getCellPhone());
		paramMap.put("partFullName",personRegisterForm.getPartFullName());
		paramMap.put("flowerName",personRegisterForm.getFlowerName());
		paramMap.put("socialCode",personRegisterForm.getSocialCode());
		paramMap.put("legalRepr",personRegisterForm.getLegalRepr());
		paramMap.put("orgAddress",personRegisterForm.getOrgAddress());
		paramMap.put("orgEmail",personRegisterForm.getOrgEmail());
		paramMap.put("contacts",personRegisterForm.getContacts());
		if(!StringUtils.isBlank(personRegisterForm.getCompType())){
			paramMap.put("compType",personRegisterForm.getCompType());
		}
		String rep = httpUtil.doPostTJS(paramMap,sign.AGENTREGISTERREQUEST);
		log.info("恒生企业注册返回："+rep);
		if(rep==null){
			restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
			return restApiModel;
		}
		JSONObject gson = JSONObject.parseObject(rep);
		if(HttpUtil.returnCode_success.equals(gson.get("code"))){
			if(gson.get("registerBo")!=null){
				Map<String, String> map = (Map) gson.get("registerBo");
				restApiModel.setContent(map);
			}else{
				restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
				return restApiModel;
			}
		}else{
			restApiModel.setCodeMessage(ResponseStatusCode.hsFail.getCode(),gson.get("result")!=null?(String)gson.get("result"):null);
			return restApiModel;
		}
		return restApiModel;
	}

	/**
	 * 请求恒生接口获取当前日期的平台访问量
	 *
	 * @param day
	 * @return
	 */
	@Override
	public int QueryTodayAccessNum(String day) {
		String rep = httpUtil.doGetRes(sign.getHsAccNumUrl()+day);
		log.info("恒生今日访问量返回："+rep);
		if(rep==null){
			return 0;
		}
		JSONObject gson = JSONObject.parseObject(rep);
        int data = (Integer)gson.get("data");
        return data;
	}

	public static void main(String[] args) {

		String urlPath="http://ipoducuat.tjfae.com/service";
		String privateKeyPath="D:/hsTest/private.pfx";
		String privatePassWord="123456";
		SignUtil signUtil = new SignUtil();
		HttpUtil httpUtil = new HttpUtil();
		Map<String,Object> paramMap = new HashMap<String, Object>();
		paramMap.put("account", "1811190001");
		paramMap.put("oldUserPhone", "17777777771");
		paramMap.put("newUserPhone", "17700000001");

		paramMap.put("platformId","2e2302818a996993c08f2f07c9606e79");
		paramMap.put("appKey", "web");
    	String sign = "";
    	try {
			String sortPramData = signUtil.sortMap(paramMap);
			if (StringUtils.startsWith(sortPramData, "&")){
				sortPramData = sortPramData.substring(1);
			}
			System.out.println("生成签名排序后的参数："+sortPramData);
			String pfxPath = privateKeyPath;
			String priKeyPass = privatePassWord;
			PrivateKey privateKey = RsaReadUtil.getPrivateKeyFromFile(pfxPath,priKeyPass);
			sign = RSAUtils.signTJS(sortPramData.getBytes(), privateKey);
		} catch (Exception e) {
			e.printStackTrace();
		}

		paramMap.put("sign", sign);
		//参数加签
		System.out.println("修改手机号请求："+ JSON.toJSONString(paramMap));
		String rep = new String();
		try {
			paramMap.put("channel", signUtil.USERCHANGECELLPHONEREQUEST);
			rep = httpUtil.sendPostHC(urlPath, paramMap, HttpUtil.HEADER_CONTENT_TYPE_FORM);
		} catch (Exception e) {
			System.out.println("恒生实名认证接口调用异常");
		}
		System.out.println("更换手机号返回："+rep);
		if(StringUtils.isBlank(rep)){
			System.out.println("恒生更换手机号返回信息为空");
		}
		JSONObject resJson = JSONObject.parseObject(rep);
		if(!HttpUtil.returnCode_success.equals(resJson.get("code"))){
			System.out.println(resJson.get("result")!=null?(String)resJson.get("result"):"更换手机号异常");
			throw new GHException(resJson.get("result")!=null?(String)resJson.get("result"):"更换手机号异常");
		}
	}
}
