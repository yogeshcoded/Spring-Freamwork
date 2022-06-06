package com.nt.sbeans;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component("bat451")
public class CricketBat {
	public CricketBat() {
		System.out.println("cricketbat o -param cont");
	}
	public int scoreRun() {
		return new Random().nextInt(200);
	}

}
