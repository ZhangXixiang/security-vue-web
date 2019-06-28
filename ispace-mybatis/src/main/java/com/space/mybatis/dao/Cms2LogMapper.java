package com.space.mybatis.dao;

import com.space.mybatis.model.Cms2Log;
import com.space.mybatis.model.Cms2LogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cms2LogMapper {
    int countByExample(Cms2LogExample example);

    int deleteByExample(Cms2LogExample example);

    int insert(Cms2Log record);

    int insertSelective(Cms2Log record);

    List<Cms2Log> selectByExampleWithBLOBs(Cms2LogExample example);

    List<Cms2Log> selectByExample(Cms2LogExample example);

    int updateByExampleSelective(@Param("record") Cms2Log record, @Param("example") Cms2LogExample example);

    int updateByExampleWithBLOBs(@Param("record") Cms2Log record, @Param("example") Cms2LogExample example);

    int updateByExample(@Param("record") Cms2Log record, @Param("example") Cms2LogExample example);
}