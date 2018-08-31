package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.ArmstrongRange;

class ArmstrongRangeTest {

	@Test
	void testGenerateRange() {
		assertArrayEquals(new int[]{153, 370, 371, 407},ArmstrongRange.generateRange(100, 1000));
	}

}
