package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.bo.CustomerBO;
import com.nt.dao.ICustomerDAO;
import com.nt.dto.CustomerDTO;
@Service("service")
public class CustomerServiceimpl implements ICustomerMgmtService {
//HAS-A Property
	@Autowired
	@Qualifier("dao")
	private ICustomerDAO dao;
	
	
		@Override
	public String registerCustomer(CustomerDTO dto) throws Exception {
	//calculate principal amount
	Double interamt=(dto.getPamt()*dto.getRate()*dto.getTime())/100;
	
	//prepare customer bo object for persistence data
	CustomerBO custBO=new CustomerBO();
	custBO.setCname(dto.getCname());
	custBO.setCadd(dto.getCadd());
	custBO.setPamt(dto.getPamt());
	custBO.setInteramt(interamt);
	
	//use dao 
   int count=dao.insert(custBO);
   //process the result
   return count==0?"Customer Registration failed":"Customer Registration Succeded:: Interst aount is:: "+interamt;
		}//method
	}//class

