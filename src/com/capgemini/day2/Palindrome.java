package com.capgemini.day2;

import java.util.Scanner;

public class Palindrome {

	public static boolean checkIfPalindrome(int num) {
		int sum = 0,r ;
		int temp = num ;
		while(num>0)
		{
			r = num%10 ;
			sum=(sum*10)+r;
			num=num/10;
		}
		//System.out.print("Output:") ;
		if(temp==sum)
			return true ;
		else
			return false ;
	}

}
