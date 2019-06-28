package com.space.mybatis.dao;

import com.space.common.dto.star.BannerForm;
import com.space.common.dto.star.InfoForm;
import com.space.common.dto.star.NoticeForm;
import com.space.mybatis.model.Cms2ContExtExample;
import com.space.mybatis.model.Cms2ContExtWithBLOBs;
import com.space.mybatis.model.Cms2ContExt;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface Cms2ContExtMapper {
    int countByExample(Cms2ContExtExample example);

    int deleteByExample(Cms2ContExtExample example);

    int insert(Cms2ContExtWithBLOBs record);

    int insertSelective(Cms2ContExtWithBLOBs record);

    List<Cms2ContExtWithBLOBs> selectByExampleWithBLOBs(Cms2ContExtExample example);

    List<Cms2ContExt> selectByExample(Cms2ContExtExample example);

    int updateByExampleSelective(@Param("record") Cms2ContExtWithBLOBs record, @Param("example") Cms2ContExtExample example);

    int updateByExampleWithBLOBs(@Param("record") Cms2ContExtWithBLOBs record, @Param("example") Cms2ContExtExample example);

    int updateByExample(@Param("record") Cms2ContExt record, @Param("example") Cms2ContExtExample example);

    /**
     * 首页公告
     * @return
     */
    List<NoticeForm> selectIndexNotice(@Param("channelCode") String channelCode);

    /**
     * 获取某类资讯总条数
     * @param channelCode
     * @return
     */
    Long countNoticeByType(@Param("channelCode") String channelCode);

    /**
     * 获取资讯公告列表
     * @param information
     * @return
     */
    List<Map> getNoticeList(InfoForm information);

    /**
     *获取banner列表
     * @param information
     * @return
     */
    List<Map> getBannerList(InfoForm information);

    /**
     * 获取资讯类型名称，code
     * @return
     */
    List<Map> getChanles();

    /**
     * 获取轮播版位类
     * @return
     */
    List<Map> getAdvSpace();

    /**
     * 资讯公告点击查看量加1操作
     * @param contId
     */
    void updateViewCount(@Param("contId") String contId);

    List<String> getNoticeIdsByType(@Param("channerCode") String channerCode);

    /**
     * 根据广告类型获取banner
     * @param type
     * @return
     */
    List<BannerForm> getPPPBanner(@Param("type") String type);
}