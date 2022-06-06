package com.nt.comps;

public class BDart implements Courier {
public BDart(){
	System.out.println("BDart courier");
}
	
	@Override
	public String delivar(int oid) {
			return oid+" this order is assign to bdart";
	}

}
