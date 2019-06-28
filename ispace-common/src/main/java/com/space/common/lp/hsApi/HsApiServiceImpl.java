package com.space.common.lp.hsApi;

import com.alibaba.fastjson.JSONObject;
import com.space.common.dto.model.RestApiModel;
import com.space.common.dto.star.BasicForm;
import com.space.common.enums.ResponseStatusCode;
import com.space.common.lp.util.HttpUtil;
import com.space.common.lp.util.SignUtil;
import com.space.common.util.ValidateUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Service
@Slf4j
public class HsApiServiceImpl implements HsApiService{

	@Autowired
	HttpUtil httpUtil;
	@Autowired
	SignUtil sign;


	/**
	 * 3.12我的发布资产交易
	 */
	@Override
	public RestApiModel QueryMyAssertProductListRequest(BasicForm basicForm) {
		RestApiModel restApiModel = new RestApiModel();
		Map<String,Object> paramMap = new HashMap<String, Object>();
		paramMap.put("account",basicForm.getOwnerAccout());
		if(ValidateUtils.checkZhengDigit(basicForm.getCurrPage())){
			paramMap.put("offset","1");
		}else{
			paramMap.put("offset",basicForm.getCurrPage());
		}
		if(ValidateUtils.checkZhengDigit(basicForm.getPageSize())){
			paramMap.put("perpage",basicForm.getPageSize());
		}else {
			paramMap.put("perpage","5");
		}
		if(!StringUtils.isBlank(basicForm.getIsOperator())){
			paramMap.put("isOperator",basicForm.getIsOperator());
		}
		if(!StringUtils.isBlank(basicForm.getOptCompCode())){
			paramMap.put("optCompCode",basicForm.getOptCompCode());
		}
		if(!StringUtils.isBlank(basicForm.getOptCode())){
			paramMap.put("optCode",basicForm.getOptCode());
		}
		//参数加签
		//paramMap.put("sign", sign.genSignTJS(paramMap));
		String rep = httpUtil.doPostTJS(paramMap,sign.QUERYMYASSERTPRODUCTLISTREQUEST);
		log.info("恒生我的发布资产交易查询返回："+rep);
		if(rep==null){
			restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
			return restApiModel;
		}
		JSONObject gson = JSONObject.parseObject(rep);
		if(HttpUtil.returnCode_success.equals(gson.get("code"))){
			if(gson.get("tcProductBoList")!=null){
				Map<String, String> map = (Map) gson.get("tcProductBoList");
				restApiModel.setContent(map);

			}else{
				restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
				return restApiModel;
			}
			restApiModel.setKeyAndValue("currentPage",gson.get("currentPage"));
			restApiModel.setKeyAndValue("totalItem",gson.get("totalItem"));
		}else{
			restApiModel.setCodeMessage(ResponseStatusCode.hsFail.getCode(),gson.get("result")!=null?(String)gson.get("result"):null);
			return restApiModel;
		}
		return restApiModel;
	}

    /**
     * 3.13我的足迹 ：查询我访问过的撮合项目和机构项目
     *
     * @param basicForm
     * @return
     */
    @Override
    public RestApiModel queryMyFootprintRequest(BasicForm basicForm) {
        RestApiModel restApiModel = new RestApiModel();
        Map<String,Object> paramMap = new HashMap<String, Object>();
        paramMap.put("account",basicForm.getOwnerAccout());
		if(ValidateUtils.checkZhengDigit(basicForm.getCurrPage())){
			paramMap.put("offset","1");
		}else{
			paramMap.put("offset",basicForm.getCurrPage());
		}
		if(ValidateUtils.checkZhengDigit(basicForm.getPageSize())){
			paramMap.put("perpage",basicForm.getPageSize());
		}else {
			paramMap.put("perpage","5");
		}
		if(!StringUtils.isBlank(basicForm.getIsOperator())){
			paramMap.put("isOperator",basicForm.getIsOperator());
		}
		if(!StringUtils.isBlank(basicForm.getOptCompCode())){
			paramMap.put("optCompCode",basicForm.getOptCompCode());
		}
		if(!StringUtils.isBlank(basicForm.getOptCode())){
			paramMap.put("optCode",basicForm.getOptCode());
		}
        String rep = httpUtil.doPostTJS(paramMap,sign.QUERYMYFOOTPRINTREQUEST);
        log.info("恒生我的足迹查询返回："+rep);
        if(rep==null){
            restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
            return restApiModel;
        }
        JSONObject gson = JSONObject.parseObject(rep);
        if(HttpUtil.returnCode_success.equals(gson.get("code"))){
            if(gson.get("myFootBo")!=null){
                Map<String, String> map = (Map) gson.get("myFootBo");
                restApiModel.setContent(map);
            }else{
                restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
                return restApiModel;
            }
            restApiModel.setKeyAndValue("currentPage",gson.get("currentPage"));
            restApiModel.setKeyAndValue("totalItem",gson.get("totalItem"));
        }else{
            restApiModel.setCodeMessage(ResponseStatusCode.hsFail.getCode(),gson.get("result")!=null?(String)gson.get("result"):null);
            return restApiModel;
        }
        return restApiModel;
    }

	/**
	 * 3.1.	我的关注（林茜）
	 * 	功能说明：分页查询我收藏的撮合列表信息，每个项目包含总浏览量和总收藏量，支持项目发布时间倒序以及项目总金额倒序查询。
	 *
	 * @param basicForm
	 * @return
	 */
	@Override
	public RestApiModel queryMyCollectionFundinfoListRequest(BasicForm basicForm) {
		RestApiModel restApiModel = new RestApiModel();
		Map<String,Object> paramMap = new HashMap<String, Object>();
		paramMap.put("account",basicForm.getOwnerAccout());
		if(ValidateUtils.checkZhengDigit(basicForm.getCurrPage())){
			paramMap.put("offset","1");
		}else{
			paramMap.put("offset",basicForm.getCurrPage());
		}
		if(ValidateUtils.checkZhengDigit(basicForm.getPageSize())){
			paramMap.put("perpage",basicForm.getPageSize());
		}else {
			paramMap.put("perpage","5");
		}
		if(!StringUtils.isBlank(basicForm.getIsOperator())){
			paramMap.put("isOperator",basicForm.getIsOperator());
		}
		if(!StringUtils.isBlank(basicForm.getOptCompCode())){
			paramMap.put("optCompCode",basicForm.getOptCompCode());
		}
		if(!StringUtils.isBlank(basicForm.getOptCode())){
			paramMap.put("optCode",basicForm.getOptCode());
		}
		if(!StringUtils.isBlank(basicForm.getOrderBy())){
			paramMap.put("orderBy",basicForm.getOrderBy());
		}
		if(!StringUtils.isBlank(basicForm.getOrderAsc())){
			paramMap.put("orderAsc",basicForm.getOrderAsc());
		}
		//参数加签
		//paramMap.put("sign", sign.genSignTJS(paramMap));
		String rep = httpUtil.doPostTJS(paramMap,sign.QUERYMYCOLLECTIONFUNDINFOLISTREQUEST);
		log.info("恒生我的关注查询返回："+rep);
		if(rep==null){
			restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
			return restApiModel;
		}
		JSONObject gson = JSONObject.parseObject(rep);
		if(HttpUtil.returnCode_success.equals(gson.get("code"))){

				Map<String, String> map = (Map) gson.get("mdFundInfoBo");
				restApiModel.setContent(map);

			restApiModel.setKeyAndValue("currentPage",gson.get("currentPage"));
			restApiModel.setKeyAndValue("totalItem",gson.get("totalItem"));
		}else{
			restApiModel.setCodeMessage(ResponseStatusCode.hsFail.getCode(),gson.get("result")!=null?(String)gson.get("result"):null);
			return restApiModel;
		}
		return restApiModel;
	}

	/**
	 * 3.5.	资产交易详情（丁烁）
	 * 	功能说明：根据项目ID查询资产交易的详细信息。
	 *
	 * @param basicForm
	 * @return
	 */
	@Override
	public RestApiModel queryAssertProductInfoRequest(BasicForm basicForm) {
		RestApiModel restApiModel = new RestApiModel();
		Map<String,Object> paramMap = new HashMap<String, Object>();
		paramMap.put("productId",basicForm.getId());
		//参数加签
		//paramMap.put("sign", sign.genSignTJS(paramMap));
		String rep = httpUtil.doPostTJS(paramMap,sign.QUERYASSERTPRODUCTINFOREQUEST);
		log.info("恒生资产交易详情查询返回："+rep);
		if(rep==null){
			restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
			return restApiModel;
		}
		JSONObject gson = JSONObject.parseObject(rep);
		if(HttpUtil.returnCode_success.equals(gson.get("code"))){
			if(gson.get("tcProductInfo")!=null){
				Map<String, String> map = (Map) gson.get("tcProductInfo");
				restApiModel.setContent(map);
			}else{
				restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
				return restApiModel;
			}
			//restApiModel.setKeyAndValue("currentPage",gson.get("currentPage"));
			restApiModel.setKeyAndValue("totalItem",gson.get("totalItem"));
		}else{
			restApiModel.setCodeMessage(ResponseStatusCode.hsFail.getCode(),gson.get("result")!=null?(String)gson.get("result"):null);
			return restApiModel;
		}
		return restApiModel;
	}

	/**
	 * 3.6.	项目留言查阅（袁勇）
	 * 	功能说明：由于pc端暂无资产交易的留言功能，目前只提供撮合项目的留言查阅功能。
	 *
	 * @param basicForm
	 * @return
	 */
	@Override
	public RestApiModel messageQueryRequest(BasicForm basicForm) {
		RestApiModel restApiModel = new RestApiModel();
		Map<String,Object> paramMap = new HashMap<String, Object>();
		paramMap.put("account",basicForm.getOwnerAccout());
		paramMap.put("type",basicForm.getType());
		paramMap.put("id",basicForm.getId());
		if(ValidateUtils.checkZhengDigit(basicForm.getCurrPage())){
			paramMap.put("offset","1");
		}else{
			paramMap.put("offset",basicForm.getCurrPage());
		}
		if(ValidateUtils.checkZhengDigit(basicForm.getPageSize())){
			paramMap.put("perpage",basicForm.getPageSize());
		}else {
			paramMap.put("perpage","5");
		}
		if(!StringUtils.isBlank(basicForm.getIsOperator())){
			paramMap.put("isOperator",basicForm.getIsOperator());
		}
		if(!StringUtils.isBlank(basicForm.getOptCompCode())){
			paramMap.put("optCompCode",basicForm.getOptCompCode());
		}
		if(!StringUtils.isBlank(basicForm.getOptCode())){
			paramMap.put("optCode",basicForm.getOptCode());
		}
		//参数加签
		//paramMap.put("sign", sign.genSignTJS(paramMap));
		String rep = httpUtil.doPostTJS(paramMap,sign.MESSAGEQUERYREQUEST);
		log.info("恒生项目留言查阅查询返回："+rep);
		if(rep==null){
			restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
			return restApiModel;
		}
		JSONObject gson = JSONObject.parseObject(rep);
		if(HttpUtil.returnCode_success.equals(gson.get("code"))){
			if(gson.get("MessageBo")!=null){
				Map<String, String> map = (Map) gson.get("MessageBo");
				restApiModel.setContent(map);

			}else{
				restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
				return restApiModel;
			}
			restApiModel.setKeyAndValue("currentPage",gson.get("currentPage"));
			restApiModel.setKeyAndValue("totalItem",gson.get("totalItem"));
		}else{
			restApiModel.setCodeMessage(ResponseStatusCode.hsFail.getCode(),gson.get("result")!=null?(String)gson.get("result"):null);
			return restApiModel;
		}
		return restApiModel;
	}

	/**
	 * 3.7.	项目留言提交（袁勇）
	 * 	功能说明：由于pc端暂无资产交易的留言功能，目前只提供撮合项目的留言提交功能
	 *
	 * @param basicForm
	 * @return
	 */
	@Override
	public RestApiModel messageSubmitRequest(BasicForm basicForm) {
		RestApiModel restApiModel = new RestApiModel();
		Map<String,Object> paramMap = new HashMap<String, Object>();
		paramMap.put("account",basicForm.getOwnerAccout());
		paramMap.put("type",basicForm.getType());
		paramMap.put("biz_id",basicForm.getId());
		paramMap.put("commentText",basicForm.getCommentText());
		if(!StringUtils.isBlank(basicForm.getIsOperator())){
			paramMap.put("isOperator",basicForm.getIsOperator());
		}
		if(!StringUtils.isBlank(basicForm.getOptCompCode())){
			paramMap.put("optCompCode",basicForm.getOptCompCode());
		}
		if(!StringUtils.isBlank(basicForm.getOptCode())){
			paramMap.put("optCode",basicForm.getOptCode());
		}
		if(!StringUtils.isBlank(basicForm.getIsAnonymous())){
			paramMap.put("isAnonymous",basicForm.getIsAnonymous());
		}
		//参数加签
		//paramMap.put("sign", sign.genSignTJS(paramMap));
		String rep = httpUtil.doPostTJS(paramMap,sign.MESSAGEQUERYREQUEST);
		log.info("恒生项目留言提交返回："+rep);
		if(rep==null){
			restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
			return restApiModel;
		}
		JSONObject gson = JSONObject.parseObject(rep);
		if(!HttpUtil.returnCode_success.equals(gson.get("code"))){
			restApiModel.setCodeMessage(ResponseStatusCode.hsFail.getCode(),gson.get("result")!=null?(String)gson.get("result"):null);
		}
		return restApiModel;
	}

	/**
	 * 3.8.	项目评分查阅（胡晓阳）
	 * 	功能说明：根据项目类别查询项目评分情况，支持撮合项目、资产交易项目的评分情况查阅。评分均为5分制（PC端已按照5分制处理）
	 *
	 * @param basicForm
	 * @return
	 */
	@Override
	public RestApiModel getScoreInfoRequest(BasicForm basicForm) {
		RestApiModel restApiModel = new RestApiModel();
		Map<String,Object> paramMap = new HashMap<String, Object>();
		paramMap.put("loginAccount",basicForm.getOwnerAccout());
		paramMap.put("bizType",basicForm.getType());
		paramMap.put("targetId",basicForm.getId());
		//参数加签
		//paramMap.put("sign", sign.genSignTJS(paramMap));
		String rep = httpUtil.doPostTJS(paramMap,sign.GETSCOREINFOREQUEST);
		log.info("恒生项目评分查阅查询返回："+rep);
		if(rep==null){
			restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
			return restApiModel;
		}
		JSONObject gson = JSONObject.parseObject(rep);
		if(HttpUtil.returnCode_success.equals(gson.get("code"))){
			if(gson.get("crmScoreBo")!=null){
				Map<String, String> map = (Map) gson.get("crmScoreBo");
				restApiModel.setContent(map);
			}else{
				restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
				return restApiModel;
			}
			/*restApiModel.setKeyAndValue("currentPage",gson.get("currentPage"));
			restApiModel.setKeyAndValue("totalItem",gson.get("totalItem"));*/
		}else{
			restApiModel.setCodeMessage(ResponseStatusCode.hsFail.getCode(),gson.get("result")!=null?(String)gson.get("result"):null);
			return restApiModel;
		}
		return restApiModel;
	}

	/**
	 * 3.9.	项目评分提交（胡晓阳）
	 * 	功能说明：针对撮合项目和机构项目可以进行项目评分，并通过接口提交到后台保存
	 *
	 * @param basicForm
	 * @return
	 */
	@Override
	public RestApiModel postScoreInfoRequest(BasicForm basicForm) {
		RestApiModel restApiModel = new RestApiModel();
		Map<String,Object> paramMap = new HashMap<String, Object>();
		paramMap.put("loginAccount",basicForm.getOwnerAccout());
		paramMap.put("bizType",basicForm.getType());
		paramMap.put("targetId",basicForm.getId());
		paramMap.put("commentText",basicForm.getCommentText());
		paramMap.put("indexPrice",basicForm.getIndexPrice());
		paramMap.put("indexQuality",basicForm.getIndexQuality());
		paramMap.put("indexDetail",basicForm.getIndexDetail());
		//参数加签
		//paramMap.put("sign", sign.genSignTJS(paramMap));
		String rep = httpUtil.doPostTJS(paramMap,sign.POSTSCOREINFOREQUEST);
		log.info("恒生项目评分提交返回："+rep);
		if(rep==null){
			restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
			return restApiModel;
		}
		JSONObject gson = JSONObject.parseObject(rep);
		if(!HttpUtil.returnCode_success.equals(gson.get("code"))){
			restApiModel.setCodeMessage(ResponseStatusCode.hsFail.getCode(),gson.get("result")!=null?(String)gson.get("result"):null);
		}
		return restApiModel;
	}

	/**
	 * 3.11.我的发布撮合（林茜）
	 * 	功能说明：分页查询所有我发布的撮合项目列表信息，支持发布时间倒序以及金额倒序查询，用户需要登录，传用户账号。
	 *
	 * @param basicForm
	 * @return
	 */
	@Override
	public RestApiModel queryMyInfomationListRequest(BasicForm basicForm) {
		RestApiModel restApiModel = new RestApiModel();
		Map<String,Object> paramMap = new HashMap<String, Object>();
		paramMap.put("account",basicForm.getOwnerAccout());
		if(ValidateUtils.checkZhengDigit(basicForm.getCurrPage())){
			paramMap.put("offset","1");
		}else{
			paramMap.put("offset",basicForm.getCurrPage());
		}
		if(ValidateUtils.checkZhengDigit(basicForm.getPageSize())){
			paramMap.put("perpage",basicForm.getPageSize());
		}else {
			paramMap.put("perpage","5");
		}
		if(!StringUtils.isBlank(basicForm.getIsOperator())){
			paramMap.put("isOperator",basicForm.getIsOperator());
		}
		if(!StringUtils.isBlank(basicForm.getOptCompCode())){
			paramMap.put("optCompCode",basicForm.getOptCompCode());
		}
		if(!StringUtils.isBlank(basicForm.getOptCode())){
			paramMap.put("optCode",basicForm.getOptCode());
		}
		if(!StringUtils.isBlank(basicForm.getOrderBy())){
			paramMap.put("orderBy",basicForm.getOrderBy());
		}
		if(!StringUtils.isBlank(basicForm.getOrderAsc())){
			paramMap.put("orderAsc",basicForm.getOrderAsc());
		}
		//参数加签
		//paramMap.put("sign", sign.genSignTJS(paramMap));
		String rep = httpUtil.doPostTJS(paramMap,sign.QUERYMYINFOMATIONLISTREQUEST);
		log.info("恒生我的发布撮合 返回："+rep);
		if(rep==null){
			restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
			return restApiModel;
		}
		JSONObject gson = JSONObject.parseObject(rep);
		if(HttpUtil.returnCode_success.equals(gson.get("code"))){
			if(gson.get("mdFundInfoBo")!=null){
				Map<String, String> map = (Map) gson.get("mdFundInfoBo");
				restApiModel.setContent(map);

			}else{
				restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
				return restApiModel;
			}
			restApiModel.setKeyAndValue("currentPage",gson.get("currentPage"));
			restApiModel.setKeyAndValue("totalItem",gson.get("totalItem"));
		}else{
			restApiModel.setCodeMessage(ResponseStatusCode.hsFail.getCode(),gson.get("result")!=null?(String)gson.get("result"):null);
			return restApiModel;
		}
		return restApiModel;
	}

	/**
	 * 3.14.	我的访客（胡晓阳）
	 * 	功能说明：访问过我发布的撮合项目和机构项目的人员信息。
	 *
	 * @param basicForm
	 * @return
	 */
	@Override
	public RestApiModel querymyVisitorRequest(BasicForm basicForm) {
		RestApiModel restApiModel = new RestApiModel();
		Map<String,Object> paramMap = new HashMap<String, Object>();
		paramMap.put("account",basicForm.getOwnerAccout());
		if(ValidateUtils.checkZhengDigit(basicForm.getCurrPage())){
			paramMap.put("offset","1");
		}else{
			paramMap.put("offset",basicForm.getCurrPage());
		}
		if(ValidateUtils.checkZhengDigit(basicForm.getPageSize())){
			paramMap.put("perpage",basicForm.getPageSize());
		}else {
			paramMap.put("perpage","5");
		}
		if(!StringUtils.isBlank(basicForm.getIsOperator())){
			paramMap.put("isOperator",basicForm.getIsOperator());
		}
		if(!StringUtils.isBlank(basicForm.getOptCompCode())){
			paramMap.put("optCompCode",basicForm.getOptCompCode());
		}
		if(!StringUtils.isBlank(basicForm.getOptCode())){
			paramMap.put("optCode",basicForm.getOptCode());
		}
		//参数加签
		//paramMap.put("sign", sign.genSignTJS(paramMap));
		String rep = httpUtil.doPostTJS(paramMap,sign.QUERYMYVISITORREQUEST);
		log.info("恒生我的访客返回："+rep);
		if(rep==null){
			restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
			return restApiModel;
		}
		JSONObject gson = JSONObject.parseObject(rep);
		if(HttpUtil.returnCode_success.equals(gson.get("code"))){
			if(gson.get("myVisitorBo")!=null){
				Map<String, String> map = (Map) gson.get("myVisitorBo");
				restApiModel.setContent(map);

			}else{
				restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
				return restApiModel;
			}
			restApiModel.setKeyAndValue("currentPage",gson.get("currentPage"));
			restApiModel.setKeyAndValue("totalItem",gson.get("totalItem"));
		}else{
			restApiModel.setCodeMessage(ResponseStatusCode.hsFail.getCode(),gson.get("result")!=null?(String)gson.get("result"):null);
			return restApiModel;
		}
		return restApiModel;
	}

	/**
	 * 3.15.我的留言列表（袁勇，留言维度待确认）
	 * 	功能说明：分页查询我对撮合项目的留言列表情况。
	 *
	 * @param basicForm
	 * @return
	 */
	@Override
	public RestApiModel projectWithMessageListRequest(BasicForm basicForm) {
		RestApiModel restApiModel = new RestApiModel();
		Map<String,Object> paramMap = new HashMap<String, Object>();
		paramMap.put("account",basicForm.getOwnerAccout());
		paramMap.put("type",basicForm.getType());
		if(ValidateUtils.checkZhengDigit(basicForm.getCurrPage())){
			paramMap.put("offset","1");
		}else{
			paramMap.put("offset",basicForm.getCurrPage());
		}
		if(ValidateUtils.checkZhengDigit(basicForm.getPageSize())){
			paramMap.put("perpage",basicForm.getPageSize());
		}else {
			paramMap.put("perpage","5");
		}
		if(!StringUtils.isBlank(basicForm.getIsOperator())){
			paramMap.put("isOperator",basicForm.getIsOperator());
		}
		if(!StringUtils.isBlank(basicForm.getOptCompCode())){
			paramMap.put("optCompCode",basicForm.getOptCompCode());
		}
		if(!StringUtils.isBlank(basicForm.getOptCode())){
			paramMap.put("optCode",basicForm.getOptCode());
		}
		//参数加签
		//paramMap.put("sign", sign.genSignTJS(paramMap));
		String rep = httpUtil.doPostTJS(paramMap,sign.PROJECTWITHMESSAGELISTREQUEST);
		log.info("恒生我的留言列表返回："+rep);
		if(rep==null){
			restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
			return restApiModel;
		}
		JSONObject gson = JSONObject.parseObject(rep);
		if(HttpUtil.returnCode_success.equals(gson.get("code"))){
			if(gson.get("ProjectMessageBo")!=null){
				Map<String, String> map = (Map) gson.get("ProjectMessageBo");
				restApiModel.setContent(map);
			}else{
				restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
				return restApiModel;
			}
			restApiModel.setKeyAndValue("currentPage",gson.get("currentPage"));
			restApiModel.setKeyAndValue("totalItem",gson.get("totalItem"));
		}else{
			restApiModel.setCodeMessage(ResponseStatusCode.hsFail.getCode(),gson.get("result")!=null?(String)gson.get("result"):null);
			return restApiModel;
		}
		return restApiModel;
	}

	/**
	 * 3.17.	观看历史列表（袁勇）
	 * 	功能说明：查询会议培训、路演、知识学院浏览情况列表，二级详情页面暂时不做
	 *
	 * @param basicForm
	 * @return
	 */
	@Override
	public RestApiModel queryViewRecordPageRequest(BasicForm basicForm) {
		RestApiModel restApiModel = new RestApiModel();
		Map<String,Object> paramMap = new HashMap<String, Object>();
		paramMap.put("account",basicForm.getOwnerAccout());
		if(ValidateUtils.checkZhengDigit(basicForm.getCurrPage())){
			paramMap.put("offset","1");
		}else{
			paramMap.put("offset",basicForm.getCurrPage());
		}
		if(ValidateUtils.checkZhengDigit(basicForm.getPageSize())){
			paramMap.put("perpage",basicForm.getPageSize());
		}else {
			paramMap.put("perpage","5");
		}
		if(!StringUtils.isBlank(basicForm.getIsOperator())){
			paramMap.put("isOperator",basicForm.getIsOperator());
		}
		if(!StringUtils.isBlank(basicForm.getOptCompCode())){
			paramMap.put("optCompCode",basicForm.getOptCompCode());
		}
		if(!StringUtils.isBlank(basicForm.getOptCode())){
			paramMap.put("optCode",basicForm.getOptCode());
		}
		//参数加签
		//paramMap.put("sign", sign.genSignTJS(paramMap));
		String rep = httpUtil.doPostTJS(paramMap,sign.QUERYVIEWRECORDPAGEREQUEST);
		log.info("恒生观看历史列表返回："+rep);
		if(rep==null){
			restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
			return restApiModel;
		}
		JSONObject gson = JSONObject.parseObject(rep);
		if(HttpUtil.returnCode_success.equals(gson.get("code"))){
			if(gson.get("recordBoList")!=null){
				Map<String, String> map = (Map) gson.get("recordBoList");
				restApiModel.setContent(map);
			}else{
				restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
				return restApiModel;
			}
			restApiModel.setKeyAndValue("currentPage",gson.get("currentPage"));
			restApiModel.setKeyAndValue("totalItem",gson.get("totalItem"));
		}else{
			restApiModel.setCodeMessage(ResponseStatusCode.hsFail.getCode(),gson.get("result")!=null?(String)gson.get("result"):null);
			return restApiModel;
		}
		return restApiModel;
	}

	/**
	 * 3.18.	离线空间列表（袁勇）
	 * 	功能说明：查询会议培训、路演、知识学院参与情况列表，二级详情页面暂时不做。
	 *
	 * @param basicForm
	 * @return
	 */
	@Override
	public RestApiModel queryJoinRecordPageRequest(BasicForm basicForm) {
		RestApiModel restApiModel = new RestApiModel();
		Map<String,Object> paramMap = new HashMap<String, Object>();
		paramMap.put("account",basicForm.getOwnerAccout());
		if(ValidateUtils.checkZhengDigit(basicForm.getCurrPage())){
			paramMap.put("offset","1");
		}else{
			paramMap.put("offset",basicForm.getCurrPage());
		}
		if(ValidateUtils.checkZhengDigit(basicForm.getPageSize())){
			paramMap.put("perpage",basicForm.getPageSize());
		}else {
			paramMap.put("perpage","5");
		}
		if(!StringUtils.isBlank(basicForm.getIsOperator())){
			paramMap.put("isOperator",basicForm.getIsOperator());
		}
		if(!StringUtils.isBlank(basicForm.getOptCompCode())){
			paramMap.put("optCompCode",basicForm.getOptCompCode());
		}
		if(!StringUtils.isBlank(basicForm.getOptCode())){
			paramMap.put("optCode",basicForm.getOptCode());
		}
		//参数加签
		//paramMap.put("sign", sign.genSignTJS(paramMap));
		String rep = httpUtil.doPostTJS(paramMap,sign.QUERYJOINRECORDPAGEREQUEST);
		log.info("恒生离线空间列表返回："+rep);
		if(rep==null){
			restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
			return restApiModel;
		}
		JSONObject gson = JSONObject.parseObject(rep);
		if(HttpUtil.returnCode_success.equals(gson.get("code"))){
			if(gson.get("RecordBo")!=null){
				Map<String, String> map = (Map) gson.get("RecordBo");
				restApiModel.setContent(map);
			}else{
				restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
				return restApiModel;
			}
			restApiModel.setKeyAndValue("currentPage",gson.get("currentPage"));
			restApiModel.setKeyAndValue("totalItem",gson.get("totalItem"));
		}else{
			restApiModel.setCodeMessage(ResponseStatusCode.hsFail.getCode(),gson.get("result")!=null?(String)gson.get("result"):null);
			return restApiModel;
		}
		return restApiModel;
	}

	/**
	 * 3.19.	站内信列表（林茜）
	 * 	功能说明：分页查询我的所有站内信列表情况。
	 *
	 * @param basicForm
	 * @return
	 */
	@Override
	public RestApiModel queryMsgPageRequest(BasicForm basicForm) {
		RestApiModel restApiModel = new RestApiModel();
		Map<String,Object> paramMap = new HashMap<String, Object>();
		paramMap.put("account",basicForm.getOwnerAccout());
		if(ValidateUtils.checkZhengDigit(basicForm.getCurrPage())){
			paramMap.put("offset","1");
		}else{
			paramMap.put("offset",basicForm.getCurrPage());
		}
		if(ValidateUtils.checkZhengDigit(basicForm.getPageSize())){
			paramMap.put("perpage",basicForm.getPageSize());
		}else {
			paramMap.put("perpage","5");
		}
		if(!StringUtils.isBlank(basicForm.getIsOperator())){
			paramMap.put("isOperator",basicForm.getIsOperator());
		}
		if(!StringUtils.isBlank(basicForm.getOptCompCode())){
			paramMap.put("optCompCode",basicForm.getOptCompCode());
		}
		if(!StringUtils.isBlank(basicForm.getOptCode())){
			paramMap.put("optCode",basicForm.getOptCode());
		}
		//参数加签
		//paramMap.put("sign", sign.genSignTJS(paramMap));
		String rep = httpUtil.doPostTJS(paramMap,sign.QUERYMSGPAGEREQUEST);
		log.info("恒生站内信列表返回："+rep);
		if(rep==null){
			restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
			return restApiModel;
		}
		JSONObject gson = JSONObject.parseObject(rep);
		if(HttpUtil.returnCode_success.equals(gson.get("code"))){
			if(gson.get("myMsgBo")!=null){
				Map<String, String> map = (Map) gson.get("myMsgBo");
				restApiModel.setContent(map);
			}else{
				restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
				return restApiModel;
			}
			restApiModel.setKeyAndValue("currentPage",gson.get("currentPage"));
			restApiModel.setKeyAndValue("totalItem",gson.get("totalItem"));
		}else{
			restApiModel.setCodeMessage(ResponseStatusCode.hsFail.getCode(),gson.get("result")!=null?(String)gson.get("result"):null);
			return restApiModel;
		}
		return restApiModel;
	}

	/**
	 * 3.21.获取省份接口
	 * 	功能说明：获取省份数据
	 * @return
	 */
	@Override
	public RestApiModel getProvinceData() {
		RestApiModel restApiModel = new RestApiModel();
		Map<String,Object> paramMap = new HashMap<String, Object>();
		//参数加签
		//paramMap.put("sign", sign.genSignTJS(paramMap));
		String rep = httpUtil.doPostTJS(paramMap,sign.GETPROVINCEDATAREQUEST);
		log.info("恒生获取省份接口返回："+rep);
		if(rep==null){
			restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
			return restApiModel;
		}
		JSONObject gson = JSONObject.parseObject(rep);
		if(HttpUtil.returnCode_success.equals(gson.get("code"))){
			if(gson.get("provinceList")!=null){
				Map<String, String> map = (Map) gson.get("provinceList");
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
	 * 3.22.	根据省份获取市区接口
	 * 	功能说明：获取省份数据。
	 *
	 * @param basicForm
	 * @return
	 */
	@Override
	public RestApiModel getCityData(BasicForm basicForm) {
		RestApiModel restApiModel = new RestApiModel();
		Map<String,Object> paramMap = new HashMap<String, Object>();
		paramMap.put("proId",basicForm.getId());
		//参数加签
		//paramMap.put("sign", sign.genSignTJS(paramMap));
		String rep = httpUtil.doPostTJS(paramMap,sign.GETCITYDATAREQUEST);
		log.info("恒生根据省份获取市区接口返回："+rep);
		if(rep==null){
			restApiModel.setCodeMessage(ResponseStatusCode.hsRetrunNull.getCode(),ResponseStatusCode.hsRetrunNull.getDesc());
			return restApiModel;
		}
		JSONObject gson = JSONObject.parseObject(rep);
		if(HttpUtil.returnCode_success.equals(gson.get("code"))){
			if(gson.get("cityList")!=null){
				Map<String, String> map = (Map) gson.get("cityList");
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

}
