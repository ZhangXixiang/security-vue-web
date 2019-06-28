package com.space.aop;

import com.space.annotation.NoticeBuryPoint;
import com.space.common.lp.util.SignUtil;
import com.space.common.util.RequestParamMap;
import com.space.common.util.WEBUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
@Aspect
@Component
public class NoticeBuryPointAspect {
    private static final Logger logger = LoggerFactory.getLogger(NoticeBuryPointAspect.class);

    @Autowired
    SignUtil sign;

    @Pointcut("@annotation(com.space.annotation.NoticeBuryPoint)")
    public void sendPVUV() {
    }

    /**
     * 前置 调用恒生数据同步接口
     */
    @Before("sendPVUV()")
    public void doBeforeController(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        NoticeBuryPoint action = method.getAnnotation(NoticeBuryPoint.class);
        logger.info("action名称 " + action.value());
        HttpServletRequest request = (HttpServletRequest) WEBUtils.getRequest();
        Map paramMap = RequestParamMap.getParamMap(request);
        logger.info("请求参数："+paramMap.toString());
        Map map = new HashMap();
        map.put("sourceDomain","");//域名
        map.put("firstModule","资讯公告");//一级模块
        map.put("sourceFlag","");//系统标识
        if("noticeList".equals(action.value())){ //资讯公告列表
            map.put("secondModule","资讯公告列表");//二级模块
           // map.put("thirdModule","资讯公告");//三级模块
        }else if("getNoticeDetail".equals(action.value())){
            map.put("secondModule","资讯公告列表");//二级模块
            map.put("thirdModule","资讯公告详情");//三级模块
        }
        String ipAddr = WEBUtils.getIpAddr(request);
        String requestURI = request.getRequestURI();
        map.put("requestIp",ipAddr);//请求ip
        map.put("requestUrl",requestURI);//请求url
        map.put("requestAccount","");//会员帐号
        sign.doPost(sign.getHsburypointUrl(),map,"UTF-8");

    }

}