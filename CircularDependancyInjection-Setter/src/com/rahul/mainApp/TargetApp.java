package com.rahul.mainApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.Beans.Branch;
import com.rahul.Beans.Student;

public class TargetApp {

	public static void main(String[] args) {

		// Activate IOC container

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// create the bean
		Student student = (Student) applicationContext.getBean("student");
		Branch branch = (Branch) applicationContext.getBean("branch");

		// use the bean
		System.out.println("The student Name is :" + student.getStudentName());
		System.out.println("The Branch Name is  :" + branch.getBranchName());

		System.out.println();
		System.out.println(student.getBranch());
		System.out.println(branch.getStudent());

		// close the container
		applicationContext.close();

	}

}
