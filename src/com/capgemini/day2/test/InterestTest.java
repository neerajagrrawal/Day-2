package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.ArmstrongRange;
import com.capgemini.day2.Interest;

class InterestTest {

	@Test
	void testCalculateInterest() {
		assertArrayEquals(new double[]{20,21.000000000000014},Interest.calculateInterest(100,10,2));
	}

}
