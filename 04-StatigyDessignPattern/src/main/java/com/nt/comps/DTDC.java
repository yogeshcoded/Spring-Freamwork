package com.nt.comps;

public class DTDC implements Courier {
public DTDC() {
	System.out.println("DTDC corier ()");
}
	
	@Override
	public String delivar(int oid) {
		return oid+"this order is assign to DTDC";
	}

}
