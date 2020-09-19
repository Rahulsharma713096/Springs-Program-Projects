package com.rahul.mainApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.bean.Employee;

public class MainApp {

	public static void main(String[] args) {

		// Invoke the IOC container
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// get the bean
		Employee employee = (Employee) applicationContext.getBean("employee");

		// use the bean
		employee.displayDetails();

		// close the bean
		applicationContext.close();

	}

}
