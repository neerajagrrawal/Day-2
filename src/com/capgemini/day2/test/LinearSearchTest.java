package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.IncomeTax;
import com.capgemini.day2.LinearSearch;

class LinearSearchTest {

	@Test
	void testGetIndex() {
		int arr[]= {1,4,6,5,3} ;
		int key=5 ;
		assertEquals(3,LinearSearch.getIndex(arr,key));	
	}

}
