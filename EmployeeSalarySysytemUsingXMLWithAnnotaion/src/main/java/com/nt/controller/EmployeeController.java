package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.dto.EmployeeDTO;
import com.nt.service.IEmployeeService;
import com.nt.vo.EmployeeVO;
@Component("controller")
public class EmployeeController {
//HAS-A property
	@Autowired
private IEmployeeService service;


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
