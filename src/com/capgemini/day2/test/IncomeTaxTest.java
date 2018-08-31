package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.BubbleSort;
import com.capgemini.day2.IncomeTax;

class IncomeTaxTest {

	@Test
	void testCalculateTax() {
		assertEquals(0,IncomeTax.calculateTax(10000000));	
		}

}
