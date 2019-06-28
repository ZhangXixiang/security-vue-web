package com.space.util;


import com.space.common.lp.util.SignUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/3/26 0026.
 */

/**
 * 恒生数据同步接口
 */
@Service
public class HSDataSynchroService {
    private static final Logger logger = LoggerFactory.getLogger(HSDataSynchroService.class);
    @Autowired
    SignUtil sign;
    @Autowired
    private HsHttpsUtils hsHttpsUtils;
    /**
     * 数据同步至恒生
     */
    @Async("asyncPoolTaskExecutor")
    public void pushDataToHS(Map paramMap,String sourceDomain,String ipAddr,String requestURI) throws InterruptedException {
        logger.info("请求参数："+paramMap.toString());
        Map map = new HashMap();
        map.put("sourceDomain",sourceDomain);//域名
        map.put("sourceFlag","四大空间APP");//系统标识
        map.put("firstModule","四大空间APP");//一级模块
        map.put("secondModule",paramMap.get("secondModule"));//二级模块
        map.put("thirdModule",paramMap.get("thirdModule"));//三级模块
        map.put("requestIp",ipAddr);//请求ip
        map.put("requestUrl",requestURI);//请求url
        map.put("requestAccount","");//会员帐号
        hsHttpsUtils.post(sign.getHsburypointUrl(),map);
    }

}
