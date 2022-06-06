package com.nt.test;

import com.nt.comps.AadharDeatils;
import com.nt.comps.Employee;
import com.nt.comps.Student;

public class ClientTest {
public static void main(String[] args) {
	AadharDeatils aadhar=new AadharDeatils(9485612L, 40,942158456L);
	Employee emp=new Employee("raja","JAl", aadhar, "infosys", 95000);
	System.out.println(emp);
	System.out.println("===============================================================");
	AadharDeatils aadhar1=new AadharDeatils(9485612L, 40,942158456L);
	Student st=new Student("Rani", "pune", aadhar1,"HCL",785120);
	System.out.println(st);
}
}
