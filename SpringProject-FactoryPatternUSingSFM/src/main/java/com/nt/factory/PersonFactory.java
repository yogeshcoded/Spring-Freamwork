package com.nt.factory;

import java.lang.reflect.Constructor;

import com.nt.comps.AadharDeatils;
import com.nt.comps.Customer;
import com.nt.comps.Employee;
import com.nt.comps.Person;
import com.nt.comps.Student;

public class PersonFactory {
public static <T extends Person>T getPerson(Class<T> c)throws Exception{
	Constructor cons[]=c.getDeclaredConstructors();
Object obj=null;
if (c==Employee.class) {
AadharDeatils	aadhar=new AadharDeatils(12354895L,20, 12548940L);
  obj=cons[0].newInstance("Raja", "Hyd", aadhar,"HCL",1521540);
}
  else if(c==Student.class) {
	  AadharDeatils	aadhar=new AadharDeatils(12354895L,20, 12548940L);
	  obj=cons[0].newInstance("Jani", "hyd", aadhar, "java",2500);
	  }
	  else if(c==Customer.class) {
		  AadharDeatils	aadhar=new AadharDeatils(12354895L,20, 12548940L);
		  obj=cons[0].newInstance("Bani", "hyd", aadhar, 54216, 256140);
	  }
		  else {
			  throw new IllegalArgumentException("invalid person type");
		  }
return (T) obj;
      }// main
}// class
