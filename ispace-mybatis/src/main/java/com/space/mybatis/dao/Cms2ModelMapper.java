package com.space.mybatis.dao;

import com.space.mybatis.model.Cms2Model;
import com.space.mybatis.model.Cms2ModelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cms2ModelMapper {
    int countByExample(Cms2ModelExample example);

    int deleteByExample(Cms2ModelExample example);

    int insert(Cms2Model record);

    int insertSelective(Cms2Model record);

    List<Cms2Model> selectByExample(Cms2ModelExample example);

    int updateByExampleSelective(@Param("record") Cms2Model record, @Param("example") Cms2ModelExample example);

    int updateByExample(@Param("record") Cms2Model record, @Param("example") Cms2ModelExample example);
}