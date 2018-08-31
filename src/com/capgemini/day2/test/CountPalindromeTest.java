package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.CountPalindrome;

class CountPalindromeTest {

	@Test
	void testFindPalindromes() {
		String inp[]= {"aka","asdas","sasasas","ototo"} ;
		String arr1[]= {"sasasas","ototo","aka"} ;
		assertArrayEquals(arr1,CountPalindrome.findPalindromes(inp));
	}

}
