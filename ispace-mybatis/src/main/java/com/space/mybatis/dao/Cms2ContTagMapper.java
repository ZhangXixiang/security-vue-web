package com.space.mybatis.dao;

import com.space.mybatis.model.Cms2ContTag;
import com.space.mybatis.model.Cms2ContTagExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cms2ContTagMapper {
    int countByExample(Cms2ContTagExample example);

    int deleteByExample(Cms2ContTagExample example);

    int insert(Cms2ContTag record);

    int insertSelective(Cms2ContTag record);

    List<Cms2ContTag> selectByExample(Cms2ContTagExample example);

    int updateByExampleSelective(@Param("record") Cms2ContTag record, @Param("example") Cms2ContTagExample example);

    int updateByExample(@Param("record") Cms2ContTag record, @Param("example") Cms2ContTagExample example);
}