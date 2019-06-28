package com.space.service;

import com.space.common.dto.star.BasicForm;
import com.space.common.dto.star.Cms2AdvAppForm;
import com.space.common.dto.star.InfoForm;
import com.space.common.dto.star.NoticeForm;
import com.space.mybatis.model.Cms2AdvApp;

import java.util.List;
import java.util.Map;

/**
 * 首页数据
 */
public interface IndexService {

    /**
     * 获取首页公告列表
     * @return
     */
    List<NoticeForm> getIndexNotice(String channelCode, int page, int pageSize);

    /**
     * 根据类型获取资讯列表
     * @param basicForm
     * @return
     */
    List<NoticeForm> getNoticeByType(BasicForm basicForm);

    /**
     * 获取平台访问量
     * @return
     */
    String getAccessNum();

    /**
     * 根据id获取详情
     * @param contId
     * @return
     */
    Map getNoticeById(String contId);

    String getNoticeLinkById(String contId);

    /**
     * 获取某类资讯总条数
     * @param basicForm
     * @return
     */
    Long countNoticeByType(BasicForm basicForm);

    /**
     * 获取资讯公告列表
     * @return
     */
    List<Map> getNoticeList(InfoForm information);

    /**
     * 获取banner列表
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
     * 根据id获取资讯公告详情信息
     * @param id
     * @return
     */
    Map getDetailInformation(String id);

    /**
     * 新建资讯公告
     * @param map
     * @return
     */
    int addInformation(Map map);

    /**
     * 资讯公告点击查看量加1操作
     * @param contId
     */
    void updateViewCount(String contId);

    /**
     * 获取安卓最新版本code
     * @return
     */
    String getLocalVersion();

    /**
     * 获取下载连接url
     * @return
     */
    String downPic();

    /**
     * 首页连接图片
     * @return
     */
    List<Cms2AdvApp> getChanlePic(Cms2AdvAppForm cms2AdvAppForm);

    /**
     * 创建Cms2AdvApp
     * @param cms2AdvAppForm
     * @return
     */
    int saveChanlePic(Cms2AdvAppForm cms2AdvAppForm);

    /**
     * 获取某类资讯id集合
     * @param channerCode
     * @return
     */
    List<String> getNoticeIdsByType(String channerCode);
}
