package com.nt.bo;

public class CustomerBO {
private Integer cno;
private String cname;
private String cadd;
private Double pAmt;
private Double interAmt;

//setter getter methods
public Integer getCno() {
	return cno;
}

public void setCno(Integer cno) {
	this.cno = cno;
}

public String getCname() {
	return cname;
}

public void setCname(String cname) {
	this.cname = cname;
}

public String getCadd() {
	return cadd;
}

public void setCadd(String cadd) {
	this.cadd = cadd;
}

public Double getPamt() {
	return pAmt;
}

public void setPamt(Double pAmt) {
	this.pAmt = pAmt;
}

public Double getInteramt() {
	return interAmt;
}

public void setInteramt(Double interAmt) {
	this.interAmt = interAmt;

}

}//class
