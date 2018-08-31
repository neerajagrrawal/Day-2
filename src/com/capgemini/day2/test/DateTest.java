package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Date;
import com.capgemini.day2.PassStatus;

class DateTest {

	@Test
	void testFullDate() {
		assertEquals("23/aug/2018",Date.FullDate("23,08,2018"));
	}

}
