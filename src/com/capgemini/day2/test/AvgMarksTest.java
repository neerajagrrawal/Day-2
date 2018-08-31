package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.ArmstrongRange;
import com.capgemini.day2.AvgMarks;

class AvgMarksTest {

	@Test
	void testCalculateAvg() {
		int[][] a = {{1, 2, 3}, {4, 5, 6}, {7,8,9}};
		assertArrayEquals(new int[]{6,0,0,0,0,0,0,0,0,0,0,0},AvgMarks.calculateAvg(a));
	}

}
