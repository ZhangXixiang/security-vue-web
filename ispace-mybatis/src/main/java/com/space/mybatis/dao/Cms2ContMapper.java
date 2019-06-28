package com.space.mybatis.dao;

import com.space.mybatis.model.Cms2Cont;
import com.space.mybatis.model.Cms2ContExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cms2ContMapper {
    int countByExample(Cms2ContExample example);

    int deleteByExample(Cms2ContExample example);

    int insert(Cms2Cont record);

    int insertSelective(Cms2Cont record);

    List<Cms2Cont> selectByExample(Cms2ContExample example);

    int updateByExampleSelective(@Param("record") Cms2Cont record, @Param("example") Cms2ContExample example);

    int updateByExample(@Param("record") Cms2Cont record, @Param("example") Cms2ContExample example);
}