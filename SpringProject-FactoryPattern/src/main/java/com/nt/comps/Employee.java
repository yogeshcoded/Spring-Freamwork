package com.nt.comps;

public class Employee extends Person {
	private String company;
	private double salary;
	
	
	public Employee(String name, String addrs, AadharDeatils aadhar, String company, double salary) {
		super(name, addrs, aadhar);
		this.company = company;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return super.toString()+"Employee [company=" + company + ", salary=" + salary + "]";
	}

	

	


	}

