package com.space.mybatis.dao;

import com.space.common.dto.dis.comment.CommentListResDTO;
import com.space.common.dto.dis.comment.CommentResDto;
import com.space.mybatis.model.Comment;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface CommentMapper extends Mapper<Comment> {

	public List<CommentResDto> getByAnswerId(@Param("answerId") Integer answerId);
	
	public List<CommentResDto> getByUserId(@Param("userId") String userId);
	
	public List<CommentResDto> obtain(@Param("userId") String userId);


	List<CommentListResDTO> listComment(@Param("start") int start, @Param("size") int size, @Param("name") String name, @Param("topic") String topic, @Param("answer") String answer);

	int countForAll(@Param("name") String name, @Param("topic") String topic, @Param("answer") String answer);
	
}