package com.capgemini.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountPalindrome {

	public static String[] findPalindromes(String[] inp) {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String inp[]=new String[10];
		String palin[]=new String[3];
		String rev="" ;
		int count=0 ;
		int trk=inp.length ;
		/*for(int i=0;i<3;i++)
		{
			inp[i]=br.readLine();
			trk++ ;
		}*/
		
		/*for(int i=0;i<4;i++)
		{
			System.out.println(inp[i]);
		}*/
		
		for(int i=0;i<trk;i++)
		{
			for(int j=inp[i].length()-1;j>=0;j--)
			{
				rev+=inp[i].charAt(j) ;
			}
			//System.out.println(rev+"----"+inp[i]);
			if(inp[i].equals(rev)==true)
			{
				palin[count]=inp[i] ;
				count++ ;
			}
			rev="" ;
		}
		
		/*for(int i=0;i<count;i++)
		{
			System.out.println(palin[i]) ;
		}*/
		int n=count ;
		String swap="" ;
		for (int c = 0; c < ( n - 1 ); c++) {
		      for (int d = 0; d < n - c - 1; d++) {
		        if (palin[d].length() < palin[d+1].length()) /* For descending order use < */
		        {
		          swap       = palin[d];
		          palin[d]   = palin[d+1];
		          palin[d+1] = swap;
		        }
		      }
		    }
		
		/*for(int i=0;i<count;i++)
		{
			System.out.println(palin[i]) ;
		}*/
		return palin ;
	}

}
