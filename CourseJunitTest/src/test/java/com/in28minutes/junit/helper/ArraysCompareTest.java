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

}
