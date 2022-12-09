package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

	/* @Test
	public void test() {
		StringHelper helper = new StringHelper();
		String actual = helper.truncateAInFirst2Positions("AACD");
		String expected = "CD";
		//AACD=>CD ACD=>CD CDEF=>CDEF CDAA=>CDAA
		assertEquals(expected,actual);
	} */
	//I actually created a lot of variables to really make it easy for you to understand.
	//use InlineVariables, to do that-> right click on the varaibles-> (ex: actual) -> Refactor -> Inline
	
	StringHelper helper;
	
	@Before
	public void setUp() {
		helper= new StringHelper();
	}
	
	
	//AACD=>CD ACD=>CD CDEF=>CDEF CDAA=>CDAA
	@Test
	public void testTruncateAInFirst2Positions1() {
		//AACD=>CD 
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
	} 
	
	@Test
	public void testTruncateAInFirst2Positions2() {
		//ACD=>CD 
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
	} 
	
	@Test
	public void testTruncateAInFirst2Positions3() {
		//CDEF=>CDEF 
		assertEquals("CDEF",helper.truncateAInFirst2Positions("CDEF"));
	} 
	
	@Test
	public void testTruncateAInFirst2Positions4() {
		//CDAA=>CDAA
		assertEquals("CDAA",helper.truncateAInFirst2Positions("CDAA"));
	} 
	
	
	//ABCD=>false, ABAB=>true, AB=>true, A=>false
	/* @Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		boolean actualValue = helper.areFirstAndLastTwoCharactersTheSame("ABCD");
		boolean expectedValue = false;
		assertEquals(expectedValue, actualValue);
	} */
	//Use Inline now
	
	@Test
	//ABCD=>false
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario1() {
		assertFalse( helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	//ABAB=>true
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario2() {
		assertTrue( helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	@Test
	//AB=>true
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario3() {
		assertTrue( helper.areFirstAndLastTwoCharactersTheSame("AB"));
	}
	
	@Test
	//A=>false
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario4() {
		assertFalse( helper.areFirstAndLastTwoCharactersTheSame("A"));
	}
}

