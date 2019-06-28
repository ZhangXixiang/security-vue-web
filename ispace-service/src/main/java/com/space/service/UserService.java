package com.space.service;

import com.space.common.dto.PageInfoDto;
import com.space.common.dto.SelectTag;
import com.space.common.dto.user.UserDto;
import com.space.mybatis.model.User;

public interface UserService extends BaseService<User, String> {

	public PageInfoDto<UserDto> findByPageAndRequest(SelectTag tag);

	public String getIdByAccountId(String accountId) throws Exception;


}
