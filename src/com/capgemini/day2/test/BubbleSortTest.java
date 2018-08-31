package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.AvgMarks;
import com.capgemini.day2.BubbleSort;

class BubbleSortTest {

	@Test
	void testSortArray() {
		int a[]= {3,2,1,5,7} ;
		int b[] = {5,1,4,2,3} ;
		assertArrayEquals(new int[]{1,2,3,5,7},BubbleSort.sortArray(a));
		assertArrayEquals(new int[]{1,2,3,4,5},BubbleSort.sortArray(a));
	}

}
