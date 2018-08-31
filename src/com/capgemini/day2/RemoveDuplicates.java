package com.capgemini.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RemoveDuplicates {

	public static String cleanString(String inp) {
		// TODO Auto-generated method stub
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				//String inp=br.readLine();
				String words[]=inp.split("") ;
				String words1[]=new String[words.length] ;
				String fin="" ;
				int count=1 ;
				words1[0]=words[0] ;
				int flag=0 ;
				for(int i=1;i<words.length;i++)
				{
					for(int j=0;j<count;j++)
					{
						if(words1[j].compareTo(words[i])==0)
						{
							flag=1 ;
							//System.out.println("Set") ;
						}
					}
					if(flag!=1)
					{
						words1[count]=words[i] ;
						count++ ;
					}
					flag=0 ;
					
				}
				for(int k=0;k<count;k++)
					fin+=words1[k] ;
				return fin ;
	}

}
