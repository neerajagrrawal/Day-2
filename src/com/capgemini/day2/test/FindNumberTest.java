package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Findnumber;

class FindNumberTest {

	@Test
	void testCheckIfPresent() {
		int[][] arr =new int[2][2] ;
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j]=4 ;
			}
		}
		assertEquals(true,Findnumber.checkIfPresent(arr,4)) ;
	}

}
