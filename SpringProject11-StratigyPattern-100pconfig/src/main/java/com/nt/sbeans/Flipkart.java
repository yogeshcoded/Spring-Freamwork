package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")

public final class Flipkart {
       //HAS-A property
	@Autowired
	@Qualifier("dpartner")
	private Courier courier;
	
	public Flipkart() {
		System.out.println("Flipkart.0-param constructor");
	}
	
	public String shopping(String items[],  double price[]) {
		//cal amt
		double billAmt=0.0;
		for(double p:price) {
			billAmt+=0;
		}//for
		//genarate oid
		int oid=new Random().nextInt(20000);
		//use courier
		String msg=courier.delivary(oid);
		return Arrays.toString(items)+" are puchased your bill amt is"+billAmt+"------->"+msg;
	}//shopping()
}//class
