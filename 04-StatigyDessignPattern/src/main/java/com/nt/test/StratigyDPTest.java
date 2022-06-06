package com.nt.test;

import com.nt.comps.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StratigyDPTest {
public static void main(String[] args) {
	Flipkart fpkt=FlipkartFactory.getInstance("dhl");
	String ResultMsg=fpkt.shopping(new String[] {"candel","folwer","wine","chocks"},
			new double[]{250.0,8512.0,7800.02,45012.023});
	System.out.println(ResultMsg);
}
}
