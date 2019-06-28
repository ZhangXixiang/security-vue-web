package com.space.mybatis.dao;

import com.space.mybatis.model.Cms2ContCheck;
import com.space.mybatis.model.Cms2ContCheckExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cms2ContCheckMapper {
    int countByExample(Cms2ContCheckExample example);

    int deleteByExample(Cms2ContCheckExample example);

    int insert(Cms2ContCheck record);

    int insertSelective(Cms2ContCheck record);

    List<Cms2ContCheck> selectByExampleWithBLOBs(Cms2ContCheckExample example);

    List<Cms2ContCheck> selectByExample(Cms2ContCheckExample example);

    int updateByExampleSelective(@Param("record") Cms2ContCheck record, @Param("example") Cms2ContCheckExample example);

    int updateByExampleWithBLOBs(@Param("record") Cms2ContCheck record, @Param("example") Cms2ContCheckExample example);

    int updateByExample(@Param("record") Cms2ContCheck record, @Param("example") Cms2ContCheckExample example);
}