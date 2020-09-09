package com.rahul.MainApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.Bean.HelloBean;

public class NameTagMainApp2 {
	private static HelloBean bean;

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("AppticationContext-name1.xml");

	/*	 bean = (HelloBean) applicationContext.getBean("b1 b2 b3");
	   
	    System.out.println(bean.getName());
	    System.out.println(bean.getAge());
	    System.out.println(bean.getClass());
	    System.out.println(bean.toString());
	    */
	    bean = (HelloBean) applicationContext.getBean("b1");
		   
	    System.out.println(bean.getName());
	    System.out.println(bean.getAge());
	    System.out.println(bean.toString());

	    bean = (HelloBean) applicationContext.getBean("b2");
		   
	    System.out.println(bean.getName());
	    System.out.println(bean.getAge());
	    System.out.println(bean.toString());

	    bean = (HelloBean) applicationContext.getBean("b3");
		   
	    System.out.println(bean.getName());
	    System.out.println(bean.getAge());
	    System.out.println(bean.toString());
		applicationContext.close();
	}
}
