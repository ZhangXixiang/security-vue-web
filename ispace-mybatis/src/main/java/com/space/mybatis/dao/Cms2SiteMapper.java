package com.space.mybatis.dao;

import com.space.mybatis.model.Cms2Site;
import com.space.mybatis.model.Cms2SiteWithBLOBs;
import com.space.mybatis.model.Cms2SiteExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cms2SiteMapper {
    int countByExample(Cms2SiteExample example);

    int deleteByExample(Cms2SiteExample example);

    int insert(Cms2SiteWithBLOBs record);

    int insertSelective(Cms2SiteWithBLOBs record);

    List<Cms2SiteWithBLOBs> selectByExampleWithBLOBs(Cms2SiteExample example);

    List<Cms2Site> selectByExample(Cms2SiteExample example);

    int updateByExampleSelective(@Param("record") Cms2SiteWithBLOBs record, @Param("example") Cms2SiteExample example);

    int updateByExampleWithBLOBs(@Param("record") Cms2SiteWithBLOBs record, @Param("example") Cms2SiteExample example);

    int updateByExample(@Param("record") Cms2Site record, @Param("example") Cms2SiteExample example);
}