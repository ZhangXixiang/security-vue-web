//package com.space.mybatis.config;
//
//import java.util.Properties;
//import org.springframework.boot.autoconfigure.AutoConfigureAfter;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import tk.mybatis.spring.mapping.MapperScannerConfigurer;
//
//@Configuration
//@AutoConfigureAfter(DataBaseConfig.class)
//public class MyBatisMapperScannerConfig {
//
//	@Bean
//    public MapperScannerConfigurer mapperScannerConfigurer() {
//        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
//        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
//        mapperScannerConfigurer.setBasePackage("com.space.mybatis.dao");//每张表对应的XXMapper.java interface类型的Java文件
//        Properties properties = new Properties();
//        properties.setProperty("mappers", "tk.mybatis.mapping.common.Mapper");
//        properties.setProperty("notEmpty", "false");// insert和update中，是否判断字符串类型!=''，少数方法会用到
//        properties.setProperty("IDENTITY","MYSQL");// 数据库方言（主要用于：取回主键的方式）
//        properties.setProperty("ORDER","BEFORE");
//        mapperScannerConfigurer.setProperties(properties);
//        return mapperScannerConfigurer;
//    }
//
//
//}
