package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.DeleteWord;

class DeleteWordTest {

	@Test
	void testDeleteTheWord() {
		assertEquals("hello hi how ",DeleteWord.deleteTheWord("hello hi ugh how",2)) ;
	}

}
