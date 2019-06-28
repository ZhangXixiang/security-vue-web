package com.space.mybatis.dao;

import com.space.mybatis.model.Cms2ChannelUser;
import com.space.mybatis.model.Cms2ChannelUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cms2ChannelUserMapper {
    int countByExample(Cms2ChannelUserExample example);

    int deleteByExample(Cms2ChannelUserExample example);

    int insert(Cms2ChannelUser record);

    int insertSelective(Cms2ChannelUser record);

    List<Cms2ChannelUser> selectByExample(Cms2ChannelUserExample example);

    int updateByExampleSelective(@Param("record") Cms2ChannelUser record, @Param("example") Cms2ChannelUserExample example);

    int updateByExample(@Param("record") Cms2ChannelUser record, @Param("example") Cms2ChannelUserExample example);
}