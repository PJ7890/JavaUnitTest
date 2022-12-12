package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListTestExtraActivity {

	private List<Integer> list;
	
	@Before
	public void setUp() {
		list = new ArrayList<>();
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(1);
		list.add(5);
		list.add(9);
	}
	
	@After
	public void tearDown() {
		list.clear();
	}
	
	@Test 
	public void shouldBeOkToAlterTestData() {
		list.remove(0);//Removes first element of the list
		assertEquals(5,list.size());//size is down to five
	}
	
	@Test
	public void ShouldBeIndepenedentOfOtherTests() {
		assertEquals(6,list.size());
	}
}
