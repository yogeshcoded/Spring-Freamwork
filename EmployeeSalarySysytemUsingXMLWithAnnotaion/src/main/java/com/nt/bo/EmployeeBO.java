package com.nt.bo;

public class EmployeeBO {
private Integer  eid;
private  String ename;
private String  dept;
private String desg;
private Double  basicSal;
private Double grossSal;
private Double netSal;

//setter && getter methods
public Integer getEid() {
	return eid;
}
public void setEid(Integer eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getDesg() {
	return desg;
}
public void setDesg(String desg) {
	this.desg = desg;
}
public Double getBasicSal() {
	return basicSal;
}
public void setBasicSal(Double basicSal) {
	this.basicSal = basicSal;
}
public Double getGrossSal() {
	return grossSal;
}
public void setGrossSal(Double grossSal2) {
	this.grossSal = grossSal2;
}
public Double getNetSal() {
	return netSal;
}
public void setNetSal(Double netSal2) {
	this.netSal = netSal2;
}

}//class
