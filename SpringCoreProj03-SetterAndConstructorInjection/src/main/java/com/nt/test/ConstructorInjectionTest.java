//ConstructorInjectionTest.java
package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Student;
import com.nt.beans.WishMassageGenerator;

public class ConstructorInjectionTest {
public static void main(String[] args) {
	//hold the name and location spring bean configuration file in resource object
	FileSystemResource res =new FileSystemResource("src/main/java/com/nt/cfg/applicationContext.xml");
	//create  BeanFactory spring controller(IOC container)
			XmlBeanFactory factory=new XmlBeanFactory(res);
		System.out.println("====================================================");
	//get target spring bean class  object  injected with Defendant  spring bean class object
	Object object=factory.getBean("wmg");
	//type casting
	WishMassageGenerator generator=(WishMassageGenerator)object;
	System.out.println("====================================================");
	//invoke b.logic
	String msg=generator.ganerateMassage(" Raja");
	System.out.println("wish msg is:" +" "+msg);
	System.out.println("====================================================");
	Student std=(Student)factory.getBean("st");
	System.out.println("Student obj beans::"+std);
	}//main
}//class
