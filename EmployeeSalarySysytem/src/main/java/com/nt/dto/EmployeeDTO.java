package com.nt.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable{
	
	private Integer  eid;
	private  String ename;
	private String  dept;
	private String desg;
	private Double  basicSal;
	
	
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
	
	
	
	
}
