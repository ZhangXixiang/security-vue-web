package com.space.mybatis.dao;

import com.space.mybatis.model.Cms2FlinkCtg;
import com.space.mybatis.model.Cms2FlinkCtgExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cms2FlinkCtgMapper {
    int countByExample(Cms2FlinkCtgExample example);

    int deleteByExample(Cms2FlinkCtgExample example);

    int insert(Cms2FlinkCtg record);

    int insertSelective(Cms2FlinkCtg record);

    List<Cms2FlinkCtg> selectByExample(Cms2FlinkCtgExample example);

    int updateByExampleSelective(@Param("record") Cms2FlinkCtg record, @Param("example") Cms2FlinkCtgExample example);

    int updateByExample(@Param("record") Cms2FlinkCtg record, @Param("example") Cms2FlinkCtgExample example);
}