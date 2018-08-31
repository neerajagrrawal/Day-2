package com.capgemini.day2;

public class ArmstrongRange {

	public static int[] generateRange(int lower, int upper) {
		int armstrongNumbers[]=new int[4] ;
		int index=0 ;
		for(int j=lower;j<=upper;j++)
		{
			int sum=0 ;
			int num=j ;
			int temp=num ;
		for(int i=0;num>0;i++)
		{
			sum+=Math.pow(num%10,3) ;
			num=num/10 ;
		}
		
		if(temp==sum)
			armstrongNumbers[index++]=temp ;
	}
		return armstrongNumbers ;

}}
