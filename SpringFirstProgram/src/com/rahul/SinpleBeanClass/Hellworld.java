package com.rahul.SinpleBeanClass;

public class Hellworld {
static {
	System.out.println("Bean is Loading");
	
}
public Hellworld(){
	System.out.println("Bean object is Create by Bean Factory");
}
public String helloUser() {
	return "Hey Rahul Hanks For Invokin This";
}

}
