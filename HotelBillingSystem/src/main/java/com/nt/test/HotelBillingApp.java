package com.nt.test;


import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.HotelController;
import com.nt.vo.HotelVO;

public class HotelBillingApp {
	public static void main(String[] args) {
		String name=null,addrs=null,noofdays=null,rateperdays=null;
//read input from user
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Customer Name::");
	name=sc.next();
	System.out.println("Enter Customer Addrs::");
	addrs=sc.next();
	System.out.println("Enter no of days stay in hotel::");
	noofdays=sc.next();
	System.out.println("Enter rate per day ::");
	rateperdays=sc.next();
	//create vo class having this input
	HotelVO vo=new HotelVO();
	vo.setHname(name);
	vo.setHadd(addrs);
	vo.setNoofdays(noofdays);
	vo.setPerdaycharge(rateperdays);
	
	//create IOC container
	DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
	XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
	
	//controller class object
	HotelController controller=factory.getBean("controller",HotelController.class);
	//invoke b.method 
	try {
		String Msg=controller.ProcessCustomer(vo);
		System.out.println(Msg);
	} catch (Exception e) {
		System.out.println("Process failed");
		e.printStackTrace();
	}
}//main
}//class