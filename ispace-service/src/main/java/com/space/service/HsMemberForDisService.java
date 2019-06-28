package com.space.service;

import com.space.mybatis.model.User;

public interface HsMemberForDisService {

	public User QueryUserInfoRequest(String accountId) throws Exception;
	
}
