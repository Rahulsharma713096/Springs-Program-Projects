package com.rahul.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hellobean implements InitializingBean, DisposableBean   {
	static {
		
		System.out.println("Inside Static Method");
		}
 public Hellobean() {
		System.out.println("Inside Constructor");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Closing up JDBC envirnment");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Setting up JDBC envirnment");
	}

}
