package com.rahul.MainApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.Bean.HelloBean;

public class mainApp1 {

public static void main(String[] args) {
	ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("AppticationContext.xml");
	 //Using Singleton Scope by Default
	//Same Object create bean CLass
	HelloBean bean = (HelloBean) applicationContext.getBean("h1");  
	System.out.println(bean.getName());
	System.out.println(bean.getAge());
	System.out.println(bean.toString());
	 
	HelloBean bean2 = (HelloBean) applicationContext.getBean("h1");  
	System.out.println(bean2.getName());
	System.out.println(bean2.getAge());
	System.out.println(bean2.toString());
	//To get Different object need to create new bean tag in xml file
	HelloBean bean3 = (HelloBean) applicationContext.getBean("h2");  
	System.out.println(bean3.getName());
	System.out.println(bean3.getAge());
	System.out.println(bean3.toString());
	 
	applicationContext.close();
}
}
