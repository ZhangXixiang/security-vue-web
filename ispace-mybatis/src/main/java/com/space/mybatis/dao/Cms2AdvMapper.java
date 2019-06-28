package com.space.mybatis.dao;

import com.space.common.dto.star.BannerForm;
import com.space.mybatis.model.Cms2Adv;
import com.space.mybatis.model.Cms2AdvExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Cms2AdvMapper {
    int countByExample(Cms2AdvExample example);

    int deleteByExample(Cms2AdvExample example);

    int insert(Cms2Adv record);

    int insertSelective(Cms2Adv record);

    List<Cms2Adv> selectByExampleWithBLOBs(Cms2AdvExample example);

    List<Cms2Adv> selectByExample(Cms2AdvExample example);

    int updateByExampleSelective(@Param("record") Cms2Adv record, @Param("example") Cms2AdvExample example);

    int updateByExampleWithBLOBs(@Param("record") Cms2Adv record, @Param("example") Cms2AdvExample example);

    int updateByExample(@Param("record") Cms2Adv record, @Param("example") Cms2AdvExample example);

    /**
     * 根据banner类型获取列表
     * @return
     */
    List<BannerForm> selectBannerByType(@Param("bannerType") String bannerType);
}