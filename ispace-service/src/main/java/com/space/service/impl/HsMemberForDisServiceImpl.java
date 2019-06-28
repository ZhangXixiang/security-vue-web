package com.space.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.space.common.lp.util.HttpUtil;
import com.space.common.lp.util.SignUtil;
import com.space.common.util.HttpClient;
import com.space.common.util.JsonUtil;
import com.space.mybatis.model.User;
import com.space.service.HsMemberForDisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
@Transactional(readOnly = true)
public class HsMemberForDisServiceImpl implements HsMemberForDisService {

	@Autowired
	private SignUtil signUtil;
	
	/**
	 * 
	 * <p>Title: QueryUserInfoRequest</p>   
	 * <p>Description: 查询个人用户详情信息</p>   
	 * @param accountId:会员编号和会员登录账号至少提供一个
	 * @return   
	 * @see HsMemberForDisService#QueryUserInfoRequest(String)
	 * @author: ThinkPad
	 * @throws Exception 
	 */
	@Override
	public User QueryUserInfoRequest(String accountId) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("platformId", signUtil.getPlatformId());
		paramMap.put("appKey", signUtil.getAppKey());
		paramMap.put("channel", signUtil.QUERYUSERINFOREQUEST);
		paramMap.put("loginAccount", accountId);
		String res = HttpClient.HttpPostWith_form(signUtil.getUrlPath(), paramMap);
		if(res != null){
			JSONObject gson = JSONObject.parseObject(res);
			if(HttpUtil.returnCode_success.equals(gson.get("code"))){
				User user = JsonUtil.jsonStringToObject(gson.get("userInfoBo").toString(), User.class);
				gson = JSONObject.parseObject(gson.get("userInfoBo").toString());
				user.setId(gson.get("userId").toString());
				return user;
			}else{
				throw new Exception("请求恒生接口QueryUserInfoRequest返回值异常");
			}
		}else{
			throw new Exception("请求恒生接口QueryUserInfoRequest返回空值");
		}
	}

}













