package com.space.mybatis.dao;

import com.space.mybatis.model.Cms2Attach;
import com.space.mybatis.model.Cms2AttachExample;
import com.space.mybatis.model.Cms2AttachWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cms2AttachMapper {
    int countByExample(Cms2AttachExample example);

    int deleteByExample(Cms2AttachExample example);

    int insert(Cms2AttachWithBLOBs record);

    int insertSelective(Cms2AttachWithBLOBs record);

    List<Cms2AttachWithBLOBs> selectByExampleWithBLOBs(Cms2AttachExample example);

    List<Cms2Attach> selectByExample(Cms2AttachExample example);

    int updateByExampleSelective(@Param("record") Cms2AttachWithBLOBs record, @Param("example") Cms2AttachExample example);

    int updateByExampleWithBLOBs(@Param("record") Cms2AttachWithBLOBs record, @Param("example") Cms2AttachExample example);

    int updateByExample(@Param("record") Cms2Attach record, @Param("example") Cms2AttachExample example);
}