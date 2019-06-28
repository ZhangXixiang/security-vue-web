package com.space.mybatis.dao;

import com.space.mybatis.model.Cms2ContCount;
import com.space.mybatis.model.Cms2ContCountExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cms2ContCountMapper {
    int countByExample(Cms2ContCountExample example);

    int deleteByExample(Cms2ContCountExample example);

    int insert(Cms2ContCount record);

    int insertSelective(Cms2ContCount record);

    List<Cms2ContCount> selectByExample(Cms2ContCountExample example);

    int updateByExampleSelective(@Param("record") Cms2ContCount record, @Param("example") Cms2ContCountExample example);

    int updateByExample(@Param("record") Cms2ContCount record, @Param("example") Cms2ContCountExample example);
}