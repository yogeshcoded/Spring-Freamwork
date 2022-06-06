package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.dto.CoronaPatientDTO;
import com.nt.service.ICoronaPatientManagmentService;
import com.nt.vo.CoronaPatientVO;

@Controller("controller")
public class MainController {
//HAS-A property
	@Autowired
	private ICoronaPatientManagmentService service;

public MainController(ICoronaPatientManagmentService service) {
	this.service = service;
}
	//process the customer
public String processPaitent(CoronaPatientVO vo)throws Exception{
	//Convent vo class obj to dto 
	CoronaPatientDTO dto=new CoronaPatientDTO();
	dto.setPname(vo.getPname());
	dto.setPadd(vo.getPadd());
	dto.setNoofdays(Double.parseDouble(vo.getNoofdays()));
	dto.setPerdaycharage(Double.parseDouble(vo.getPerdaycharage()));
	
	//use service class
	String resultMsg=service.registerPatient(dto);
	return resultMsg;
	}

}//class
