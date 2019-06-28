package com.space.mybatis.dao;

import com.space.mybatis.model.Cms2Flink;
import com.space.mybatis.model.Cms2FlinkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cms2FlinkMapper {
    int countByExample(Cms2FlinkExample example);

    int deleteByExample(Cms2FlinkExample example);

    int insert(Cms2Flink record);

    int insertSelective(Cms2Flink record);

    List<Cms2Flink> selectByExample(Cms2FlinkExample example);

    int updateByExampleSelective(@Param("record") Cms2Flink record, @Param("example") Cms2FlinkExample example);

    int updateByExample(@Param("record") Cms2Flink record, @Param("example") Cms2FlinkExample example);
}