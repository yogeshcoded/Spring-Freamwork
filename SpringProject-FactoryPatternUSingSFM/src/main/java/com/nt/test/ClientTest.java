package com.nt.test;

import com.nt.comps.Customer;
import com.nt.comps.Employee;
import com.nt.factory.PersonFactory;

public class ClientTest {
	public static void main(String[] args)  {

		try {
			Employee emp = PersonFactory.getPerson(Employee.class);
			System.out.println(emp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("=====================================================");
		
		Customer cust;
		try {
			cust = PersonFactory.getPerson(Customer.class);
			System.out.println(cust);
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
	}
}
