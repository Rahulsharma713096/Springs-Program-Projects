package com.rahul.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;

public class HelloBean {
   static {
	   System.out.println("BeanLifeCycle:BeanLoading......");
   }
   @Value("RahulSharma")
   String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
   public HelloBean() {
	   System.out.println("BeanLifeCycle:BeanInstantation through Constructor");
   }
	public String sayHello() {
		return "Hello"+ name;
	}
	@PostConstruct
	public void customInit(){
	System.out.println("Init");	
	}
	@PreDestroy
	public void customDestroy() {
		System.out.println("Destroy");
	}
}
