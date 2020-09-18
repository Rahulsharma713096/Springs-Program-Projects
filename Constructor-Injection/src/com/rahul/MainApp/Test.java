package com.rahul.MainApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.bean.Employee;

public class Test {
public static void main(String[] args) {
	ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	Employee epbean = (Employee) applicationContext.getBean("ep");
  epbean.display();
  applicationContext.close();
}
}
