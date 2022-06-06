package com.nt.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.stereotype.Component;



@Component("siRepalcer")
public class CalculateDiscount implements MethodReplacer {
	
public CalculateDiscount() {
	System.out.println("CalculateDiscount.0-param constructor");
}
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		double pamt=(double)args[0];
		double rate=(double)args[1];
		double time=(double)args[2];
		double si=pamt*rate*time/100;
		return si;
	}

}
