package com.space.service.impl;

import com.github.pagehelper.PageHelper;
import com.space.common.dto.PageInfoDto;
import com.space.common.dto.dis.comment.*;
import com.space.mybatis.dao.AnswerMapper;
import com.space.mybatis.dao.CommentMapper;
import com.space.mybatis.dao.ResourceMapper;
import com.space.mybatis.model.Answer;
import com.space.mybatis.model.Comment;
import com.space.mybatis.model.Resource;
import com.space.service.CommentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class CommentServiceImpl extends BaseServiceImpl<Comment, Integer> implements CommentService {

	@Autowired
	private AnswerMapper answerMapper;
	
	@Autowired
	private CommentMapper commentMapper;
	
	@Autowired
	private ResourceMapper resourceMapper;
	
	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
	public boolean comment(CommentReqDto reqDto) {
		Comment comment = new Comment();
		BeanUtils.copyProperties(reqDto, comment);
		
		Answer article = new Answer();
		article.setId(comment.getAnswerId());
		Answer temp = answerMapper.selectByPrimaryKey(comment.getAnswerId());
		comment.setAnswerTitle(temp.getTitle());
		article.setCommentCount(temp.getCommentCount() + 1);
		answerMapper.updateByPrimaryKeySelective(article);
		
		commentMapper.insertSelective(comment);
		/*if(reqDto.getAction() == 1){
			comment.setAnswerTitle(temp.getTitle());
			article.setCommentCount(temp.getCommentCount() + 1);
			answerMapper.updateByPrimaryKeySelective(article);
			
			commentMapper.insertSelective(comment);
		}else{
			article.setCommentCount(temp.getCommentCount() - 1 < 0 ? 0:temp.getCommentCount() - 1);
			answerMapper.updateByPrimaryKeySelective(article);
			
			commentMapper.delete(comment);
		}*/
		return true;
	}

	@Override
	public PageInfoDto<CommentResDto> getByAnswerId(CommentSearchDto searchDto) {
		PageHelper.startPage(searchDto.getPageNum(), searchDto.getPageSize());
		List<CommentResDto> commentDtos = commentMapper.getByAnswerId(searchDto.getAnswerId());
		return new PageInfoDto<CommentResDto>(commentDtos);
	}

	@Override
	public PageInfoDto<CommentResDto> getByUserId(CommentReqUserDto reqUserDto) {
		PageHelper.startPage(reqUserDto.getPageNum(), reqUserDto.getPageSize());
		List<CommentResDto> commentDtos = commentMapper.getByUserId(reqUserDto.getUserId());
		if(commentDtos != null && !commentDtos.isEmpty()){
			for(CommentResDto dto:commentDtos){
				Resource resource = new Resource();
				resource.setAnswerId(dto.getAnswerId());
				List<Resource> resources = resourceMapper.select(resource);
				if(resources != null && !resources.isEmpty()){
					dto.setResourcePath(resources.get(0).getPath());
					dto.setResourceType(resources.get(0).getType());
				}
			}
		}
		return new PageInfoDto<CommentResDto>(commentDtos);
	}

	@Override
	public PageInfoDto<CommentResDto> obtain(CommentReqUserDto reqUserDto) {
		PageHelper.startPage(reqUserDto.getPageNum(), reqUserDto.getPageSize());
		List<CommentResDto> commentDtos = commentMapper.obtain(reqUserDto.getUserId());
		if(commentDtos != null && !commentDtos.isEmpty()){
			for(CommentResDto dto:commentDtos){
				Resource resource = new Resource();
				resource.setAnswerId(dto.getAnswerId());
				List<Resource> resources = resourceMapper.select(resource);
				if(resources != null && !resources.isEmpty()){
					dto.setResourcePath(resources.get(0).getPath());
					dto.setResourceType(resources.get(0).getType());
				}
			}
		}
		return new PageInfoDto<CommentResDto>(commentDtos);
	}

	@Override
	public List<CommentListResDTO> selectAllComment(Integer page, Integer pageSize) {
		int start = (page - 1) * pageSize;
		return commentMapper.listComment(start,pageSize);
	}


	@Override
	public int countForAll() {
		return commentMapper.countForAll();
	}

}
