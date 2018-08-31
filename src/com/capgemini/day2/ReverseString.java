package com.capgemini.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseString {

	public static String performReverse(String inp) {
		// TODO Auto-generated method stub
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				//String inp=br.readLine();
				String words[]=inp.split(" ") ;
				
				//String reverse[]=new String[words.length] ;
				String fin="";
				for(int i=0;i<words.length;i++)
				{
					String rev="" ;
					for(int j=words[i].length()-1;j>=0;j--)
					{
						rev+=words[i].charAt(j) ;
					}
					//reverse[i]=rev ;
					if(i<words.length-1)
					fin+=rev+" ";
					else
						fin+=rev ;
				}
				return fin ;
	}

}
