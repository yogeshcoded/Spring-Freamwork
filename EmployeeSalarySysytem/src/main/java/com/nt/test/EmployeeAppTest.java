package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.EmployeeController;
import com.nt.vo.EmployeeVO;

public class EmployeeAppTest {

	public static void main(String[] args) {
		String name=null,dept=null,desg=null,bSal=null;
		//read input from user
			Scanner sc=new Scanner(System.in);
		if (sc!=null) {
		System.out.println("Enter emp name::");
		 name=sc.next();
		System.out.println("Enter emp dept::");
	     dept=sc.next();
		System.out.println("Enter emp desg::");
		 desg=sc.next();
		System.out.println("Enter emp bSal::");
		 bSal=sc.next();
		}	
		//create IOC container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfg/applicationContext.xml");
		
		//create Employee Controller obj'
		EmployeeController controller=factory.getBean("controller",EmployeeController.class);
		//create vo obj
		EmployeeVO vo=new EmployeeVO();
		vo.setEname(name);
		vo.setDept(dept);
		vo.setDesg(desg);
		vo.setBasicSal(bSal);
		
		//invoke b.method
		try {
			String msg=controller.processEmpolyee(vo);
			System.out.println(msg);
		}//try 
		catch (Exception e) {
			System.out.println("Problem To register Employee deatils");
			e.printStackTrace();
		}//catch
	

	}//main

}//class
