package com.nt.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan(basePackages = "com.nt")
@PropertySource(value = "com/nt/commons/jdbc.properties")
@ImportResource(locations = "com/nt/cfg/applicationContext.xml")

public class AppConfig {
	@Autowired
	private Environment env;
	
	@Bean(name="dmds")
	public DriverManagerDataSource createDMDS() {
		DriverManagerDataSource dmds=new DriverManagerDataSource();
		dmds.setDriverClassName(env.getRequiredProperty("jdbc.driver"));
		dmds.setUrl(env.getRequiredProperty("jdbc.url"));
		dmds.setUsername(env.getRequiredProperty("jdbc.username"));
		dmds.setPassword(env.getRequiredProperty("jdbc.password"));
		return dmds;
		
	}

}
