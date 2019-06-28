package com.space.service;

import com.space.common.dto.star.BannerForm;

import java.util.List;

/**
 * bannerservice
 */
public interface BannerService {


    /**
     *得到banner列表
     */
    List<BannerForm> getBanners(String bannerType, int currentPage, int pageSize);


    List<BannerForm> getImpBanners(String bannerType);

    /**
     * 获取app首页渠道url
     * @param type
     * @return
     */
    String getChanleUrl(String type);

    List<BannerForm> getFiveUnionBanners(String bannerType);

}
