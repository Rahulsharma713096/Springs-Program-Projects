package com.rahul.SinpleBeanClass;

public class HelloWorld {
	static {
		System.out.println("Bean is Loading");
		
	}
	public HelloWorld(){
		System.out.println("Bean object is Create by ApplicationContext IOC container");
	}
	public String helloUser() {
		return "Hey Rahul thanks For Invokin This";
	}
}
