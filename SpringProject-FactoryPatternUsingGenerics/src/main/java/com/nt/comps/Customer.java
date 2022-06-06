package com.nt.comps;

public class Customer extends Person {
	private int taxid;
	private int billAmt;
	
	public Customer(String name, String addrs, AadharDeatils aadhar, int taxid, int billAmt) {
		super(name, addrs, aadhar);
		this.taxid = taxid;
		this.billAmt = billAmt;
	}

	@Override
	public String toString() {
		return super.toString()+"Customer [taxid=" + taxid + ", billAmt=" + billAmt + "]";
	}
	
	

}
