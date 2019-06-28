package com.space.mybatis.dao;

import com.space.mybatis.model.Cms2ModelItem;
import com.space.mybatis.model.Cms2ModelItemExample;
import com.space.mybatis.model.Cms2ModelItemWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cms2ModelItemMapper {
    int countByExample(Cms2ModelItemExample example);

    int deleteByExample(Cms2ModelItemExample example);

    int insert(Cms2ModelItemWithBLOBs record);

    int insertSelective(Cms2ModelItemWithBLOBs record);

    List<Cms2ModelItemWithBLOBs> selectByExampleWithBLOBs(Cms2ModelItemExample example);

    List<Cms2ModelItem> selectByExample(Cms2ModelItemExample example);

    int updateByExampleSelective(@Param("record") Cms2ModelItemWithBLOBs record, @Param("example") Cms2ModelItemExample example);

    int updateByExampleWithBLOBs(@Param("record") Cms2ModelItemWithBLOBs record, @Param("example") Cms2ModelItemExample example);

    int updateByExample(@Param("record") Cms2ModelItem record, @Param("example") Cms2ModelItemExample example);
}