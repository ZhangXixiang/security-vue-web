package com.space.mybatis.dao;


import com.space.mybatis.model.Cms2AdvSpace;
import com.space.mybatis.model.Cms2AdvSpaceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cms2AdvSpaceMapper {
    int countByExample(Cms2AdvSpaceExample example);

    int deleteByExample(Cms2AdvSpaceExample example);

    int insert(Cms2AdvSpace record);

    int insertSelective(Cms2AdvSpace record);

    List<Cms2AdvSpace> selectByExample(Cms2AdvSpaceExample example);

    int updateByExampleSelective(@Param("record") Cms2AdvSpace record, @Param("example") Cms2AdvSpaceExample example);

    int updateByExample(@Param("record") Cms2AdvSpace record, @Param("example") Cms2AdvSpaceExample example);
}