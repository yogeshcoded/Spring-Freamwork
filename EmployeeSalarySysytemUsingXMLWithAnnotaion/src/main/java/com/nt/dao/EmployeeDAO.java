package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;
@Repository("oraDAO")
public class EmployeeDAO implements IEmployeeDAO {
	
	//Prepare query
private static final String EMPLOYEE_INSERT_QUERY="INSERT INTO EMPLOYEE VALUES(EMPLOYEE_SEQ.NEXTVAL,?,?,?,?,?,?)";
int count=0;

//HAS-A property
@Autowired
private DataSource ds;

@Override
public int insert(EmployeeBO bo) throws Exception {
	try(
			//get con pool obj from ds
			Connection con=ds.getConnection();
			PreparedStatement ps=con.prepareStatement(EMPLOYEE_INSERT_QUERY);){
		//set param values
		if (ps!=null) {
			ps.setString(1, bo.getEname());
			ps.setString(2, bo.getDept());
			ps.setString(3, bo.getDesg());
			ps.setDouble(4, bo.getBasicSal());
			ps.setDouble(5, bo.getGrossSal());
			ps.setDouble(6, bo.getNetSal());
		}
		//execute query
		count=ps.executeUpdate();
	}//try
	catch(SQLException se) {
		se.printStackTrace();
		throw se;
	}//catch
	catch(Exception e) {
		e.printStackTrace();
		throw e;
	}//catch
	
	return count;
   }//method
}//class
