package com.nt.service;

public class BankService {
	
public double CalculateIntrestAmount(double pamt,double rate,double time) {
	return ( pamt*Math.pow((1+rate/100),time))-pamt;
}
}//class
