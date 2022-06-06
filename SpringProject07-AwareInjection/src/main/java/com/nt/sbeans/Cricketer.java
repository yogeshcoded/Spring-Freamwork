package com.nt.sbeans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("crkt")
@PropertySource(value="classpath:com/nt/commons/info.properties")
public class Cricketer implements ApplicationContextAware {
	@Value("${crkt.name}")
private String name;
	@Value("${crkt.jercyNo}")
private int jercyNo;
	
	
	private ApplicationContext ctx;
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("Cricketer.setApplicationContext()");
		this.ctx=ctx;
	}
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
		//perform dependency lookup to get bat object
	//CricketBat bat=ctx.getBean("bat",CricketBat.class);
	CricketBat bat=ctx.getBean(CricketBat.class);
		//invoke the b.methods
	int runs=bat.scoreRun();
	}//batting  method



}//class
