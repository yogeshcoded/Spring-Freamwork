package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.nt.bo.CustomerBO;
@Repository("oraDAO")
public class CustomerDAOimpl implements ICustomerDAO {
	//string query
	private static final String CUSTOMER_INSERT_QUERY="INSERT INTO CUSTOMER_TAB VALUES(CUSTOMER_SEQ.NEXTVAL,?,?,?,?)";
//HAS-A property
	@Autowired
 private DataSource ds;


	@Override
	public final int insert(CustomerBO custbo) throws Exception {
		int count=0;
//get pool object 
		try(	Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(CUSTOMER_INSERT_QUERY)){
			//set param values
			if (ps!=null) {
				ps.setString(1,custbo.getCname());
				ps.setString(2,custbo.getCadd());
				ps.setDouble(3,custbo.getPamt());
				ps.setDouble(4, custbo.getInteramt());
				
				//execute query
				count=ps.executeUpdate();
			}//if
		}//try
 catch(SQLException se) {
	se.printStackTrace();
	throw se;
	
 }
 catch(Exception e) {
	 e.printStackTrace();
	 throw e;
 }
		return count ;
	}

}//class
