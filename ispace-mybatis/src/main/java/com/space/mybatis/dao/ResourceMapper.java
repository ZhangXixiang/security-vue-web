package com.space.mybatis.dao;

import com.space.common.dto.dis.answer.resource.ResourceResDto;
import com.space.mybatis.model.Resource;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ResourceMapper extends Mapper<Resource> {
 
	public List<ResourceResDto> getByAnswerId(@Param("answerId") Integer answerId);
	
}