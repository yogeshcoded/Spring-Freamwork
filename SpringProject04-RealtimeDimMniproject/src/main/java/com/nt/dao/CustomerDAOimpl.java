package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;
import com.nt.bo.CustomerBO;

public class CustomerDAOimpl implements ICustomerDAO {
	//string query
	private static final String CUSTOMER_INSERT_QUERY="INSERT INTO CUSTOMER_TAB VALUES(CUSTOMER_SEQ.NEXTVAL,?,?,?,?)";
//HAS-A property
 private DataSource ds;

//constructor
	public CustomerDAOimpl(DataSource ds) {
	this.ds = ds;
}//constructor


	@Override
	public final int insert(CustomerBO custbo) throws Exception {
		int count=0;
//get pooles object 
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
 }
 catch(Exception e) {
	 e.printStackTrace();
 }
		return count ;
	}

}//class
