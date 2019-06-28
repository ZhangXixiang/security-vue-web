package com.space.mybatis.dao;

import com.space.mybatis.model.Cms2Job;
import com.space.mybatis.model.Cms2JobExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cms2JobMapper {
    int countByExample(Cms2JobExample example);

    int deleteByExample(Cms2JobExample example);

    int insert(Cms2Job record);

    int insertSelective(Cms2Job record);

    List<Cms2Job> selectByExample(Cms2JobExample example);

    int updateByExampleSelective(@Param("record") Cms2Job record, @Param("example") Cms2JobExample example);

    int updateByExample(@Param("record") Cms2Job record, @Param("example") Cms2JobExample example);
}