package com.rahul.Bean;

public class HelloBean {
private String name;
private String age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
static{
System.out.println("Bean Class Loading ........");	
}
public HelloBean() {
	System.out.println("Bean Class Object Created");
}
}
