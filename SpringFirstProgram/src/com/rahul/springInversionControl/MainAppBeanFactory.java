package com.rahul.springInversionControl;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.rahul.SinpleBeanClass.Hellworld;

@SuppressWarnings("deprecation")
public class MainAppBeanFactory {
	
	public static void main(String[] args) {
		System.out.println("Program Using J2EE code and Springs container");
		//Step1: Creating a resource
		  Resource resource = new ClassPathResource("bean.xml");
		//Step2:Create BeanFactory to get BeanObject
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		
		Hellworld	bean=(Hellworld)factory.getBean("helloworld");
		
		//Step3:Use Bean to invoke the method of Class
		
		System.out.println(bean.helloUser());
	}
}
