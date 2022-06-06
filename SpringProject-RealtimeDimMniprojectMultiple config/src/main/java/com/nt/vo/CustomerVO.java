package com.nt.vo;

public class CustomerVO {
	private String cno;
	private String cname;
	private String cadd;
	private  String pAmt;
	private  String rate;
	private  String time;
	
	
	//setter && getter methods
	public String getCno() {
		return cno;
	}

	public void setCno(String cno) {
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

	public String getPamt() {
		return pAmt;
	}

	public void setPamt(String pamt) {
		this.pAmt = pamt;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}//class