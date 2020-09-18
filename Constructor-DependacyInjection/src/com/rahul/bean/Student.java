package com.rahul.bean;

public class Student {
private String sid;
private String sname;
private int age;
private Course course;
public Student(String sid, String sname, int age, Course course) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.age = age;
	this.course = course;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", age=" + age + ", course=" + course + "]";
}
public void display() {
	System.out.println(toString());
}
}
