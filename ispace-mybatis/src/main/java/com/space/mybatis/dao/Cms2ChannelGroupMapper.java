package com.space.mybatis.dao;

import com.space.mybatis.model.Cms2ChannelGroup;
import com.space.mybatis.model.Cms2ChannelGroupExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cms2ChannelGroupMapper {
    int countByExample(Cms2ChannelGroupExample example);

    int deleteByExample(Cms2ChannelGroupExample example);

    int insert(Cms2ChannelGroup record);

    int insertSelective(Cms2ChannelGroup record);

    List<Cms2ChannelGroup> selectByExample(Cms2ChannelGroupExample example);

    int updateByExampleSelective(@Param("record") Cms2ChannelGroup record, @Param("example") Cms2ChannelGroupExample example);

    int updateByExample(@Param("record") Cms2ChannelGroup record, @Param("example") Cms2ChannelGroupExample example);
}