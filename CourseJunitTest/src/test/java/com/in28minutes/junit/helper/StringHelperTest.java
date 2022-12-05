package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

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
	
	@Test
	public void test1() {
		StringHelper helper = new StringHelper();
		//AACD=>CD ACD=>CD CDEF=>CDEF CDAA=>CDAA
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
	} 
	
	@Test
	public void test2() {
		StringHelper helper = new StringHelper();
		//AACD=>CD ACD=>CD CDEF=>CDEF CDAA=>CDAA
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
	} 
	
	@Test
	public void test3() {
		StringHelper helper = new StringHelper();
		//AACD=>CD ACD=>CD CDEF=>CDEF CDAA=>CDAA
		assertEquals("CDEF",helper.truncateAInFirst2Positions("CDEF"));
	} 
	
	@Test
	public void test4() {
		StringHelper helper = new StringHelper();
		//AACD=>CD ACD=>CD CDEF=>CDEF CDAA=>CDAA
		assertEquals("CDAA",helper.truncateAInFirst2Positions("CDAA"));
	} 
}

