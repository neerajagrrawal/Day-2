package com.capgemini.day2;

import java.util.Scanner;

public class Armstrong {

	public static boolean checkIfArmstrong(int num) {
		//System.out.println(num);
		int temp=num ;
		int sum=0 ;
		for(int i=0;num>0;i++)
		{
			sum+=Math.pow(num%10,3) ;
			num=num/10 ;
		}
		
		if(temp==sum)
			return true;
		else
			return false;
	}

}
