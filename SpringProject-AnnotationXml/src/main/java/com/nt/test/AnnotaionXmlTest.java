package com.nt.test;

import org.springframework.context.annotation.Primary;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comps.Flipkart;

public class AnnotaionXmlTest {
public static void main(String[] args) {
	//IOC container
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfg/applicationContext.xml");
	//target class obj 
	Flipkart fpkt=ctx.getBean("fpkt", Flipkart.class);
		//invoke b.method
			String msg=fpkt.shopping(new String[] {"shirt","trouser","belt"},
					                                             new double[] {1000.0,3000.0 ,500.0});
			System.out.println(msg);
	
	
	
	
}//main
}//class
