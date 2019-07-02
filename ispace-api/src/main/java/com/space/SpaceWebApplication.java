package com.space;

//import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

//@EnableApolloConfig
@EnableTransactionManagement
@SpringBootApplication
@EnableAsync
@EnableCaching
@MapperScan("com.space.mybatis.dao")
public class SpaceWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpaceWebApplication.class, args);
	}


}
