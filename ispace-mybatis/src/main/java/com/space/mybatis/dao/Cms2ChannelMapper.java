package com.space.mybatis.dao;

import com.space.mybatis.model.Cms2ChannelExample;
import com.space.mybatis.model.Cms2Channel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cms2ChannelMapper {
    int countByExample(Cms2ChannelExample example);

    int deleteByExample(Cms2ChannelExample example);

    int insert(Cms2Channel record);

    int insertSelective(Cms2Channel record);

    List<Cms2Channel> selectByExampleWithBLOBs(Cms2ChannelExample example);

    List<Cms2Channel> selectByExample(Cms2ChannelExample example);

    int updateByExampleSelective(@Param("record") Cms2Channel record, @Param("example") Cms2ChannelExample example);

    int updateByExampleWithBLOBs(@Param("record") Cms2Channel record, @Param("example") Cms2ChannelExample example);

    int updateByExample(@Param("record") Cms2Channel record, @Param("example") Cms2ChannelExample example);
}