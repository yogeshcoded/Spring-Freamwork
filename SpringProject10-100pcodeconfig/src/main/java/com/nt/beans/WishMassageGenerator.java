package com.nt.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class WishMassageGenerator {
//  HAS a property (supporting or injection)
	@Autowired
	private LocalDateTime ldt;
	
	public WishMassageGenerator() {
		System.out.println("WishMassageGenerator :no-param constructor()");
		}
	
	//b.logic 
	public String ganerateMassage(String user) {
		//get current hour of the day
		int hour=ldt.getHour();//gives 0-23hr
		if (hour<12) {
			return "Good morning"+user;
		}
		else if (hour<16) {
			return "Good Afternoon"+user;
			}
		else if (hour<20) {
			return "Good Evening"+user;
					}else
	return "Good night"+user;
	}
}//class
