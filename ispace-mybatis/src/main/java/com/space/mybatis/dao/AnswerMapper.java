package com.space.mybatis.dao;

import com.space.common.dto.dis.answer.AnswerListResDTO;
import com.space.common.dto.dis.answer.AnswerResDto;
import com.space.mybatis.model.Answer;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface AnswerMapper extends Mapper<Answer> {
    
	public List<AnswerResDto> getAnswers(@Param("topicId") Integer topicId,
                                         @Param("orderTag") String orderTag,
                                         @Param("orderType") String orderType,
                                         @Param("search") String search,
                                         @Param("answerId") Integer answerId,
                                         @Param("userId") String userId);

	List<AnswerListResDTO> listAnswer(@Param("start") int start, @Param("size") int size);

	int countForAll();
}