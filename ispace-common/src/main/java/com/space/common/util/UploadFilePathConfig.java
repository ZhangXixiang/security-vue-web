package com.space.common.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class UploadFilePathConfig extends WebMvcConfigurerAdapter {

    @Value("${file.staticAccessPath}")
    private String staticAccessPath;
    @Value("${upload-path}")
    private String uploadFolder;

    @Value("${staticLocations}")
    private String staticLocations;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
       // registry.addResourceHandler("/vendors/**").addResourceLocations(staticLocations);
      //  registry.addResourceHandler(staticAccessPath).addResourceLocations("file:"+uploadFolder+"data/");
        registry.addResourceHandler(staticAccessPath).addResourceLocations("file:"+ uploadFolder+"data/");
        registry.addResourceHandler("/**").addResourceLocations(staticLocations);
        super.addResourceHandlers(registry);
    }
}
