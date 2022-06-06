package com.nt.service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.IEmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeService implements IEmployeeService {

	// HAS-A property
	private IEmployeeDAO dao;

	// constructor for constructor injection
	public EmployeeService(IEmployeeDAO dao) {
		this.dao = dao;
	}

	@Override
	public String registerEmployee(EmployeeDTO empdto) throws Exception {
		// logic for calculate gsal && netSal
		double grossSal = (empdto.getBasicSal() + empdto.getBasicSal() * 40 / 100);
		double netSal = (grossSal - grossSal * 20 / 100);

		// creata BO obj for persistence data
		EmployeeBO empbo = new EmployeeBO();
		empbo.setEname(empdto.getEname());
		empbo.setDept(empdto.getDept());
		empbo.setDesg(empdto.getDesg());
		empbo.setBasicSal(empdto.getBasicSal());
		empbo.setGrossSal(grossSal);
		empbo.setNetSal(netSal);

		// use dao class
		int count = dao.insert(empbo);
		// process result
		return count == 0 ? "Registration Fail" : "Regesitration success  ";
	}// method

}// class
