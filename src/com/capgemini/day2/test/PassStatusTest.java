package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.IncomeTax;
import com.capgemini.day2.PassStatus;

class PassStatusTest {

	@Test
	void testCalculateStatus() {
		assertEquals("Promoted",PassStatus.calculateStatus(80,70,30));
	}

}
