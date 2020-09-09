package com.rahul.springInversionControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.SinpleBeanClass.HelloWorld;

public class MainAppApplicationContext {
public static void main(String[] args) {
	//Step1: Load the Configuration File for the Container
	ClassPathXmlApplicationContext applictionContext = new ClassPathXmlApplicationContext("AppticationContext.xml");
	 
	//Step2: Use the applicationContext and get the bean
	HelloWorld bean = (HelloWorld) applictionContext.getBean("helloworld");
	
	//Step3: use the bean to invoke the methods
	System.out.println(bean.helloUser());
	
	//Step4: close the Resource
	applictionContext.close();
	
	
}
}
