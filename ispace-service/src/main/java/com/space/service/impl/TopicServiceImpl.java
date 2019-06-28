package com.space.service.impl;

import com.space.common.dto.dis.binner.BinnerResDto;
import com.space.common.dto.dis.follow.FollowResDTO;
import com.space.common.dto.dis.topic.TopicResDto;
import com.space.mybatis.dao.BinnerMapper;
import com.space.mybatis.dao.TopicMapper;
import com.space.mybatis.model.Topic;
import com.space.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional(readOnly = true)
public class TopicServiceImpl extends BaseServiceImpl<Topic, Integer> implements TopicService {

	@Autowired
	private TopicMapper topicMapper;
	
	@Autowired
	private BinnerMapper binnerMapper;
	
	@Override
	public Map<String, Object> getTopicAndSlider(Integer topicId, String userId) {
		List<BinnerResDto> binnerDtos = new ArrayList<BinnerResDto>();
		List<TopicResDto> topicDtos = topicMapper.getById(topicId);
		if(topicDtos != null && !topicDtos.isEmpty()){
			for(TopicResDto dto:topicDtos){
				Integer ok = topicMapper.isFollow(dto.getTopicId(), userId);
				if(ok != null){
					dto.setIsFollow(1);
				}
			}
		}
		
		if(topicId == null){
			binnerDtos = binnerMapper.getAll();
		}
		Map<String, Object> res = new HashMap<String, Object>();
		res.put("topics", topicDtos);
		res.put("binners", binnerDtos);
		return res;
	}

	@Override
	public List<FollowResDTO> selectAllFollow(Integer page,Integer pageSize) {
		int start = (page - 1) * pageSize;
		return topicMapper.selectAllFollow(start,pageSize);
	}

	@Override
	public List<Topic> listTopic(Integer page, Integer pageSize) {
		int start = (page - 1) * pageSize;
		return topicMapper.listTopic(start,pageSize);
	}

	@Override
	public int countForAll() {
		return topicMapper.countForAll();
	}

}
