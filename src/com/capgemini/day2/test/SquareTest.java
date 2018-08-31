package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.PassStatus;
import com.capgemini.day2.Square;

class SquareTest {

	@Test
	void testCalculateSquare() {
		assertEquals(25,Square.calculateSquare(5));
	}

}
