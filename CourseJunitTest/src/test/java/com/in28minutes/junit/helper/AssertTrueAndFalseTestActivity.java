package com.in28minutes.junit.helper;


/////Extra Activities


import static org.junit.Assert.*;

import org.junit.Test;

public class AssertTrueAndFalseTestActivity {

	AssertTrueAndFalseActivity asft = new AssertTrueAndFalseActivity();
	
	@Test
	public void testEvenNumber1() {
		assertTrue(asft.isEvenNumber(4));
	}

	@Test
	public void testEvenNumber2() {
		assertFalse(asft.isEvenNumber(13));
	}
	
	@Test
	public void testOddNumber3() {
		assertTrue(asft.isOddNumber(19));
	}
	
	@Test
	public void testOddNumber4() {
		assertFalse(asft.isOddNumber(20));
	}
}
