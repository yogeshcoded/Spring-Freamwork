package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dhl")
public class DHL implements Courier {
	public DHL() {
		System.out.println("DHL.0-param constructor");
	}

	@Override
	public String delivary(int oid) {
		return oid + " oreder assign to DHL ";
	}

}
