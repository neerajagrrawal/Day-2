package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.FindMissing;

class FindMissingTest {

	@Test
	void testFindMissingNumber() {
		int arr[] = new int[]{ 7,3,1,4,2,8,9,6,0};
		assertEquals(5,FindMissing.findMissingNumber(arr)) ;
	}

}
