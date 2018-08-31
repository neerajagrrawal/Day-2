package com.capgemini.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cui {

	public static String checkAuthentication(String actualUname, String actualPass) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count=0 ;
		String username=actualUname ;
		String pass=actualPass ;
		
		
		String tri="" ;
		String tri1="" ;
		int flag=0 ;
		for(;;)
		{
			System.out.println("Enter username");
			tri=br.readLine() ;
			System.out.println("Enter password");
			tri1=br.readLine() ;
			if(pass.equals(tri1) && username.equals(tri)) 
			{
				//System.out.println(pass+"---"+tri1);
				//return("Welcome");
				flag=1 ;
				
			}
			if(count>2)
			{
				return("Contact Admin");

			}
			if(count<=2 && flag==0)
			{
				System.out.println("Try Again");
				count++ ;

			}
			
				if(flag==1)
				{
					return("Welcome") ;
					//break ;
				}
				flag=0 ;
		}
		//return("Error") ;
	}

}
