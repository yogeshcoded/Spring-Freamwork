package com.nt.sbeans;

public class DHL implements Courier {
public DHL() {
	System.out.println("DHL:: 0-param constructor");
}
	
	@Override
	public String Delivary(int oid) {
		
		return oid+ "order id assign to DHL Courier";
	}

}
