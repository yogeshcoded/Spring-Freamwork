package com.nt.factory;

import com.nt.comps.BDart;
import com.nt.comps.Courier;
import com.nt.comps.DHL;
import com.nt.comps.Flipkart;

public class FlipkartFactory {

	public static Flipkart getInstance(String courierType) {
		 Courier courier=null;
		  if(courierType.equalsIgnoreCase("dhl"))
		    	 courier=new DHL();
		      else if(courierType.equalsIgnoreCase("blueDart"))
		    	  courier=new BDart();
		      else 
		    	  throw new IllegalArgumentException("invalid courier type");
		     //create target class obj
		      Flipkart fpkt=new Flipkart();
		      //assign dependent class obj to target class obj
		      fpkt.setCourier(courier);
		      return fpkt;
		
		
	}
}
