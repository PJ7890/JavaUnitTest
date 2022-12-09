package com.in28minutes.junit.helper;


/////Extra Activities

public class AssertTrueAndFalse {

	public boolean isEvenNumber(int number) {
		boolean result = false;
		if(number%2 == 0) {
			result = true;
		}
		return result;
	}
	
	public boolean isOddNumber(int number) {
		boolean result = false;
		if(number%2 != 0) {
			result = true;
		}
		return result;
	}
}
