package com.nt.service;

import com.nt.bo.HotelBO;
import com.nt.dao.IHotelDAO;
import com.nt.dto.HotelDTO;

public class HotelManagementServiceimpl implements IHotelManagementService {
//HAS-A property
		private IHotelDAO dao;
		
		//constructor for injection
	public HotelManagementServiceimpl(IHotelDAO dao) {
	this.dao = dao;
}

//method for register data into db
	@Override
	public String registerCustomer(HotelDTO htdto) throws Exception {
		//calculate total amount
		Double totalAmt=htdto.getNoofdays()*htdto.getRateperday();
		//create BO object having persistence data
		HotelBO htbo=new HotelBO();
		htbo.setHname(htdto.getHname());
		htbo.setHadd(htdto.getHadd());
		htbo.setTotalAmt(totalAmt);
		//use dao class
		int count=dao.insert(htbo);
		
		return count==0?"Registration Failed":"Registrstion Success  Your Hotel Bill is::"+totalAmt ;
	}//method

}//class
