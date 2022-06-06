package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.ICustomerDAO;
import com.nt.dto.CustomerDTO;

public class CustomerServiceimpl implements ICustomerMgmtService {
//HAS-A Property
	private ICustomerDAO dao;
	
	public CustomerServiceimpl(ICustomerDAO dao) {
		this.dao = dao;
}//constructor

		@Override
	public String registerCustomer(CustomerDTO dto) throws Exception {
	//calculate principal amount
	Double interamt=(dto.getPamt()*dto.getRate()*dto.getTime())/100;
	
	//prepare customer bo object for persistance data
	CustomerBO custBO=new CustomerBO();
	custBO.setCname(dto.getCname());
	custBO.setCadd(dto.getCadd());
	custBO.setPamt(dto.getPamt());
	custBO.setInteramt(interamt);
	
	//use dao 
   int count=dao.insert(custBO);
   //process the result
   return count==0?"Customer Registration failed":"Customer Registration Succeded:: Details are :: principlet amount::"+dto.getPamt()+"Time:: "+dto.getTime()+" rate::"+dto.getRate()+" Intrest amount:: "+interamt;
		}//method
	}//class

