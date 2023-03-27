package com.practicee.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SpyTest {

	@Test
	public void testSpy1() {
		List arrayListMock = mock(ArrayList.class);
		assertEquals(0, arrayListMock.size());
		//mocks retuen default value
		when(arrayListMock.size()).thenReturn(5);
		assertEquals(5, arrayListMock.size());
	}
	
	@Test
	public void testSpy2() {
		List arrayListMock = mock(ArrayList.class);
		assertEquals(0, arrayListMock.size());
		//mocks retuen default value
		when(arrayListMock.size()).thenReturn(5);
		arrayListMock.add("Dummy");
		assertEquals(5, arrayListMock.size());
	}
	
	@Test
	public void testSpy3() {
		List arrayListSpy = spy(ArrayList.class);
		assertEquals(0, arrayListSpy.size());
		//mocks retuen default value
		arrayListSpy.add("Dummy");
		assertEquals(1, arrayListSpy.size());
		arrayListSpy.remove("Dummy");
		assertEquals(0, arrayListSpy.size());
	}
	
	@Test
	public void testSpy4() {
		List arrayListSpy = spy(ArrayList.class);
		arrayListSpy.add("Dummy");
		verify(arrayListSpy).add("Dummy");
		verify(arrayListSpy,never()).clear();
	}

}
