package com.nt.sbeans;

public class BDart implements Courier{
	public BDart() {
		System.out.println("BDart:: 0-param constructor");
	}
		
		@Override
		public String Delivary(int oid) {
			
			return oid+ "order id assign to BDart Courier";
		}
}
