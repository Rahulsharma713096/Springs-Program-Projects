package com.rahul.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rahul.bean.HelloBean;
import com.rahul.config.BeanConfig;

public class MainApp {
public static void main(String[] args) {
	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
System.out.println();
HelloBean bean = (HelloBean) applicationContext.getBean("hellobean");

System.out.println(bean.sayHello());

bean.setName("RAHUL");
System.out.println(bean.sayHello());
applicationContext.close();
}
}
