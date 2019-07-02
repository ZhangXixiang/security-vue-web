package com.space.service;

import com.space.common.dto.dis.follow.FollowResDTO;
import com.space.mybatis.model.Topic;

import java.util.List;
import java.util.Map;

public interface TopicService extends BaseService<Topic, Integer> {
	
	public Map<String, Object> getTopicAndSlider(Integer topicId, String userId);


	//关联follow表和topic表查询 话题关注人列表
	public List<FollowResDTO> selectAllFollow(Integer page, Integer pageSize);


	List<Topic> listTopic(Integer page, Integer pageSize);

	int countForAll();


}
