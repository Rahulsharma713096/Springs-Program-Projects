package com.rahul.SimpleBeanClass;

public class HelloWorld {
	private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	static {
		System.out.println("Bean is Loading");
		
	}
	public HelloWorld(){
		System.out.println("Bean object is Create by ApplicationContext IOC container");
	}
	public String helloUser() {
		return "Hey Rahul thanks For Invokin The vlaue of username is:"+username;
	}
}
