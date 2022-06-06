package com.nt.test;

import com.nt.comps.AadharDeatils;
import com.nt.comps.Employee;
import com.nt.comps.Person;
import com.nt.comps.Student;
import com.nt.factory.PersonFactory;

public class ClientTest {
public static void main(String[] args) {
	Person per=PersonFactory.getPerson("emp");
	System.out.println(per);
	System.out.println("=====================================================");
	per=PersonFactory.getPerson("st");
	System.out.println(per);
	System.out.println("=====================================================");
	per=PersonFactory.getPerson("cust");
	System.out.println(per);
}
}
