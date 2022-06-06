package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Flipkart;

public class StatigyPatternTest {
	public static void main(String[] args) {
		// IOC
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		// target obj
		Flipkart fpkt = ctx.getBean("fpkt", Flipkart.class);
		// invoke b.method
		String msg = fpkt.shopping(new String[] { "shirt", "pant", "perfume", "wallet" },
				new double[] { 1500.0, 1800.0, 2500.0, 450.0 });
		System.out.println(msg);
	}// main
}// class
