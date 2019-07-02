package com.space.config.datasource;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DataSourceAop {
	@Before("execution(* com.space.service.AnswerService.*(..))")
	public void setDataSource2test01() {
		System.err.println("cms业务");
		DataSourceType.setDataBaseType(DataSourceType.DataBaseType.TEST01);
	}
}
