package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Discount;

class DiscountTest {

	@Test
	void testCalculateDiscount() {
		assertEquals(65,Discount.calculateDiscount(100,0.35)) ;
	}

}
