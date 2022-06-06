package com.nt.beans;

import java.util.Date;

public class WishMassageGenerator {
//  HAS a property (supporting or injection)
	private Date date;

	public WishMassageGenerator(Date date) {
		this.date = date;
		System.out.println("WishMassageGenerator : Date-param constructor" + date);
	}

	// setter method supported setter injection
			public void setDate(Date date) {
				System.out.println("WishMassageGenerator.setDate(-)"+date);
				this.date = date;
			}
	
	// b.logic
	public String ganerateMassage(String user) {
		// get current hour of the date
		int hour = date.getHours();// gives 0-23hr
		if (hour < 12) {
			return "Good morning" + user;
		} else if (hour < 16) {
			return "Good Afternoon" + user;
		} else if (hour < 20) {
			return "Good Evening" + user;
		} else
			return "Good night" + user;
	}
}
