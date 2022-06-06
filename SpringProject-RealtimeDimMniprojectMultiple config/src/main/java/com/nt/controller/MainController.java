package com.nt.controller;

import com.nt.dto.CustomerDTO;
import com.nt.service.ICustomerMgmtService;
import com.nt.vo.CustomerVO;

public class MainController {
//HAS-A property
	private ICustomerMgmtService service;

public MainController(ICustomerMgmtService service) {
		this.service = service;
}//constructor

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
