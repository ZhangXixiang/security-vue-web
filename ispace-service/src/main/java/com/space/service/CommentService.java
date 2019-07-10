package com.space.service;

import com.space.common.dto.PageInfoDto;
import com.space.common.dto.dis.comment.*;
import com.space.mybatis.model.Comment;

import java.util.List;

public interface CommentService extends BaseService<Comment, Integer> {

	public boolean comment(CommentReqDto reqDto);
	
	public PageInfoDto<CommentResDto> getByAnswerId(CommentSearchDto searchDto);
	
	public PageInfoDto<CommentResDto> getByUserId(CommentReqUserDto reqUserDto);
	
	public PageInfoDto<CommentResDto> obtain(CommentReqUserDto reqUserDto);

	//关联follow表和topic表查询 话题关注人列表
	public List<CommentListResDTO> selectAllComment(Integer page, Integer pageSize, String name,String topic,String answer);

	int countForAll(String name,String topic,String answer);

}
