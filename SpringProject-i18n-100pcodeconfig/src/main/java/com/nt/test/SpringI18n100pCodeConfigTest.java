package com.nt.test;

import java.util.Locale;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cofig.AppConfig;


public class SpringI18n100pCodeConfigTest {

	public static void main(String[] args) {
		//IOC
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//target class object
		Locale locale=new Locale(args[0],args[1]);
		String msg1=ctx.getMessage("wish.msg", new String[] {}, locale);
		String msg2=ctx.getMessage("bye.msg", new String[] {}, locale);
		System.out.println(msg1+"          "+msg2);

	}//main

}//class
