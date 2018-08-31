package com.capgemini.day2;

public class LinearSearch {

	public static int getIndex(int[] arr, int key) {
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key)
				return i;
		}
		return -1;
	}

}
