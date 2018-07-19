package com.psq.ssmtrain.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		//允许外部访问的接口设置
		registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET","POST","PUT","OPTIONS","DELETE","PATCH").allowCredentials(true).maxAge(3600);
	}
	
}
