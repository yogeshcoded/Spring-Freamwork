package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.bo.CoronaPatientBO;
@Repository("mysqlDAO")
public class CoronaPatientDAOMysqlimpl implements ICoronaPatientDAO {
	//prepare string query
	private static final String PATIENT_INFO_INSERT_QUERY="INSERT INTO CORONA_PATIENT_INFO(PNAME,PADD,TOTALBILL) VALUES(?,?,?)";
int count=0;
	//HAS-A property
@Autowired
		private DataSource ds;
		
//constructor
		public CoronaPatientDAOMysqlimpl(DataSource ds) {
			System.out.println("CoronaPatientDAOMysqlimpl-0-param constructor");
			this.ds = ds;
		}
		
	@Override
	public int insert(CoronaPatientBO bo) throws Exception {
		try(
				//get connection pooled object
		Connection con=ds.getConnection();
		PreparedStatement ps=con.prepareStatement(PATIENT_INFO_INSERT_QUERY);	){
			//set param values 
			if (ps!=null) {
				ps.setString(1, bo.getPname());
				ps.setString(2,bo.getPadd());
				ps.setDouble(3, bo.getTotalBill());
				
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
		
		return count;
	}//method
}//class
