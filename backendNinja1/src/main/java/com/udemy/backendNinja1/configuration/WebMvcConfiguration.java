package com.udemy.backendNinja1.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import com.udemy.backendNinja1.component.RequestTimeInterceptor;

@Configuration
public class WebMvcConfiguration extends WebMvcConfigurerAdapter{
	@Autowired
	@Qualifier("requestTimeInterceptor")
	private RequestTimeInterceptor requestTimeInterceptor;
	
	//Desde Source>>Override Implements Methods>>Seleccionamos addInterceptors
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(requestTimeInterceptor);
	}
}
