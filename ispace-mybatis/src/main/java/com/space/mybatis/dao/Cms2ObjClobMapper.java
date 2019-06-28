package com.space.mybatis.dao;

import com.space.mybatis.model.Cms2ObjClob;
import com.space.mybatis.model.Cms2ObjClobExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cms2ObjClobMapper {
    int countByExample(Cms2ObjClobExample example);

    int deleteByExample(Cms2ObjClobExample example);

    int insert(Cms2ObjClob record);

    int insertSelective(Cms2ObjClob record);

    List<Cms2ObjClob> selectByExampleWithBLOBs(Cms2ObjClobExample example);

    List<Cms2ObjClob> selectByExample(Cms2ObjClobExample example);

    int updateByExampleSelective(@Param("record") Cms2ObjClob record, @Param("example") Cms2ObjClobExample example);

    int updateByExampleWithBLOBs(@Param("record") Cms2ObjClob record, @Param("example") Cms2ObjClobExample example);

    int updateByExample(@Param("record") Cms2ObjClob record, @Param("example") Cms2ObjClobExample example);
}