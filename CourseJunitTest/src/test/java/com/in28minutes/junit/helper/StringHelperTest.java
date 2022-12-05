package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

  	@Test
	public void test1() {
		//expected :<ABC[]> but was :<ABC[D]>
		assertEquals("ABC", "ABCD");//this makes test fail/ red bar
		  //     expected , Actual
	}  
   
  //	Now Change the Actual Value to ABC
	
	@Test
	public void test2() {
		//expected :<ABC[]> but was :<ABC[D]>
		assertEquals("ABC", "ABC");//this makes test pass/ Green bar
		  //     expected , Actual
	} 
}

