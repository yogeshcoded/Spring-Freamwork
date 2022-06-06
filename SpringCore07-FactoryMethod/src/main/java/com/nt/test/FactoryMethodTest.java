package com.nt.test;

import java.util.Calendar;
import java.util.Properties;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class FactoryMethodTest {

    public static void main( String[] args ) {
   //create ioc container
    	DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
    	XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
    	reader.loadBeanDefinitions("com/nt/cfg/applicationContext.xml");
    	//get spring bean class obj
    	Class c=factory.getBean("c1",Class.class);
    	System.out.println("Class info::"+c.toString()+"  "+c.getClass());
    	System.out.println("-------------------------------------------------------------");
    	System.out.println();
    	
    	Calendar cal=factory.getBean("cal",Calendar.class);
    	System.out.println("Calender info::"+cal.toString()+"  "+cal.getClass());
    	System.out.println("-------------------------------------------------------------");
    	System.out.println();
    	
    	Properties props=factory.getBean("props",Properties.class);
    	System.out.println("Properties info::"+props.toString()+"  "+props.getClass()); 
    	    	System.out.println("==============================================");
    	    	System.out.println();
    	    	
    	    	String ss=factory.getBean("s2", String.class);
    	    	System.out.println("String Info::"+ss.toString()+""+ss.getClass());
    	    	System.out.println("-------------------------------------------------------------------------------------------");
    	    	System.out.println();
    	    	String ss1=factory.getBean("s3", String.class);
    	    	System.out.println("String Info::"+ss1.toString()+""+ss1.getClass());
    }//main
}//class
