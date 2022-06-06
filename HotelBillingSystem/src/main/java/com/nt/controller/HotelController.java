package com.nt.controller;

import com.nt.dto.HotelDTO;
import com.nt.service.IHotelManagementService;
import com.nt.vo.HotelVO;

public class HotelController {
	//HAS-A property
	private IHotelManagementService service;
	
public HotelController(IHotelManagementService service) {
		this.service = service;
	}


public String ProcessCustomer(HotelVO vo)throws Exception{
	//convert vo class objt data to dto class
	HotelDTO dto=new HotelDTO();
	dto.setHname(vo.getHname());
	dto.setHadd(vo.getHadd());
    dto.setNoofdays(Double.parseDouble(vo.getNoofdays()));
    dto.setRateperday(Double.parseDouble(vo.getPerdaycharge()));
	
  //use service
  String resultMsg=service.registerCustomer(dto);
	return resultMsg;
	
}
}//class
