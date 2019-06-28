package com.space.service;

import com.space.common.dto.PageInfoDto;
import com.space.common.dto.dis.follow.FollowReqDto;
import com.space.common.dto.dis.follow.FollowSearchDto;
import com.space.common.dto.dis.topic.TopicResDto;
import com.space.mybatis.model.Follow;

public interface FollowService extends BaseService<Follow, Integer> {

	public boolean follow(FollowReqDto reqDto);
	
	public PageInfoDto<TopicResDto> myFollow(FollowSearchDto searchDto);

	int countForAll();

}
