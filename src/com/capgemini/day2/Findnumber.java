package com.capgemini.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Findnumber {

	public static boolean checkIfPresent(int[][] arr, int key) {
		// TODO Auto-generated method stub
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				Scanner sc=new Scanner(System.in) ;
				
				
				int flag=0 ;
				//System.out.print("Enter number to find" );
				//int key=sc.nextInt() ;
				for(int i=0;i<2;i++)
				{
					for(int j=0;j<2;j++)
					{
						if(arr[i][j]==key)
						{
							return true ;
//							flag=1 ;
//							break ;
						}
					}
				}
				
				return false ;	
				
				

}}
