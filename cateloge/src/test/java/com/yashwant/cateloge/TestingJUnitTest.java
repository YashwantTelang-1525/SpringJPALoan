package com.yashwant.cateloge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.yashwant.cateloge.services.TestingJUnit;

class TestingJUnitTest {

	@Test
	public void testAreRevEqual() {
		//fail("Not yet implemented");
		TestingJUnit test = new TestingJUnit();
		String actualValue = test.areRevEqual("pop");
		String expected = "pop";
		assertEquals(expected, actualValue);
	
	}

}
