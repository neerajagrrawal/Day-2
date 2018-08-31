package com.capgemini.day2;

import java.util.Scanner;

public class AvgMarks {

	public static int[] calculateAvg(int num[][]) {
		//num[][3]=new int[3][3] ;
		int s1=0,s2=0,s3=0,a1=0,a2=0,a3=0 ;
		int sa1=0,sa2=0,sa3=0,avg1=0,avg2=0,avg3=0 ;
//		Scanner sc = new Scanner(System.in) ;
//		System.out.println("Enter the value");
		/*for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				num[i][j]=sc.nextInt() ;
				
			}
		}*/
		for(int j=0;j<3;j++)
		{
			s1+=num[0][j] ;
			s2+=num[1][j] ;
			s3+=num[2][j] ;
		}
		a1=s1/3 ;
		a2=s2/3 ;
		a3=s3/3 ;
		
		for(int j=0;j<3;j++)
		{
			sa1+=num[j][0] ;
			sa2+=num[j][1] ;
			sa3+=num[j][2] ;
		}
		avg1=sa1/3 ;
		avg2=sa2/3 ;
		avg3=sa3/3 ;
		int finalMarks[]= {s1,a1,s2,a2,s3,a3,sa1,avg1,sa2,avg2,sa3,avg3} ;
		return finalMarks ;
	/*System.out.println("Total score and avg score of s1 "+s1+","+a1);
	System.out.println("Total score and avg score of s2 "+s2+","+a2);
	System.out.println("Total score and avg score of s3 "+s3+","+a3);
	System.out.println("Total and avg score of subj1 "+sa1+","+avg1);
	System.out.println("Total and avg score of subj2 "+sa2+","+avg2);
	System.out.println("Total and avg score of subj3 "+sa3+","+avg3);*/
	}

}
