package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.RemoveDuplicates;

class RemoveDuplicatesTest {

	@Test
	void testCleanString() {
		assertEquals("helo",RemoveDuplicates.cleanString("hello"));
	}

}
