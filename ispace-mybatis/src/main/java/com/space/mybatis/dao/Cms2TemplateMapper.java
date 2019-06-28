package com.space.mybatis.dao;

import com.space.mybatis.model.Cms2Template;
import com.space.mybatis.model.Cms2TemplateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cms2TemplateMapper {
    int countByExample(Cms2TemplateExample example);

    int deleteByExample(Cms2TemplateExample example);

    int insert(Cms2Template record);

    int insertSelective(Cms2Template record);

    List<Cms2Template> selectByExample(Cms2TemplateExample example);

    int updateByExampleSelective(@Param("record") Cms2Template record, @Param("example") Cms2TemplateExample example);

    int updateByExample(@Param("record") Cms2Template record, @Param("example") Cms2TemplateExample example);
}