package com.space.mybatis.dao;

import com.space.mybatis.model.Cms2ContAttr;
import com.space.mybatis.model.Cms2ContAttrExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cms2ContAttrMapper {
    int countByExample(Cms2ContAttrExample example);

    int deleteByExample(Cms2ContAttrExample example);

    int insert(Cms2ContAttr record);

    int insertSelective(Cms2ContAttr record);

    List<Cms2ContAttr> selectByExampleWithBLOBs(Cms2ContAttrExample example);

    List<Cms2ContAttr> selectByExample(Cms2ContAttrExample example);

    int updateByExampleSelective(@Param("record") Cms2ContAttr record, @Param("example") Cms2ContAttrExample example);

    int updateByExampleWithBLOBs(@Param("record") Cms2ContAttr record, @Param("example") Cms2ContAttrExample example);

    int updateByExample(@Param("record") Cms2ContAttr record, @Param("example") Cms2ContAttrExample example);
}