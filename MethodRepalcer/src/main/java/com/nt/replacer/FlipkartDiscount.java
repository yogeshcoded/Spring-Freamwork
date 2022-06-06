package com.nt.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class FlipkartDiscount implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		int  price=(int) args[0];
		int  qty=(int) args[1];
		
		int discAmt=((price*qty)*25/100);
		return discAmt;
	}

}
