package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {          //(rule 3 final class)
//HAS-A property         (rule-1)
	private Courier courier;        // (rule 2 interface type ref)
	
	public Flipkart() {
		System.out.println("0-param condtructor Flipkart");
	}
	
	public void setCourier(Courier courier) {
			this.courier=courier;
	}
	
	public String shopping(String items[],double price[]) {
		double billAmt=0.0;
		for(double p:price) {
			billAmt+=p;
		}
		//genarat order id
		int oid=new Random().nextInt(2000000000);
		//use courier
		String msg=courier.delivar(oid);
		return Arrays.toString(items)+"are purchased having bill Amt is "+billAmt+"--------->"+msg;
	}
		
	
}
