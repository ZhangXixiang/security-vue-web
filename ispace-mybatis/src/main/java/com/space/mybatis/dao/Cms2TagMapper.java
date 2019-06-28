package com.space.mybatis.dao;

import com.space.mybatis.model.Cms2Tag;
import com.space.mybatis.model.Cms2TagExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cms2TagMapper {
    int countByExample(Cms2TagExample example);

    int deleteByExample(Cms2TagExample example);

    int insert(Cms2Tag record);

    int insertSelective(Cms2Tag record);

    List<Cms2Tag> selectByExample(Cms2TagExample example);

    int updateByExampleSelective(@Param("record") Cms2Tag record, @Param("example") Cms2TagExample example);

    int updateByExample(@Param("record") Cms2Tag record, @Param("example") Cms2TagExample example);
}