package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Palindrome;

class PalindromeTest {

	@Test
	void testCheckIfPalindrome() {
		assertEquals(true,Palindrome.checkIfPalindrome(121)) ;
	}

}
