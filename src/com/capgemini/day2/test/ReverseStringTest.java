package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.ReverseString;

class ReverseStringTest {

	@Test
	void testPerformReverse() {
		assertEquals("jareen woh era uoy", ReverseString.performReverse("neeraj how are you"));
	}

}
