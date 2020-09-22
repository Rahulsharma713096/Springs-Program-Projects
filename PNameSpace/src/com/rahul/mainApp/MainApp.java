package com.rahul.mainApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.Beans.Student;

public class MainApp {

	public static void main(String[] args) {

		// Invoke the IOC container

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// create the bean

		Student student = (Student) applicationContext.getBean("student");

		// use the bean
		student.displayDetails();

		// close the container
		applicationContext.close();

	}

}
