package com.space.service.impl;

import com.github.pagehelper.PageHelper;
import com.space.common.dto.PageInfoDto;
import com.space.common.dto.SelectTag;
import com.space.common.dto.user.UserDto;
import com.space.mybatis.dao.UserMapper;
import com.space.mybatis.model.User;
import com.space.service.HsMemberForDisService;
import com.space.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl extends BaseServiceImpl<User, String> implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private HsMemberForDisService hsMemberForDisService;


	@Override
	public PageInfoDto<UserDto> findByPageAndRequest(SelectTag tag) {
		PageHelper.startPage(tag.getPageNum(), tag.getPageSize());
		User user = new User();
		user.setGender("M");
		List<User> users = userMapper.select(user);
		if(null == users || users.isEmpty()){
			return null;
		}
		List<UserDto> userDtos = new ArrayList<UserDto>();
		for(User u:users){
			UserDto dto = new UserDto();
			BeanUtils.copyProperties(u, dto);
			
			dto.setTime(new Date());
			userDtos.add(dto);
		}
		return new PageInfoDto<UserDto>(userDtos);
	}


	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
	public String getIdByAccountId(String accountId) throws Exception {
		User user = new User();
		user.setAccount(accountId);
		List<User> users = userMapper.select(user);
		if(users == null || users.isEmpty()){
			user = hsMemberForDisService.QueryUserInfoRequest(accountId);
			userMapper.insertSelective(user);
			return user.getId();
		}
		return users.get(0).getId();
	}

}
