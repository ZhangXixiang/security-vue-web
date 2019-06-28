//package com.space.config;
//
//import javax.servlet.MultipartConfigElement;
//import org.springframework.boot.web.servlet.MultipartConfigFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import com.fasterxml.jackson.annotation.JsonInclude.Include;
//import com.fasterxml.jackson.databind.DeserializationFeature;
//import com.space.common.util.CustomObjectMapper;
//
//@Configuration
//public class BeanConfig implements WebMvcConfigurer {
//
//	public MappingJackson2HttpMessageConverter converter() {
//		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
//		CustomObjectMapper objectMapper = new CustomObjectMapper();
//		objectMapper.setDateFormatPattern("yyyy-MM-dd HH:mm:ss");
//		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//		objectMapper.setSerializationInclusion(Include.NON_NULL);
//		converter.setObjectMapper(objectMapper);
//		return converter;
//	}
//
//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
//		// 注册拦截器
//		//InterceptorRegistration ir = registry.addInterceptor(tokenInterception());
//		// 配置拦截的路径
//		//ir.addPathPatterns("/**");
//		// 配置不拦截的路径
//		//ir.excludePathPatterns("/v1/mini/hs/login") //登陆接口
//		  //.excludePathPatterns("/swagger*/**"); //接口文档页面
//	}
//
//	/**
//	 * 根据springboot默认规则，默认访问
//	 * 						/static
//	 * 						/public
//	 * 						/resources
//	 * 						/META-INF/resources
//	 * 此项目资源文件配置在/static文件下，所以不需要手动处理静态资源
//	 */
//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		//配置静态资源处理
//		registry.addResourceHandler("/static/**").addResourceLocations("classpath:/WEB-INF/static/**");
//	}
//
//	/**
//     * 文件上传配置
//     * @return
//     */
//	@Bean(name = "multipartResolver")
//    public MultipartConfigElement multipartResolver() {
//		MultipartConfigFactory factory = new MultipartConfigFactory();
//		//文件最大
//		factory.setMaxFileSize("60MB"); //KB,MB
//		/// 设置总上传数据总大小
//		factory.setMaxRequestSize("60MB");
//		return factory.createMultipartConfig();
//    }
//
//	/*@Bean
//	public TokenInterception tokenInterception() {
//		return new TokenInterception();
//	}*/
//
//}
