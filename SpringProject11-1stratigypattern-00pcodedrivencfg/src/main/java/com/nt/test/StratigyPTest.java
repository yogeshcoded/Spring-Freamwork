package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Flipkart;

public class StratigyPTest {

	public static void main(String[] args) {
		// IOC container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//target object 
		Flipkart fpkt=ctx.getBean("DHL", Flipkart.class);
		//invoke b.method
		String msg=fpkt.Shopping(new String[]{"shirt","rose","pants"}, new double[]{1500.0,850.0,985.0 });
        System.out.println(msg);
	}

}
