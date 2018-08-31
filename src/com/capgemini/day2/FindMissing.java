package com.capgemini.day2;

import java.util.Arrays;

public class FindMissing {

	public static int findMissingNumber(int[] arr) {
		Arrays.sort(arr);
		 //int k=4 ;
		 int i=0,j=arr.length ;
		 //int plus,search ;
		 for(int t=0;t<arr.length;t++)
		 {
			 
			 int l=Arrays.binarySearch(arr,t);
			 if(l<0)
				 {
				 return t ;
				 //break ;
				 }
			 else {
				 continue ;
			 }
		 }
		return -1 ;
		 
	}

}
