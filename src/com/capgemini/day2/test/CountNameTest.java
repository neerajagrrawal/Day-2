package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.CountName;

class CountNameTest {

	@Test
	void testCountOccurence() {
		String arr[]= {"neeraj","aman","arpit","anupam","neeraj"} ;
		assertEquals(2,CountName.countConstructor("neeraj",arr)) ;
	}

}
