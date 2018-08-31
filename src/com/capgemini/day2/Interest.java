package com.capgemini.day2;

import java.util.Scanner;

public class Interest {

	public static double[] calculateInterest(double principal, double rate, double time) {
		double simpleInterest=(principal*time*rate)/100 ;
		double compoundInterest=principal*Math.pow(1.0+rate/100.00,time)-principal;
		double interests[]= {simpleInterest,compoundInterest} ;
		return interests ;
	}

}
