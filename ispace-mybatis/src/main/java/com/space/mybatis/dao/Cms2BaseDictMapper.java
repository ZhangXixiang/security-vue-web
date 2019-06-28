package com.space.mybatis.dao;

import com.space.mybatis.model.Cms2BaseDict;
import com.space.mybatis.model.Cms2BaseDictExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface Cms2BaseDictMapper {
    int countByExample(Cms2BaseDictExample example);

    int deleteByExample(Cms2BaseDictExample example);

    int insert(Cms2BaseDict record);

    int insertSelective(Cms2BaseDict record);

    List<Cms2BaseDict> selectByExampleWithBLOBs(Cms2BaseDictExample example);

    List<Cms2BaseDict> selectByExample(Cms2BaseDictExample example);

    int updateByExampleSelective(@Param("record") Cms2BaseDict record, @Param("example") Cms2BaseDictExample example);

    int updateByExampleWithBLOBs(@Param("record") Cms2BaseDict record, @Param("example") Cms2BaseDictExample example);

    int updateByExample(@Param("record") Cms2BaseDict record, @Param("example") Cms2BaseDictExample example);

    Map selectByContId(@Param("contId") String contId);

    Map getInfoByContId(@Param("contId") String id);

    String getNoticeLinkByContId(@Param("contId") String id);
}