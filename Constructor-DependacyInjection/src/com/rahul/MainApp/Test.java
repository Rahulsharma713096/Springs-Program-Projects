package com.rahul.MainApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.bean.Student;

public class Test {
public static void main(String[] args) {
	ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	Student epbean = (Student) applicationContext.getBean("sp");
  epbean.display();
  applicationContext.close();
}
}
