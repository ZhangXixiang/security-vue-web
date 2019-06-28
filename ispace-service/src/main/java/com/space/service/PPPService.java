package com.space.service;

import com.space.common.dto.star.BannerForm;
import com.space.common.dto.star.BasicForm;
import com.space.common.dto.star.ContactForm;
import com.space.common.dto.star.NoticeForm;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

/**
 * ppp
 */
public interface PPPService {

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
     * 根据id获取详情
     * @param contId
     * @return
     */
    Map getNoticeById(String contId);

    /**
     * 获取某类资讯总条数
     * @param basicForm
     * @return
     */
    Long countNoticeByType(BasicForm basicForm);

    /**
     * 资讯公告点击查看量加1操作
     * @param contId
     */
    void updateViewCount(String contId);

    /**
     * 获取某类资讯id集合
     * @param channerCode
     * @return
     */
    List<String> getNoticeIdsByType(String channerCode);

    /**
     * 根据广告类型获取banner
     * @param type
     * @return
     */
    List<BannerForm> getPPPBanner(String type);

    /**
     * 获取联系人信息
     * @return
     */
    ContactForm getContactInfo() throws UnsupportedEncodingException;
}
