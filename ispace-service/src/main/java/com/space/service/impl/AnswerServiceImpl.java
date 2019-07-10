package com.space.service.impl;

import com.github.pagehelper.PageHelper;
import com.space.common.dto.PageInfoDto;
import com.space.common.dto.dis.answer.AnswerListResDTO;
import com.space.common.dto.dis.answer.AnswerReqDto;
import com.space.common.dto.dis.answer.AnswerResDto;
import com.space.common.dto.dis.answer.AnswerSearchDto;
import com.space.common.dto.dis.answer.resource.ResourceResDto;
import com.space.mybatis.dao.*;
import com.space.mybatis.model.*;
import com.space.service.AnswerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional(readOnly = true)
public class AnswerServiceImpl extends BaseServiceImpl<Answer, Integer> implements AnswerService {

	@Autowired
	private TopicMapper topicMapper;
	
	@Autowired
	private AnswerMapper answerMapper;
	
	@Autowired
	private ResourceMapper resourceMapper;
	
	@Autowired
	private CollectMapper collectMapper;
	
	@Autowired
	private CommentMapper commentMapper;
	
	@Override
	public PageInfoDto<AnswerResDto> getPage(AnswerSearchDto searchDto, String userId) {
		PageHelper.startPage(searchDto.getPageNum(), searchDto.getPageSize());
		if(searchDto.getOrderTag() != null && !searchDto.getOrderTag().trim().equals("")){
			PageHelper.orderBy(" art." + searchDto.getOrderTag() + " " + searchDto.getOrderType());
		}
		List<AnswerResDto> dtos = answerMapper.getAnswers(searchDto.getTopicId(),
				                                          searchDto.getOrderTag(), 
				                                          searchDto.getOrderType(), 
				                                          searchDto.getSearch(), 
				                                          null, userId);
		if(dtos != null && dtos.size() > 0){
			for(AnswerResDto dto:dtos){
				List<ResourceResDto> resourceDtos = resourceMapper.getByAnswerId(dto.getAnswerId());
				dto.setResourceDtos(resourceDtos);
				Collect collect = new Collect();
				collect.setAnswerId(dto.getAnswerId());
				collect.setUserId(searchDto.getUserId());
				List<Collect> collects = collectMapper.select(collect);
				if(collects == null || collects.isEmpty()){
					dto.setIsGood(0);
					dto.setIsCollect(0);
				}else{
					for(Collect c:collects){
						if(c.getType() == 1){
							dto.setIsGood(1);
						}
						if(c.getType() == 2){
							dto.setIsCollect(1);
						}
					}
				}
			}
		}
		return new PageInfoDto<AnswerResDto>(dtos);
	}
	
	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
	public boolean addAnswer(AnswerReqDto reqDto, String userId, List<Map<String, String>> res) {
		Answer article = new Answer();
		BeanUtils.copyProperties(reqDto, article);
		article.setTopicId(Integer.parseInt(reqDto.getTopicId()));
		article.setIsOrigin(Integer.parseInt(reqDto.getIsOrigin()));
		article.setUserId(userId);
		answerMapper.insertSelective(article);
		
		if(res != null && res.size() > 0){
			for(int i = 0; i < res.size(); i++){
				Resource resource = new Resource();
				resource.setPath(res.get(i).get("path"));
				resource.setAnswerId(article.getId());
				resource.setSort(i);
				resource.setType(Integer.parseInt(reqDto.getType()));
				resource.setWide(Float.parseFloat(res.get(i).get("wide")));
				resource.setHigh(Float.parseFloat(res.get(i).get("high")));
				resourceMapper.insertSelective(resource);
			}
		}
		
		Topic topic = topicMapper.selectByPrimaryKey(Integer.parseInt(reqDto.getTopicId()));
		topic.setCommentCount(topic.getCommentCount() + 1);
		topicMapper.updateByPrimaryKeySelective(topic);
		return true;
	}

	@Override
	public AnswerResDto getByIdOver(Integer answerId, String userId) {
		if(answerId == null){
			return null;
		}
		List<AnswerResDto> dtos = answerMapper.getAnswers(null, null, null, null, answerId, null);
		if(dtos != null && dtos.size() > 0){
			AnswerResDto dto = dtos.get(0);
			List<ResourceResDto> resourceDtos = resourceMapper.getByAnswerId(dto.getAnswerId());
			dto.setResourceDtos(resourceDtos);
			
			Collect collect = new Collect();
			collect.setAnswerId(dto.getAnswerId());
			collect.setUserId(userId);
			List<Collect> collects = collectMapper.select(collect);
			if(collects == null || collects.isEmpty()){
				dto.setIsGood(0);
				dto.setIsCollect(0);
			}else{
				for(Collect c:collects){
					if(c.getType() == 1){
						dto.setIsGood(1);
					}
					if(c.getType() == 2){
						dto.setIsCollect(1);
					}
				}
			}
			
			return dto;
		}
		return null;
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
	public boolean delAnswer(Integer answerId, String userId) {
		Answer answer = new Answer();
		answer.setUserId(userId);
		answer.setId(answerId);
		List<Answer> answers = answerMapper.select(answer);
		if(answers == null || answers.isEmpty()){
			return false;
		}
		Integer topicId = answers.get(0).getTopicId();
		int ok = answerMapper.delete(answer);
		if(ok == 1){
			Comment comment = new Comment();
			comment.setAnswerId(answerId);
			commentMapper.delete(comment);
			
			Collect collect = new Collect();
			collect.setAnswerId(answerId);
			collectMapper.delete(collect);
			
			Resource resource = new Resource();
			resource.setAnswerId(answerId);
			resourceMapper.delete(resource);
			
			Topic temp = topicMapper.selectByPrimaryKey(topicId);
			
			Topic topic = new Topic();
			topic.setId(topicId);
			topic.setCommentCount(temp.getCommentCount() == 0 ? 0 : temp.getCommentCount() - 1);
			topicMapper.updateByPrimaryKeySelective(topic);
		}
		return true;
	}


	@Override
	public List<AnswerListResDTO> listAnswer(Integer page, Integer pageSize,String name,String topic) {
		int start = (page - 1) * pageSize;
		return answerMapper.listAnswer(start,pageSize,name,topic);
	}

	@Override
	public int countForAll(String name,String topic) {
		return answerMapper.countForAll(name,topic);
	}
}












