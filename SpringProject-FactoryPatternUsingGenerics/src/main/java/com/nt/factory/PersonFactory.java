package com.nt.factory;

import com.nt.comps.AadharDeatils;
import com.nt.comps.Customer;
import com.nt.comps.Employee;
import com.nt.comps.Person;
import com.nt.comps.Student;

public class PersonFactory {
public static  Person getPerson(String  type) {
Person per=null;
AadharDeatils aadhar=null;
if (type.equalsIgnoreCase("emp")) {
	aadhar=new AadharDeatils(12354895L,20, 12548940L);
  per=new Employee("Raja", "Hyd", aadhar,"HCL",1521540);
}
  else if(type.equalsIgnoreCase("st")) {
	  aadhar=new AadharDeatils(12354895L,20, 12548940L);
	  per=new Student("JAni", "hyd", aadhar, "java",2500);
	  }
	  else if(type.equalsIgnoreCase("cust")) {
		  aadhar=new AadharDeatils(12354895L,20, 12548940L);
		  per=new Customer("Bani", "hyd", aadhar, 54216, 256140);
	  }
		  else {
			  throw new IllegalArgumentException("invalid person type");
		  }
return per;
      }//main
	}// class
