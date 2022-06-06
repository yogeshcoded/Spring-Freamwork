package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMassageGenerator;
import com.nt.cfg.AppConfig;

public class JavaConfigTest {
public static void main(String[] args) {
//create IOC Container
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	WishMassageGenerator generator=ctx.getBean(WishMassageGenerator.class);
	System.out.println("====================================================");
	//invoke b.logic
	String msg=generator.ganerateMassage(" Raja");
	System.out.println("wish msg is:" +" "+msg);
	ctx.close();
	}//main
}//class
