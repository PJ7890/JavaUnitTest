package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	//Arrays.sort
	
	@Test
	public void testArraySort_RandomArray() {
		int[] numbers = { 12,3,4,1};
		int[] expected = { 1,3,4,12};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
		
		//int[] expected = { 1,4,3,12}; 
		//if i give this above wrong expectedvalue then it will says this below
		//arrays first differed at element [1]; expected:<4> but was:<3>
	}
	
	/*@Test
	public void testArraySort_NullArray() {
		int[] number = null;
		Arrays.sort(number);
	}*/
	//im getting the nullPointerException becuase not a real code is going wrong , but the code manner is not correct.
	
	
	/*@Test
	public void testArraySort_NullArray() {
		int[] numbers = null;
		try {
			Arrays.sort(numbers);
			
		}catch(NullPointerException e) {
			//success
		}
	}*/
	//but we need @testing related code 
	
	@Test(expected = NullPointerException.class)
	public void testArraySort_NullArray() {
		int[] numbers = null;
		Arrays.sort(numbers);	
	}
	//this is the actual format of exception
	
	@Test(timeout = 100)
	public void testSort_Performance() {
		int array[] = { 12, 13, 14};
		for (int i=1;i<=1000000; i++) {
			array[0] = i;
			Arrays.sort(array);
		}
	}

}
