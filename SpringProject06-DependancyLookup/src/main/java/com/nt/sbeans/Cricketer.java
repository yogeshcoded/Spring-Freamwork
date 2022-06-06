package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
@Component("crkt")
@PropertySource(value="classpath:com/nt/commons/info.properties")

public class Cricketer {
	@Value("${crkt.name}")
private String name;
	@Value("${crkt.jercyNo}")
private int jercyNo;

public Cricketer() {
	System.out.println("Crickert param const");
	}//constructor

public void fielding() {
	System.out.println(name+"  with jercy no " +jercyNo+  " is fielding");
}//field method

public void balling() {
	System.out.println(name+ "  with jercy no " +jercyNo+  "  is balling");
}//batting method

public void wicketKeeper() {
	System.out.println(name+ "  with jercy no " +jercyNo+  "  is Keepering");
}//keepering method

public void batting() {
	//create extra IOC container
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfg/applicationContext.xml");
	//perform dependency lookup to get bat object
	//CricketBat bat=ctx.getBean("bat",CricketBat.class);
	CricketBat bat=ctx.getBean(CricketBat.class);
	
	//invoke the b.methods
	int runs=bat.scoreRun();
	
}//batting  method

}//class
