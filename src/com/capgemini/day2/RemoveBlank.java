package com.capgemini.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RemoveBlank {

	public static String removeSpaces(String inp) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String inp=br.readLine();
		String words[]=inp.split(" ") ;
		String words2[]=inp.split("") ;
		String words1[]=new String[words2.length] ;
		char finn[]=new char[words2.length] ;
		String fin="" ;
		int count=0 ;
		int flag=0 ;
		int ctspace=0 ;
		for(int i=0;i<words2.length;i++)
		{
			
			
				if(Character.isWhitespace(words2[i].charAt(0)))
				{
					flag=1 ;
				}
				//System.out.println(words2[i].charAt(0));
				if(flag!=1)
				{
					words1[i]=words2[i] ;
					finn[count]=words2[i].charAt(0) ;
					count++ ;
				}
				if(flag==1)
				{
					if(Character.isWhitespace(finn[count-1]))
					{
						flag=0 ;
						continue ;
					}
					else
					{
						words1[i]=words2[i] ;
						finn[count]=words2[i].charAt(0) ;
						count++ ;
					}
				}
				flag=0 ;
		}
		
		for(int k=0;k<count;k++)
		{
			fin+=finn[k] ;
			//System.out.print(finn[k]) ;
		}
		//System.out.println();
		return fin ;
}
	
	
	
	
	public static String removeWord(String fin,String find) {	
		Scanner sc=new Scanner(System.in) ;
		//String find=sc.next() ;
		String rem[]=fin.split(" ") ;
		int ind=-1 ;
		for(int r=0;r<rem.length;r++)
		{
			if(rem[r].compareTo(find)==0)
			{
				ind=r ;
				break ;
			}
		}
		String sup="" ;
		for(int k=0;k<rem.length;k++)
		{
			if(k!=ind)
			sup+=rem[k]+" " ;
			//System.out.print(find); ;
		}
		
		
		return sup ;
	}

}
