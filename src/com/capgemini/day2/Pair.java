package com.capgemini.day2;

import java.util.Arrays;

public class Pair {

	public static int[][] findPairs(int k) {
		int arr[] = new int[]{ 7,3,1,4,2,8,9,6};
		 Arrays.sort(arr);
		 int pairs[][]=new int[3][2] ;
		 //int k=4 ;
		 int i=0,j=arr.length ;
		 //int plus,search ;
		 int count=0 ;
		 for(int t=0;t<arr.length;t++)
		 {
			 
			 int l=Arrays.binarySearch(arr,arr[t]-k);
			 if(l<0)
				 continue ;
			 else {
				 pairs[count][0]=arr[t] ;
				 pairs[count][1]=arr[l] ;
				 count++ ;
				 //System.out.println("Pair->"+arr[t]+"-"+arr[l]) ;
			 }
		 }
		 return pairs ;
		// System.out.println(l) ;
	}

}
