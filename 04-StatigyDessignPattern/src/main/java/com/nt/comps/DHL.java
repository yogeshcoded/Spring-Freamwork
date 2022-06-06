package com.nt.comps;

public class DHL implements Courier {
public DHL() {
	System.out.println("DHL Courier");
}
	@Override
	public String delivar(int oid) {
		
		return oid+" is assign to DHL";
	}

}
