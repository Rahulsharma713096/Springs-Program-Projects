package com.rahul.bean;

public class Employee {
private String name;
private int age;
private String address;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Inside the Employee Table Values"+"\n name \t age \t address"+"\n"+name+"\t"+age+"\t"+address;
}
public void display() {
	System.out.println("Display()");
	System.out.println(toString());
}
public void display1() {
	System.out.println("Display1()");
	System.out.print(getName()+"\t");
	System.out.print(getAge()+"\t");
	System.out.print(getAddress());
}
}
