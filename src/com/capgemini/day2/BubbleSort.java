package com.capgemini.day2;

public class BubbleSort {

	public static int[] sortArray(int[] ar) {
		
		
		for( int i=0;i<=ar.length;i++)
		{
			for(int j=i+1;j<=ar.length-1;j++)
			{
				if(ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		return ar ;
	}
	}


