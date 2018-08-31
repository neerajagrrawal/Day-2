package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Cui;

class CuiTest {

	@Test
	void testCheckAuthentication() {
		try {
			assertEquals("Contact Admin", Cui.checkAuthentication("nee","123"));
		}
		catch(Exception e)
		{
			
		}
		
	}

}
