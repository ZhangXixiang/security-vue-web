package com.space.mybatis.dao;

import com.space.mybatis.model.Follow;
import tk.mybatis.mapper.common.Mapper;

public interface FollowMapper extends Mapper<Follow> {

    int countForAll();

}