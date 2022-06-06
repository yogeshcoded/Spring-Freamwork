package com.nt.client;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.CoronaPatientVO;

public class CoronaPaitentAppTest {

	public static void main(String[] args) {
		String name=null,addrs=null, noofdays=null,perdaycharge=null;
		//read input from user
		Scanner sc=new Scanner(System.in);
		if (sc!=null) {
			System.out.println("Corona Paitent Deatils::");
			System.out.println("Enter Paitent Name::");
			 name=sc.next();
			 System.out.println("Enter Paitent Address::");
			 addrs=sc.next();
			 System.out.println("Enter the no of days  paitent stay in hospital::");
			 noofdays=sc.next();
			 System.out.println("Enter Rate of bed::");
			 perdaycharge=sc.next();

		}//if
		//create ''IOC container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cofgs/applicationContext.xml");
		//controller class object
		MainController controller=factory.getBean("controller",MainController.class);
		
		//create vo class object having those input
	CoronaPatientVO vo=new CoronaPatientVO();
	vo.setPname(name); 
	vo.setPadd(addrs);
	vo.setNoofdays(noofdays);
	vo.setPerdaycharage(perdaycharge);
		//invoke b.method
	try {
	String msg=controller.processPaitent(vo);
	System.out.println(msg);
	}
	catch(Exception e) {
		System.out.println("Problem To register paitent deatils");
		e.printStackTrace();
	}
		
	}//main

}//class
