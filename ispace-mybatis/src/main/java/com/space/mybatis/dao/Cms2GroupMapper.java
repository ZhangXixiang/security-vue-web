package com.space.mybatis.dao;

import com.space.mybatis.model.Cms2Group;
import com.space.mybatis.model.Cms2GroupExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cms2GroupMapper {
    int countByExample(Cms2GroupExample example);

    int deleteByExample(Cms2GroupExample example);

    int insert(Cms2Group record);

    int insertSelective(Cms2Group record);

    List<Cms2Group> selectByExampleWithBLOBs(Cms2GroupExample example);

    List<Cms2Group> selectByExample(Cms2GroupExample example);

    int updateByExampleSelective(@Param("record") Cms2Group record, @Param("example") Cms2GroupExample example);

    int updateByExampleWithBLOBs(@Param("record") Cms2Group record, @Param("example") Cms2GroupExample example);

    int updateByExample(@Param("record") Cms2Group record, @Param("example") Cms2GroupExample example);
}