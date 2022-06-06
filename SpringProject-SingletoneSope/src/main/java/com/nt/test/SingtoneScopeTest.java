package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comps.Flipkart;
import com.nt.singletone.Printer;

public class SingtoneScopeTest {
public static void main(String[] args) {
	//IOC container
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfg/applicationContext.xml");
	//target class obj 
	Flipkart fpkt=ctx.getBean("fpkt", Flipkart.class);
	Flipkart fpkt2=ctx.getBean("fpkt", Flipkart.class);
	System.out.println("Flipkart Class Hashcode");
	System.out.println(fpkt.hashCode()+"       "+fpkt2.hashCode());
	//invoke b.method
			String msg=fpkt.shopping(new String[] {"shirt","trouser","belt"},
					                                             new double[] {1000.0,3000.0 ,500.0});
			System.out.println(msg);
	System.out.println("==================================================================================");
	
	Printer p1=ctx.getBean("p1", Printer.class);
	Printer p2=ctx.getBean("p2", Printer.class);
	System.out.println("Printer Class Hashcode");
	System.out.println(p1.hashCode()+"         " +p2.hashCode());
	
	
	
}//main
}//class
