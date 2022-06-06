package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("bDart")
public class BDart implements Courier {
	public BDart() {
		System.out.println("BDart.0-param constructor");
	}

	@Override
	public String delivary(int oid) {
		return oid + " oreder assign to BlueDart ";
	}

}
