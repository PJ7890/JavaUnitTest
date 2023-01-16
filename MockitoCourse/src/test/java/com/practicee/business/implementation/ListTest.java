package com.practicee.business.implementation;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ListTest {

	//Simple mock test with lists
	@Test
	public void LetsMockListTestMethod() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2);
		assertEquals(2,listMock.size());
		assertEquals(2,listMock.size());
		assertEquals(2,listMock.size());
	}
	
	//mock test for multiple values
	@Test
	public void letsMockListSize_ReturnMultipleValues() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2).thenReturn(3);
		assertEquals(2,listMock.size());
		assertEquals(3,listMock.size());
	}
	
	//mock test for list Get()
	@Test
	public void letsMockListGet() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("carrier");
		assertEquals("carrier",listMock.get(0));
		assertEquals(null,listMock.get(1));
	}
	
	//mock test for list Get(anyInt())
	@Test
	public void letsMockListGet_anyInt() {
		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenReturn("car5rier");
		assertEquals("car5rier",listMock.get(0));
	}
	
	//mock test for throwing an Exception
	@Test(expected=RuntimeException.class)
	public void letsMockList_throwAnException() {
		List listMock = mock(List.class);
		//Arguement Matcher
		when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something"));
		listMock.get(0);
	}

}
