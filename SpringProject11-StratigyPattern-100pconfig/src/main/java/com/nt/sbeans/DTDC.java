package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements Courier {

public DTDC() {
	System.out.println("DTDC.0-param constructor");
}	
	@Override
	public String delivary(int oid) {
		return oid + " oreder assign to DTDC ";
	}

}
