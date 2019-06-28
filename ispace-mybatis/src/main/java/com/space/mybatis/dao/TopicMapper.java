package com.space.mybatis.dao;

import com.space.common.dto.dis.follow.FollowResDTO;
import com.space.common.dto.dis.topic.TopicResDto;
import com.space.mybatis.model.Topic;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TopicMapper extends Mapper<Topic> {
    
	public List<TopicResDto> getById(@Param("topicId") Integer topicId);
	
	public Integer isFollow(@Param("topicId") Integer topicId, @Param("userId") String userId);
	
	public List<TopicResDto> myFollow(@Param("userId") String userId);

	List<FollowResDTO> selectAllFollow(@Param("start") int start, @Param("size") int size);


	List<Topic> listTopic(@Param("start") int start, @Param("size") int size);

	int countForAll();
}