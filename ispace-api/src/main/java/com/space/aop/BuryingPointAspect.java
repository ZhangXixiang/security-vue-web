package com.space.aop;

import com.space.annotation.BuryingPoint;
import com.space.common.util.RequestParamMap;
import com.space.common.util.WEBUtils;
import com.space.util.HSDataSynchroService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
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
import java.util.Map;

/**
 * Created by Administrator on 2019/3/25 0025.
 */
@Aspect
@Component
public class BuryingPointAspect {
    private static final Logger logger = LoggerFactory.getLogger(BuryingPointAspect.class);

    @Autowired
    private HSDataSynchroService hsDataSynchroService;

    @Pointcut("@annotation(com.space.annotation.BuryingPoint)")
    public void sendPVUV() {
    }

    /**
     * 前置 调用恒生数据同步接口
     */
    @Before("sendPVUV()")
    public void doBeforeController(JoinPoint joinPoint) throws InterruptedException {
        HttpServletRequest request = (HttpServletRequest) WEBUtils.getRequest();
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        BuryingPoint action = method.getAnnotation(BuryingPoint.class);
        Map paramMap = RequestParamMap.getParamMap(request);
        paramMap.put("secondModule",action.value());
        hsDataSynchroService.pushDataToHS(paramMap,WEBUtils.getServerUrl(request),WEBUtils.getIpAddr(request),request.getRequestURI());
    }

    /**
     * 后置通知
     */
    @AfterReturning(pointcut = "sendPVUV()", returning = "retValue")
    public void doAfterController(JoinPoint joinPoint, Object retValue) {
    }
}