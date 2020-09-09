package com.rahul.MainApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.Bean.HelloBean;

public class App1UsingId {
public static void main(String[] args) {
	// Informing the Spring IOC Container to creates  objects specfied an application context
ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("AppticationContext-id.xml");
	
//Get bean from container using id specifies in IOC container
            HelloBean bean = (HelloBean) applicationContext.getBean("helloworld");

            //Use bean to invoke methods in bean
            System.out.println(bean.getName());
            System.out.println(bean.getAge());
            
            
            //close the Container
            applicationContext.close();
}
}
