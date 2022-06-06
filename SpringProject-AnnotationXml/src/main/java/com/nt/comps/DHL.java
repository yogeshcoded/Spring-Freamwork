package com.nt.comps;

public class DHL implements Courier {

	public DHL() {
		System.out.println("DHL:0-param constructor");
	}
	
	@Override
	public String deliver(int oid) {
			 return  oid+ "  order id oder  is assinged to  DHL for Delivery";
	}

}
