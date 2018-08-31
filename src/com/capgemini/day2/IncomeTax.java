package com.capgemini.day2;

import java.util.Scanner;

public class IncomeTax {

	public static double calculateTax(double amt) {
		double tax=0;
		if(amt>=0 && amt<=180000)
			return 0 ;
		else if(amt>=181001 && amt<=300000)
		{	tax=amt*0.1;
		return tax ;
		}
		else if(amt>=300000 && amt<=500000)
		{	tax=amt*0.2;
		return tax ;
		}
		else if(amt>=500000)
		{	tax=amt*0.3;
		return tax ;
		}
		return tax ;
	}

}
