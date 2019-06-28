package com.space.config.datasource;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DataSourceAop {
	@Before("execution(* com.space.service.BannerService.*(..))")
	public void setDataSource2test01() {
		System.err.println("cms业务");
		DataSourceType.setDataBaseType(DataSourceType.DataBaseType.TEST01);
	}
	@Before("execution(* com.space.service.IndexService.*(..))")
	public void setDataSource2test011() {
		System.err.println("cms业务");
		DataSourceType.setDataBaseType(DataSourceType.DataBaseType.TEST01);
	}

	@Before("execution(* com.space.service.IMService.*(..))")
	public void setDataSource2test02() {
		System.err.println("统一会员业务");
		DataSourceType.setDataBaseType(DataSourceType.DataBaseType.TEST02);
	}

	@Before("execution(* com.space.service.PPPService.*(..))")
	public void setDataSource3test01() {
		System.err.println("ppp业务");
		DataSourceType.setDataBaseType(DataSourceType.DataBaseType.TEST03);
	}
}
