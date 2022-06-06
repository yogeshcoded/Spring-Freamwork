package com.nt.config;

import javax.sql.DataSource;

import org.logicalcobwebs.proxool.ProxoolDataSource;
import org.logicalcobwebs.proxool.ProxoolDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = "com/nt/dao")
@PropertySource(value = "com/nt/commons/jdbc.properties")

public class PersistenceConfig {
	@Autowired
	private Environment env;

	/*@Bean(name = "dbcp2")
	public DataSource createDMDS() {
		BasicDataSource dbcp=new BasicDataSource();
		dbcp.setUrl(env.getRequiredProperty("jdbc.url"));
		dbcp.setUsername(env.getRequiredProperty("jdbc.username"));
		dbcp.setPassword(env.getRequiredProperty("jdbc.password"));
		dbcp.setMinIdle(10);
		dbcp.setMaxTotal(100);
		dbcp.setMaxWaitMillis(1000);
		
		return dbcp;
	}*/

	/*@Bean("hkcp")
	public DataSource createDMDs() {
		HikariDataSource  hkcp=new HikariDataSource();
		hkcp.setJdbcUrl(env.getRequiredProperty("jdbc.url"));
		hkcp.setUsername(env.getRequiredProperty("jdbc.username"));
		hkcp.setPassword(env.getRequiredProperty("jdbc.password"));
		hkcp.setMinimumIdle(10);
		hkcp.setMaximumPoolSize(100);
		hkcp.setConnectionTimeout(30000);
		return hkcp;
	}*/

	/*	@Bean("c3po")
		public DataSource createDMDs() {
		ComboPooledDataSource cpds=new ComboPooledDataSource();
			cpds.setJsdbcUrl(env.getRequiredProperty("jdbc.url"));
			cpds.setUser(env.getRequiredProperty("jdbc.username"));
			cpds.setPassword(env.getRequiredProperty("jdbc.password"));
			cpds.setMaxIdleTime(10);
			cpds.setMaxPoolSize(100);
			
		  
			return cpds;
		}
	*/

	@Bean("pxl")
	public DataSource createDMDs() {

		ProxoolDataSource pxl = new ProxoolDataSource();
		pxl.setDriver(env.getRequiredProperty("jdbc.driver"));
		pxl.setDriverUrl(env.getRequiredProperty("jdbc.url"));
		pxl.setUser(env.getRequiredProperty("jdbc.username"));
		pxl.setPassword(env.getRequiredProperty("jdbc.password"));
		pxl.setMaximumConnectionCount(10);
		pxl.setMaximumActiveTime(10000);

		return pxl;
	}

	/*	@Bean("vibur")
		public DataSource createDMDs() {
			ViburDBCPDataSource vibur=new ViburDBCPDataSource();
			vibur.setJdbcUrl(env.getRequiredProperty("jdbc.url"));
			vibur.setUsername(env.getRequiredProperty("jdbc.username"));
			vibur.setPassword(env.getRequiredProperty("jdbc.password"));
			vibur.setPoolMaxSize(100);
			vibur.setConnectionTimeoutInMs(10000);
			vibur.start();
			return vibur;
		}*/

}
