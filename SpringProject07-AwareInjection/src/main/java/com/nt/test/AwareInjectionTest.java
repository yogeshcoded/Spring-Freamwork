package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Cricketer;

public class AwareInjectionTest {

	public static void main(String[] args) {
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfg/applicationContext.xml");
	Cricketer crkt=ctx.getBean("crkt",Cricketer.class);
	//invoke the b.methods
	crkt.batting();
	crkt.balling();
	crkt.fielding();
	
	//close the container
	ctx.close();
	}//main

}//class
