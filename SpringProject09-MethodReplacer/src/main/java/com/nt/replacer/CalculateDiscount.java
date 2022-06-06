package com.nt.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class CalculateDiscount implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		double pamt=(double)args[0];
		double rate=(double)args[1];
		double time=(double)args[2];
		double si=pamt*rate*time/100;
		return si;
	}

}
