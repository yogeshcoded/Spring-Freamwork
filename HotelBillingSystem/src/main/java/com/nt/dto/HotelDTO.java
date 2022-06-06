package com.nt.dto;

import java.io.Serializable;

public class HotelDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
private Integer hid;
private String hname;
private String hadd;
private Double noofdays;
private Double rateperday;

//setter && getter methods
public Integer getHid() {
	return hid;
}
public void setHid(Integer hid) {
	this.hid = hid;
}
public String getHname() {
	return hname;
}
public void setHname(String hname) {
	this.hname = hname;
}
public String getHadd() {
	return hadd;
}
public void setHadd(String hadd) {
	this.hadd = hadd;
}
public Double getNoofdays() {
	return noofdays;
}
public void setNoofdays(Double noofdays) {
	this.noofdays = noofdays;
}
public Double getRateperday() {
	return rateperday;
}
public void setRateperday(Double rateperday) {
	this.rateperday = rateperday;
}

}//class
