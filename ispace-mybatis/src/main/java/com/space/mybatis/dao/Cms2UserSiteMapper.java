package com.space.mybatis.dao;

import com.space.mybatis.model.Cms2UserSite;
import com.space.mybatis.model.Cms2UserSiteExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cms2UserSiteMapper {
    int countByExample(Cms2UserSiteExample example);

    int deleteByExample(Cms2UserSiteExample example);

    int insert(Cms2UserSite record);

    int insertSelective(Cms2UserSite record);

    List<Cms2UserSite> selectByExample(Cms2UserSiteExample example);

    int updateByExampleSelective(@Param("record") Cms2UserSite record, @Param("example") Cms2UserSiteExample example);

    int updateByExample(@Param("record") Cms2UserSite record, @Param("example") Cms2UserSiteExample example);
}