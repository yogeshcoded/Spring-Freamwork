package com.nt.confg;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.nt")
@PropertySource(value = "com/nt/commons/jdbc.properties")
@ImportResource(locations = "com/nt/cfg/applicationContext.xml")
public class AppConfig {
	@Autowired
	private Environment env;
		
	@Bean(name = "hkcpDS")
	public DataSource createHKCPDS() {
		HikariDataSource hkds=new HikariDataSource();
		hkds.setDriverClassName(env.getRequiredProperty("jdbc.driver"));
		hkds.setJdbcUrl(env.getRequiredProperty("jdbc.url"));
		hkds.setUsername(env.getRequiredProperty("jdbc.username"));
		hkds.setPassword(env.getRequiredProperty("jdbc.password"));
		hkds.setMinimumIdle(10);
		hkds.setMaximumPoolSize(100);
		hkds.setConnectionTimeout(1000);
		return hkds;
	}

}
