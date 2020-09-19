package bean;

public class Student {
private String sid;
private String sname;
private int age;
private Course course;

public String getSid() {
	return sid;
}

public void setSid(String sid) {
	this.sid = sid;
}

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public Course getCourse() {
	return course;
}

public void setCourse(Course course) {
	this.course = course;
}

public void display() {
	System.out.println("The Details are:");
	System.out.print("Student Name:"+getSname());
	System.out.print("\t"+"Student Id:"+getSid());
	System.out.print("\t"+"Student Age:"+getAge());
	System.out.println();
	if(!(course==null)) {
	System.out.print("Student course:"+course.getCname());
	System.out.print("\t"+"Student course Id:"+course.getId());
	System.out.print("\t"+"Student course Cost:"+course.getCost());
	}
	
}
}
