//package com.space.mybatis.config;
//
//import java.util.Properties;
//import javax.sql.DataSource;
//import org.apache.ibatis.plugin.Interceptor;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.core.io.support.ResourcePatternResolver;
//
//import com.github.pagehelper.PageHelper;
//
//@Configuration
//public class DataBaseConfig {
//
//	@Value("${spring.datasource.type}")
//	private Class<? extends DataSource> dataSourceType;
//
//	@Bean(name = "dataSource", destroyMethod = "close", initMethod = "init")
//	@Primary
//	@ConfigurationProperties(prefix = "spring.master", ignoreUnknownFields = false)
//	public DataSource dataSource() {
//		return DataSourceBuilder.create().type(dataSourceType).build();
//	}
//
//	@Bean(name = "sqlSessionFactory")
//    public SqlSessionFactory sqlSessionFactoryBean() {
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setDataSource(dataSource());
//        bean.setTypeAliasesPackage("com.space.mybatis.model");//每一张表对应的实体类
//
//        //分页插件
//        PageHelper pageHelper = new PageHelper();
//        Properties properties = new Properties();
//        properties.setProperty("dialect", "mysql");
//
//        //该參数默觉得false设置为true时，会将RowBounds第一个參数offset当成pageNum页码使用和startPage中的pageNum效果一样
//        properties.setProperty("offsetAsPageNum", "true");
//
//        //该參数默觉得false设置为true时，使用RowBounds分页会进行count查询
//        properties.setProperty("rowBoundsWithCount", "true");
//
//        /*启用合理化时，如果pageNum<1会查询第一页，如果pageNum>pages会查询最后一页
//        	禁用合理化时，如果pageNum<1或pageNum>pages会返回空数据*/
//        properties.setProperty("reasonable", "false");
//
//        //支持通过Mapper接口参数来传递分页参数
//        properties.setProperty("supportMethodsArguments", "true");
//
//        //always总是返回PageInfo类型,check检查返回类型是否为PageInfo,none返回Page
//        properties.setProperty("returnPageInfo", "check");
//
//        properties.setProperty("params", "pageNum=page;pageSize=rows;orderBy=orderBy");
//        pageHelper.setProperties(properties);
//        //添加插件
//        bean.setPlugins(new Interceptor[]{pageHelper});
//
//        //添加XML目录
//        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        try {
//            bean.setMapperLocations(resolver.getResources("classpath:mapping/*.xml"));//每张表对应的xml文件
//            return bean.getObject();
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException(e);
//        }
//    }
//
//}