package Simplej2seCode;

import com.rahul.SinpleBeanClass.Hellworld;

public class mainApp {
public static void main(String[] args) {
	System.out.println("Simple Program Using J2SE code and JVM container");
	System.out.println("___________________________________________________");
	Hellworld hw = new Hellworld();
	
	System.out.println(hw.helloUser());
}
}
