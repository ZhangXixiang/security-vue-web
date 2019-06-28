package com.space.mybatis.dao;

import com.space.mybatis.model.Cms2ChannelAttr;
import com.space.mybatis.model.Cms2ChannelAttrExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cms2ChannelAttrMapper {
    int countByExample(Cms2ChannelAttrExample example);

    int deleteByExample(Cms2ChannelAttrExample example);

    int insert(Cms2ChannelAttr record);

    int insertSelective(Cms2ChannelAttr record);

    List<Cms2ChannelAttr> selectByExampleWithBLOBs(Cms2ChannelAttrExample example);

    List<Cms2ChannelAttr> selectByExample(Cms2ChannelAttrExample example);

    int updateByExampleSelective(@Param("record") Cms2ChannelAttr record, @Param("example") Cms2ChannelAttrExample example);

    int updateByExampleWithBLOBs(@Param("record") Cms2ChannelAttr record, @Param("example") Cms2ChannelAttrExample example);

    int updateByExample(@Param("record") Cms2ChannelAttr record, @Param("example") Cms2ChannelAttrExample example);
}