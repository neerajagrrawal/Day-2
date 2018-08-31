package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.RemoveBlank;

class RemoveBlankTest {

	@Test
	void testRemoveSpaces() {
		assertEquals("neeraj how are you", RemoveBlank.removeSpaces("neeraj    how are you"));
		assertEquals("neeraj are you ", RemoveBlank.removeWord("neeraj how are you","how"));
	}

}
