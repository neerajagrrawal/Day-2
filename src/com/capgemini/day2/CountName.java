package com.capgemini.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountName {

	public static int countConstructor(String ser,String arr[]) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Enter name to search" );
		//String ser=br.readLine() ;
		int count=0 ;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].compareTo(ser)==0)
				count++ ;
		}
	return count ;
	}

}
