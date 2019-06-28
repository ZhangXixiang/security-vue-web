package com.space.service.impl;

import com.alibaba.fastjson.JSON;
import com.space.common.dto.star.BannerForm;
import com.space.common.util.redis.RedisUtil;
import com.space.mybatis.dao.Cms2AdvMapper;
import com.space.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/1/24 0024.
 */
@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    private Cms2AdvMapper cms2AdvMapper;

    @Autowired
    private RedisUtil redisUtil;

    @Value("${mobileTopBanner}")
    private String mobileTopBanner;
    @Value("${mobileImpBanner}")
    private String mobileImpBanner;
    @Value("${fiveUnionBanner}")
    private String fiveUnionBanner;
    @Value("${urlMap}")
    private String urlMap;
    
    /**
     * 得到banner列表
     *
     * @param bannerType
     */
    @Override
    public List<BannerForm> getBanners(String bannerType, int currentPage, int pageSize){
        /*PageHelper.startPage(currentPage, pageSize);
        return cms2AdvMapper.selectBannerByType(bannerType);*/
        if(redisUtil.hasKey(bannerType)){
            return  (List<BannerForm>) redisUtil.get(bannerType);
        }else{
            /**一期写死*/
            List<BannerForm> list = new ArrayList<>();
            String[] split = mobileTopBanner.split("\\|");
            for(String banner : split){
                String[] split1 = banner.split("\\,");
                BannerForm bannerForm  = new BannerForm();
                for(String spli : split1){
                    //   bannerForm  = new BannerForm();
                    if(spli.startsWith("link")){
                        bannerForm.setLink(spli.substring(4));
                    }
                    if(spli.startsWith("url")){
                        bannerForm.setBannerUrl(spli.substring(3));
                    }

                }
                list.add(bannerForm);
            }
            redisUtil.set(bannerType,list,3600);
            return list;
        }
    }


    /**
     * 重点推荐banner
     * @return
     */
    @Override
    public List<BannerForm> getImpBanners(String bannerType){
        /*PageHelper.startPage(currentPage, pageSize);
        return cms2AdvMapper.selectBannerByType(bannerType);*/
        if(redisUtil.hasKey(bannerType)){
            return  (List<BannerForm>) redisUtil.get(bannerType);
        }else{
            /**一期写死*/
            List<BannerForm> list = new ArrayList<>();
            String[] split = mobileImpBanner.split("\\|");
            for(String banner : split){
                String[] split1 = banner.split("\\,");
                BannerForm bannerForm  = new BannerForm();
                for(String spli : split1){
                    //   bannerForm  = new BannerForm();
                    if(spli.startsWith("link")){
                        bannerForm.setLink(spli.substring(4));
                    }
                    if(spli.startsWith("url")){
                        bannerForm.setBannerUrl(spli.substring(3));
                    }

                }
                list.add(bannerForm);
            }
            redisUtil.set(bannerType,list,3600);
            return list;
        }
    }

    /**
     * 获取app首页渠道url
     *
     * @param type
     * @return
     */
    @Override
    public String getChanleUrl(String type) {
        Map mapTypes = JSON.parseObject(urlMap);
        return (String) mapTypes.get(type);
    }

    /**
     * 五大联盟banner
     * @param bannerType
     * @return
     */
    @Override
    public List<BannerForm> getFiveUnionBanners(String bannerType) {
        if(redisUtil.hasKey(bannerType)){
            return  (List<BannerForm>) redisUtil.get(bannerType);
        }else{
            /**一期写死*/
            List<BannerForm> list = new ArrayList<>();
            String[] split = fiveUnionBanner.split("\\|");
            for(String banner : split){
                String[] split1 = banner.split("\\,");
                BannerForm bannerForm  = new BannerForm();
                for(String spli : split1){
                    //   bannerForm  = new BannerForm();
                    if(spli.startsWith("link")){
                        bannerForm.setLink(spli.substring(4));
                    }
                    if(spli.startsWith("url")){
                        bannerForm.setBannerUrl(spli.substring(3));
                    }

                }
                list.add(bannerForm);
            }
            redisUtil.set(bannerType,list,3600);
            return list;
        }
    }

}
