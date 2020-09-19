package com.mainApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.Bean.Student;

public class TargetApp {

	public static void main(String[] args) {

		// Invoke the IOC Container
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// create the bean
		Student student = (Student) applicationContext.getBean("student");

		// use the bean
		student.displayDetails();

		// close the bean
		applicationContext.close();
	}

}
