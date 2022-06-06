package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class MethodReplacerTest {

	public static void main(String[] args) {
		// create IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfg/applicationContext.xml");
		
		BankService service=ctx.getBean("bankservice",BankService.class);
		
		double intAmt=service.CalculateIntrestAmount(15000, 5, 12);
		System.out.println("Simple Intrest  is   "+intAmt);
		
		//close container
		ctx.close();

	}

}
