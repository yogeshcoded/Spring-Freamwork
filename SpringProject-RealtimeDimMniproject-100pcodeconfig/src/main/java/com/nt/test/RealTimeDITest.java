package com.nt.test;


import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.config.AppConfig;
import com.nt.controller.MainController;
import com.nt.vo.CustomerVO;

public class RealTimeDITest {
public static void main(String[] args) {
	//create IOC container
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	//get controller class object
	MainController controller=ctx.getBean("controller",MainController.class);
	
	//read input from user
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter customer name::");
		String name=sc.next();
		
	System.out.println("Enter customer address::");
	String addrs=sc.next();
	
	System.out.println("Enter Principal::");
	String pamt=sc.next();
	
	System.out.println("Enter Rate Of Interest::");
	String rate=sc.next();
	
	System.out.println("Enter Time::");
	String time=sc.next();
	
	//create VO class object having thoes input
	CustomerVO vo=new CustomerVO();
	vo.setCname(name);
	vo.setCadd(addrs);
	vo.setPamt(pamt);
	vo.setRate(rate);
	vo.setTime(time);
	
	//invoke b.method
	try {
	String msg=controller.ProcessCustomer(vo);
	System.out.println("Result is::"+msg);
	}
	catch(Exception e) {
		 System.out.println("Problem in Customer Registration");
		e.printStackTrace();
	}
}//main
}//class
