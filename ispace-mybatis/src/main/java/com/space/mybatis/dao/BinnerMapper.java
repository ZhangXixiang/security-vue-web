package com.space.mybatis.dao;

import com.space.common.dto.dis.binner.BinnerResDto;
import com.space.mybatis.model.Binner;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface BinnerMapper extends Mapper<Binner> {
    
	public List<BinnerResDto> getAll();
	
}