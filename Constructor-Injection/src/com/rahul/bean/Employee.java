package com.rahul.bean;

public class Employee {
private String name;
private int age;
private String address;
public Employee(String name, int age, String address) {
	super();
	this.name = name;
	this.age = age;
	this.address = address;
}
public void display() {
	System.out.println(toString());
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Inside the Employee Table Values"+"\n name \t age \t address"+"\n"+name+"\t"+age+"\t"+address;
}

}
