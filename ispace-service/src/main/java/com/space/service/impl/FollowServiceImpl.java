package com.space.service.impl;

import com.github.pagehelper.PageHelper;
import com.space.common.dto.PageInfoDto;
import com.space.common.dto.dis.follow.FollowReqDto;
import com.space.common.dto.dis.follow.FollowSearchDto;
import com.space.common.dto.dis.topic.TopicResDto;
import com.space.mybatis.dao.FollowMapper;
import com.space.mybatis.dao.TopicMapper;
import com.space.mybatis.model.Follow;
import com.space.mybatis.model.Topic;
import com.space.service.FollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class FollowServiceImpl extends BaseServiceImpl<Follow, Integer> implements FollowService {

	@Autowired
	private TopicMapper topicMapper;
	
	@Autowired
	private FollowMapper followMapper;
	
	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
	public boolean follow(FollowReqDto reqDto) {
		Follow follow = new Follow();
		follow.setTopicId(reqDto.getTopicId());
		follow.setUserId(reqDto.getUserId());
		
		Topic topic = new Topic();
		topic.setId(reqDto.getTopicId());
		
		Topic temp = topicMapper.selectByPrimaryKey(reqDto.getTopicId());
		
		if(reqDto.getType() == 1){
			List<Follow> follows = followMapper.select(follow);
			if(follows == null || follows.isEmpty() ){
				topic.setCollectCount(temp.getCollectCount() + 1);
				topicMapper.updateByPrimaryKeySelective(topic);
				
				followMapper.insertSelective(follow);
			}
		}else{
			topic.setCollectCount(temp.getCollectCount() - 1 < 0 ? 0:temp.getCollectCount() - 1);
			topicMapper.updateByPrimaryKeySelective(topic);
			
			followMapper.delete(follow);
		}
		return true;
	}

	@Override
	public PageInfoDto<TopicResDto> myFollow(FollowSearchDto searchDto) {
		PageHelper.startPage(searchDto.getPageNum(), searchDto.getPageSize());
		List<TopicResDto> topicDtos = topicMapper.myFollow(searchDto.getUserId());
		return new PageInfoDto<TopicResDto>(topicDtos);
	}

	@Override
	public int countForAll() {
		return followMapper.countForAll();
	}
}

