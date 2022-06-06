package com.nt.test;

import java.security.Provider.Service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.Flipkart;

public class FlipkartBillTest {

	public static void main(String[] args) {
		// ioc container create 
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfg/applicationContext.xml");
		Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
		System.out.println(fpkt.getClass()+"   "+fpkt.getClass().getSuperclass());
		
		int disAmt=fpkt.CalculateBIll(25000, 5);
		System.out.println("Dicount Bill Amount is " +disAmt);
		
		ctx.close();

	}

}
