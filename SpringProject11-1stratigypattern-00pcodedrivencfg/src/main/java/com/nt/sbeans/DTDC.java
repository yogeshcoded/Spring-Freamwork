package com.nt.sbeans;

public class DTDC implements Courier{
	public DTDC() {
		System.out.println("DTDC:: 0-param constructor");
	}
		
		@Override
		public String Delivary(int oid) {
			
			return oid+ "order id assign to DTDC Courier";
		}
}
