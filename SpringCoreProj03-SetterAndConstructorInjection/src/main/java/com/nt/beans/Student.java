package com.nt.beans;

public class Student {
private int sno;
private String sname;
private String sadd;
private String course;
private double fee;

//constructor for constructor injection
public Student(int sno, String sname /*, String sadd, String course, double fee*/) {
	this.sno = sno;
	this.sname = sname;
//	this.sadd = sadd;
//	this.course = course;
//	this.fee = fee;
}
//setter methods for Setter injection
/*public void setSno(int sno) {
	this.sno = sno;
}

public void setSname(String sname) {
	this.sname = sname;
}

public void setSadd(String sadd) {
	this.sadd = sadd;
}*/

public void setCourse(String course) {
	this.course = course;
}

public void setFee(double fee) {
	this.fee = fee;
}
//setter method for Setter Injection
@Override
public String toString() {
	return "Student (sno=" + sno + ", sname=" + sname + " course=" + course + ", fee=" + fee + ")";
}

}//class
