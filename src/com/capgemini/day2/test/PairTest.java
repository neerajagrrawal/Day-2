package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Pair;

class PairTest {

	@Test
	void testFindPairs() {
		int arr[][]={{6,2},{7,3},{8,4}} ;
		assertArrayEquals(arr,Pair.findPairs(4)) ;
	}

}
