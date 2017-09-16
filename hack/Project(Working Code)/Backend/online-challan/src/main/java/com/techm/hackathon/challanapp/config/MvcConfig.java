package com.techm.hackathon.challanapp.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableAutoConfiguration
@EnableSwagger2
@ComponentScan(basePackages = {"com.techm.hackathon.challanapp.controller"})
public class MvcConfig extends WebMvcConfigurerAdapter{
	
	 @Override
	  public void addResourceHandlers(ResourceHandlerRegistry registry)  {
	    
	    registry.addResourceHandler("challan-api.html").addResourceLocations("/docs/");
	    registry.addResourceHandler("springfox.js").addResourceLocations("/docs/js/");

	    registry.addResourceHandler("/swagger-ui.html")
	        .addResourceLocations("classpath:/META-INF/resources/");
	    registry.addResourceHandler("/webjars/**")
	        .addResourceLocations("classpath:/META-INF/resources/webjars/");
	  }
	 @Override
		public void addCorsMappings(CorsRegistry registry) {
			registry.addMapping("/**")
				.allowedOrigins("*")
				.allowedMethods("POST", "GET")
				.allowCredentials(false).maxAge(3600);
		}
}
