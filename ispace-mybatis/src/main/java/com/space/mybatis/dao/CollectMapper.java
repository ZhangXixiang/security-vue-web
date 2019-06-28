package com.space.mybatis.dao;

import com.space.common.dto.dis.collect.CollectResDto;
import com.space.mybatis.model.Collect;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface CollectMapper extends Mapper<Collect> {
	
	public List<CollectResDto> getByUserId(@Param("userId") String userId);
	
}