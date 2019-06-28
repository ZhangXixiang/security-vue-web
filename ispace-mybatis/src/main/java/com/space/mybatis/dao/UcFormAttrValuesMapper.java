package com.space.mybatis.dao;

import com.space.mybatis.model.UcFormAttrValues;
import com.space.mybatis.model.UcFormAttrValuesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UcFormAttrValuesMapper {
    int countByExample(UcFormAttrValuesExample example);

    int deleteByExample(UcFormAttrValuesExample example);

    int insert(UcFormAttrValues record);

    int insertSelective(UcFormAttrValues record);

    List<UcFormAttrValues> selectByExampleWithBLOBs(UcFormAttrValuesExample example);

    List<UcFormAttrValues> selectByExample(UcFormAttrValues example);

    int updateByExampleSelective(@Param("record") UcFormAttrValues record, @Param("example") UcFormAttrValuesExample example);

    int updateByExampleWithBLOBs(@Param("record") UcFormAttrValues record, @Param("example") UcFormAttrValuesExample example);

    int updateByExample(@Param("record") UcFormAttrValues record, @Param("example") UcFormAttrValuesExample example);

}