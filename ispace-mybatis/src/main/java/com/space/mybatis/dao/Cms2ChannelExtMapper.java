package com.space.mybatis.dao;

import com.space.mybatis.model.Cms2ChannelExt;
import com.space.mybatis.model.Cms2ChannelExtExample;
import com.space.mybatis.model.Cms2ChannelExtWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cms2ChannelExtMapper {
    int countByExample(Cms2ChannelExtExample example);

    int deleteByExample(Cms2ChannelExtExample example);

    int insert(Cms2ChannelExtWithBLOBs record);

    int insertSelective(Cms2ChannelExtWithBLOBs record);

    List<Cms2ChannelExtWithBLOBs> selectByExampleWithBLOBs(Cms2ChannelExtExample example);

    List<Cms2ChannelExt> selectByExample(Cms2ChannelExtExample example);

    int updateByExampleSelective(@Param("record") Cms2ChannelExtWithBLOBs record, @Param("example") Cms2ChannelExtExample example);

    int updateByExampleWithBLOBs(@Param("record") Cms2ChannelExtWithBLOBs record, @Param("example") Cms2ChannelExtExample example);

    int updateByExample(@Param("record") Cms2ChannelExt record, @Param("example") Cms2ChannelExtExample example);
}