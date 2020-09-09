package com.rahul.MainApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.Bean.HelloBean;

public class NameTagMainApp3 {
	private static HelloBean bean;

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("AppticationContext-name1.xml");

	    bean = (HelloBean) applicationContext.getBean("c1");
		   
	    System.out.println(bean.getName());
	    System.out.println(bean.getAge());
	    System.out.println(bean.toString());

	    bean = (HelloBean) applicationContext.getBean("c2");
		   
	    System.out.println(bean.getName());
	    System.out.println(bean.getAge());
	    System.out.println(bean.toString());

	    bean = (HelloBean) applicationContext.getBean("c3");
		   
	    System.out.println(bean.getName());
	    System.out.println(bean.getAge());
	    System.out.println(bean.toString());
		applicationContext.close();
	}
}
