package com.capgemini.day2;

import java.util.Scanner;

public class PassStatus {

	public static String calculateStatus(int s1,int s2,int s3) {
		if(s1>60 && s2>60 && s3>60)
			return("Passed");
		else if(s1>60 && s2>60 || s2>60 && s3>60 || s3>60 && s1>60)
			return("Promoted");
		
		else
			return("Fail") ;
	}

}
