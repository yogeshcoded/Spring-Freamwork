package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.bo.CoronaPatientBO;
import com.nt.dao.ICoronaPatientDAO;
import com.nt.dto.CoronaPatientDTO;
@Service("service")
public class CoronaPatientMgmtService implements ICoronaPatientManagmentService {
	@Autowired
	@Qualifier("ora")
	private ICoronaPatientDAO dao;

	public CoronaPatientMgmtService(ICoronaPatientDAO dao) {
	this.dao = dao;
}//constructor

	@Override
	public String registerPatient(CoronaPatientDTO ptdto) throws Exception{
		//calculate total bill of patient
		Double totalBill=(ptdto.getNoofdays()*ptdto.getPerdaycharage());
		//create bo object for persistence data
		CoronaPatientBO ptbo=new CoronaPatientBO();
		ptbo.setPname(ptdto.getPname());
		ptbo.setPadd(ptdto.getPadd());
		ptbo.setTotalBill(totalBill);
		
		//use count
		int count=dao.insert(ptbo);
		//process the result
		return count== 0?"Registration failes ":"Registration success" +"Total Bll amount::"+totalBill;
	}

}
