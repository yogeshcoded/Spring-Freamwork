//PationBO.java

package com.nt.bo;

public class CoronaPatientBO {
private Integer pid;
private String pname;
private String padd;
private Double totalBill;

//setter && getter methods
public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getPadd() {
	return padd;
}
public void setPadd(String padd) {
	this.padd = padd;
}
public Double getTotalBill() {
	return totalBill;
}
public void setTotalBill(Double totalBill) {
	this.totalBill = totalBill;
}
}//class
