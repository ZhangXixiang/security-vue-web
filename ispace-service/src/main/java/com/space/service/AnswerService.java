package com.space.service;

import com.space.common.dto.PageInfoDto;
import com.space.common.dto.dis.answer.AnswerListResDTO;
import com.space.common.dto.dis.answer.AnswerReqDto;
import com.space.common.dto.dis.answer.AnswerResDto;
import com.space.common.dto.dis.answer.AnswerSearchDto;
import com.space.mybatis.model.Answer;

import java.util.List;
import java.util.Map;

public interface AnswerService extends BaseService<Answer, Integer> {

	public PageInfoDto<AnswerResDto> getPage(AnswerSearchDto reqDto, String userId);
	
	public boolean addAnswer(AnswerReqDto reqDto, String userId, List<Map<String, String>> res);
	
	public boolean delAnswer(Integer answerId, String userId);
	
	public AnswerResDto getByIdOver(Integer answerId, String userId);

	List<AnswerListResDTO> listAnswer(Integer page,Integer pageSize);

	int countForAll();
}
