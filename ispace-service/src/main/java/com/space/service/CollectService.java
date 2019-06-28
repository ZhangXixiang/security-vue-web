package com.space.service;

import com.space.common.dto.PageInfoDto;
import com.space.common.dto.dis.collect.CollectReqDto;
import com.space.common.dto.dis.collect.CollectResDto;
import com.space.common.dto.dis.collect.CollectSerachDto;
import com.space.mybatis.model.Collect;

public interface CollectService extends BaseService<Collect, Integer> {

	public boolean collect(CollectReqDto reqDto);
	
	public PageInfoDto<CollectResDto> getByUserId(CollectSerachDto serachDto);
	
}
