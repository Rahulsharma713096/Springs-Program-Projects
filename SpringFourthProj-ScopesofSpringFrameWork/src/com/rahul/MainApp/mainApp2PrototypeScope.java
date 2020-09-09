package com.rahul.MainApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.Bean.HelloBean;

public class mainApp2PrototypeScope {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("AppticationContext-Scope-Prototype.xml");
		 //Using Prototype Scope 
	//Using same bean we use to get different object
		HelloBean bean = (HelloBean) applicationContext.getBean("h1");  
		System.out.println(bean.getName());
		System.out.println(bean.getAge());
		System.out.println(bean.toString());
		 
		HelloBean bean2 = (HelloBean) applicationContext.getBean("h1");  
		System.out.println(bean2.getName());
		System.out.println(bean2.getAge());
		System.out.println(bean2.toString());
		
		applicationContext.close();
	}
}
