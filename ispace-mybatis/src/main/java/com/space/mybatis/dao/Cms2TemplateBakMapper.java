package com.space.mybatis.dao;

import com.space.mybatis.model.Cms2TemplateBak;
import com.space.mybatis.model.Cms2TemplateBakExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cms2TemplateBakMapper {
    int countByExample(Cms2TemplateBakExample example);

    int deleteByExample(Cms2TemplateBakExample example);

    int insert(Cms2TemplateBak record);

    int insertSelective(Cms2TemplateBak record);

    List<Cms2TemplateBak> selectByExample(Cms2TemplateBakExample example);

    int updateByExampleSelective(@Param("record") Cms2TemplateBak record, @Param("example") Cms2TemplateBakExample example);

    int updateByExample(@Param("record") Cms2TemplateBak record, @Param("example") Cms2TemplateBakExample example);
}