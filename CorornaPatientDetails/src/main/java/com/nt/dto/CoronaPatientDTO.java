package com.nt.dto;

import java.io.Serializable;

public class CoronaPatientDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer pid;
	private String pname;
	private String padd;
	private Double noofdays;
	private Double perdaycharage;
	
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
	public Double getNoofdays() {
		return noofdays;
	}
	public void setNoofdays(Double noofdays) {
		this.noofdays = noofdays;
	}
	public Double getPerdaycharage() {
		return perdaycharage;
	}
	public void setPerdaycharage(Double perdaycharage) {
		this.perdaycharage = perdaycharage;
	}
	
}//class
