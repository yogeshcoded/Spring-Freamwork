package com.nt.comps;

public class AadharDeatils {
private long aadharNo;
private long age;
private long mobielNo;


public AadharDeatils(long aadharNo, long age, long mobielNo) {
	System.out.println("AadharDeatils.3-param comdtrictor");
	this.aadharNo = aadharNo;
	this.age = age;
	this.mobielNo = mobielNo;
}


@Override
public String toString() {
	return super.toString()+"AadharDeatils [aadharNo=" + aadharNo + ", age=" + age + ", mobielNo=" + mobielNo + "]";
}



}
