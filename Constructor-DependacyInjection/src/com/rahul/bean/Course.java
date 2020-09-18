package com.rahul.bean;

public class Course {
private String id;
private String cname;
private int cost;
public Course(String id, String cname, int cost) {
	super();
	this.id = id;
	this.cname = cname;
	this.cost = cost;
}
@Override
public String toString() {
	return "Course [id=" + id + ", cname=" + cname + ", cost=" + cost + "]";
}

}
