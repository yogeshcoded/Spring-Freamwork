package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {
//HAS-A property
	private Courier courier;
	
	public Flipkart() {
		System.out.println("Flipkart.0-param");
	}
	
	public String Shopping(String items[],double price[]) {
		System.out.println("Flipkart.Shopping()");
		//calculate bill
		double billAmt=0;
		for(double p:price) {
			billAmt+=p;
		}
		//generate the oid
		int oid=new Random().nextInt(2000000);
		//use courier
		String msg=courier.Delivary(oid);
		return Arrays.toString(items)+" are purchased having billAmt  " +billAmt+"----->msg";
		
	}
	
}
