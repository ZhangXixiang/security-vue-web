package com.space.mybatis.dao;

import com.space.mybatis.model.Cms2JobTiming;
import com.space.mybatis.model.Cms2JobTimingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cms2JobTimingMapper {
    int countByExample(Cms2JobTimingExample example);

    int deleteByExample(Cms2JobTimingExample example);

    int insert(Cms2JobTiming record);

    int insertSelective(Cms2JobTiming record);

    List<Cms2JobTiming> selectByExample(Cms2JobTimingExample example);

    int updateByExampleSelective(@Param("record") Cms2JobTiming record, @Param("example") Cms2JobTimingExample example);

    int updateByExample(@Param("record") Cms2JobTiming record, @Param("example") Cms2JobTimingExample example);
}