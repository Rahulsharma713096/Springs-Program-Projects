package com.rahul.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.bean.Hellobean;

public class mainApp {
public static void  main(String[] ars) {
 ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
 Hellobean bean = (Hellobean) applicationContext.getBean("hellobean");
	System.out.println(bean.toString());
 applicationContext.close();
}
}
