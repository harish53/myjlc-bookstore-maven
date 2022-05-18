package com.jlcindia.springboot;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/*
* @Author : Srinivas Dande
* @company : Java Learning Center
* */
@SpringBootApplication 
public class JLCApplicationConfig  implements WebMvcConfigurer{
	
	 @Override
	  public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	  }
}
