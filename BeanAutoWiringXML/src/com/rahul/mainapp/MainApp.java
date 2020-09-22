package com.rahul.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.beans.Employee;

public class MainApp {

	public static void main(String[] args) {

		// Invoke the IOC container

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// create the bean
		Employee employee = (Employee) applicationContext.getBean("employee");

		// use the bean
		employee.displayDetails();

		// close the container
		applicationContext.close();

	}

}
