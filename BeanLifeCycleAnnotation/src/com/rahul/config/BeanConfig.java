package com.rahul.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rahul.bean.HelloBean;

@Configuration
public class BeanConfig {
	@Bean(initMethod="customInit",destroyMethod="customDestroy")
public HelloBean hellobean() {
	return new HelloBean();
}

}
