package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.dto.CustomerDTO;
import com.nt.service.ICustomerMgmtService;
import com.nt.vo.CustomerVO;
@Component("controller")
public class MainController {
//HAS-A property
	@Autowired
	private ICustomerMgmtService service;



//process the customer
public String ProcessCustomer(CustomerVO vo) throws Exception {
//convert VO class obj into DTO class obj
	CustomerDTO custDTO=new CustomerDTO();
	custDTO.setCname(vo.getCname());
	custDTO.setCadd(vo.getCadd());
	custDTO.setPamt(Double.parseDouble(vo.getPamt()));
	custDTO.setRate(Double.parseDouble(vo.getRate()) );
	custDTO.setTime(Double.parseDouble(vo.getTime()));
	
	//use service class'
	String resultMsg=service.registerCustomer(custDTO);
	
	return resultMsg;
	
}
	
}//class
