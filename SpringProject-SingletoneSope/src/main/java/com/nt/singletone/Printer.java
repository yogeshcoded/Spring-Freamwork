//singleton class with minimum standards
package com.nt.singletone;

public class Printer {
	//static reference variable
	private static Printer INSTANCE;
	
	//private constructor
	private Printer() {
	System.out.println("Printer.0-paran constructor");
	}
	
	//public static factory method having singleton method logic
	public synchronized static Printer getInstance() {
		//singleton logic
		if (INSTANCE==null) {
			try {
				Thread.sleep(10000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			INSTANCE=new Printer();
	}//if
			return INSTANCE;		
			}//method
	
	//b.method
	public void Printer() {
		System.out.println("Colllect your printout");
	} 
	
}//class
