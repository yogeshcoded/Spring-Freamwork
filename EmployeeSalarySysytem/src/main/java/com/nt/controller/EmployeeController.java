package com.nt.controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.IEmployeeService;
import com.nt.vo.EmployeeVO;

public class EmployeeController {
//HAS-A property
private IEmployeeService service;

public EmployeeController(IEmployeeService service) {

	this.service = service;
}


public String processEmpolyee(EmployeeVO vo)throws Exception{
	//convert VO calss obj to dto
	//create DTO calss obj
	EmployeeDTO dto=new EmployeeDTO();
	dto.setEname(vo.getEname());
	dto.setDept(vo.getDept());
	dto.setDesg(vo.getDesg());
	dto.setBasicSal(Double.parseDouble(vo.getBasicSal()));
   
	
	//use service class
	String resultMsg=service.registerEmployee(dto);
	
	return resultMsg;
	
}//method

}//class
