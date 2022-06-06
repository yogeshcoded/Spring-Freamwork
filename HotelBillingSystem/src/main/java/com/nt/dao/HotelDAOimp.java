package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.HotelBO;

public class HotelDAOimp implements IHotelDAO {
	//prepare query
	private static final String HOTEL_INFO_INSERT_QUERY="INSERT INTO HOTEL_INFO VALUES(HOTEL_SEQ.NEXTVAL,?,?,?)";
int count=0;
	//HAS-A property
	private DataSource ds;
	//constructor for injection
	public HotelDAOimp(DataSource ds) {
		this.ds = ds;
	}
	
	@Override
	public int insert(HotelBO htbo) throws Exception {
		try(//gett con object from ds object
				Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(HOTEL_INFO_INSERT_QUERY);
				){
			//set param values
			if (ps!=null) {
				ps.setString(1,htbo.getHname());
				ps.setString(2, htbo.getHadd());
				ps.setDouble(3, htbo.getTotalAmt());
				//execute query
				 count=ps.executeUpdate();
			}
			
		}//try
		catch(SQLException se) {
			se.printStackTrace();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		
		}
		return count;
	}//method

}//class
