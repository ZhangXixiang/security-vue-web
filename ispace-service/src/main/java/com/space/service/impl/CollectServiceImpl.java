package com.space.service.impl;

import com.github.pagehelper.PageHelper;
import com.space.common.dto.PageInfoDto;
import com.space.common.dto.dis.collect.CollectReqDto;
import com.space.common.dto.dis.collect.CollectResDto;
import com.space.common.dto.dis.collect.CollectSerachDto;
import com.space.mybatis.dao.AnswerMapper;
import com.space.mybatis.dao.CollectMapper;
import com.space.mybatis.dao.ResourceMapper;
import com.space.mybatis.model.Answer;
import com.space.mybatis.model.Collect;
import com.space.mybatis.model.Resource;
import com.space.service.CollectService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class CollectServiceImpl extends BaseServiceImpl<Collect, Integer> implements CollectService {

	@Autowired
	private AnswerMapper answerMapper;
	
	@Autowired
	private CollectMapper collectMapper;
	
	@Autowired
	private ResourceMapper resourceMapper;
	
	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
	public boolean collect(CollectReqDto reqDto) {
		Collect collect = new Collect();
		BeanUtils.copyProperties(reqDto, collect);
		
		Answer article = new Answer();
		article.setId(reqDto.getAnswerId());
		Answer temp = answerMapper.selectByPrimaryKey(reqDto.getAnswerId());
		if(reqDto.getAction() == 1){
			collect.setAnswerTitle(temp.getTitle());
			List<Collect> collects = collectMapper.select(collect);
			if(collects == null || collects.isEmpty()){
				switch (collect.getType()) {
				case 1: //点赞
					article.setGoodCount(temp.getGoodCount() + 1);
					break;
				default: //收藏
					article.setCollectCount(temp.getCollectCount() + 1);
					break;
				}
				answerMapper.updateByPrimaryKeySelective(article);
				
				collectMapper.insertSelective(collect);
			}
		}else{
			switch (collect.getType()) {
			case 1: //点赞
				article.setGoodCount(temp.getGoodCount() - 1 < 0 ? 0:temp.getGoodCount() - 1);
				break;
			default: //收藏
				article.setCollectCount(temp.getCollectCount() - 1 < 0 ? 0:temp.getCollectCount() - 1);
				break;
			}
			answerMapper.updateByPrimaryKeySelective(article);
			
			collectMapper.delete(collect);
		}
		return true;
	}

	@Override
	public PageInfoDto<CollectResDto> getByUserId(CollectSerachDto serachDto) {
		PageHelper.startPage(serachDto.getPageNum(), serachDto.getPageSize());
		List<CollectResDto> resDtos = collectMapper.getByUserId(serachDto.getUserId());
		if(resDtos != null && !resDtos.isEmpty()){
			for(CollectResDto dto:resDtos){
				Resource resource = new Resource();
				resource.setAnswerId(dto.getAnswerId());
				List<Resource> resources = resourceMapper.select(resource);
				if(resources != null && !resources.isEmpty()){
					dto.setResourcePath(resources.get(0).getPath());
					dto.setResourceType(resources.get(0).getType());
				}
			}
		}
		
		return new PageInfoDto<CollectResDto>(resDtos);
	}


}













