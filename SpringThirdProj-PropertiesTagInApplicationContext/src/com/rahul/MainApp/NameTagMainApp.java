package com.rahul.MainApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.Bean.HelloBean;

public class NameTagMainApp {
public static void main(String[] args) {
	ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("AppticationContext-name.xml");

	HelloBean bean = (HelloBean) applicationContext.getBean("hellobean");
   
    System.out.println(bean.getName());
    System.out.println(bean.getAge());
    System.out.println(bean.toString());
	applicationContext.close();
}
}
