package com.space.aop;

import com.space.common.util.JsonUtil;
import com.space.exception.ParamIsNullException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.support.StandardMultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;

@Order(1)
@Aspect
@Component
public class LogAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Pointcut("execution(public * com.space.controller..*.*(..))")
    public void log(){}

	@Before("log()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
		// 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        // 记录下请求内容
        logger.info("URL : " + request.getRequestURL().toString());
        logger.info("HTTP_METHOD : " + request.getMethod());
        logger.info("IP : " + request.getRemoteAddr());
        logger.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        if(joinPoint.getArgs() != null && joinPoint.getArgs().length > 0){
        	StringBuilder sb = new StringBuilder();
        	for(Object ob: joinPoint.getArgs()){
        		if (ob instanceof BindingResult) {
                    BindingResult result = (BindingResult) ob;
                    if (result.hasErrors()) {
                        FieldError error = result.getFieldError();
                        throw new ParamIsNullException(error.getField(), error.getDefaultMessage());
                    }
                }
        		if(ob instanceof MultipartFile || ob instanceof StandardMultipartHttpServletRequest){

        		}else{
        			sb.append("|" + JsonUtil.objectToJsonString(ob));
        		}
        	}
        	logger.info("ARGS : " + sb.toString());
        }
	}

	@AfterReturning(returning = "ret", pointcut = "log()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        logger.info("RESPONSE : " + ret);
    }

}
