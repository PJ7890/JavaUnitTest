package com.practicee.business.implementation;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.practicee.data.api.TodoService;

public class TodoBusinessImplMockTest {
		
		@Test
		public void testRetreiveTodosrelatedToSpring_usingAMock() {
			TodoService todoServiceMock = mock(TodoService.class);
			List<String> todos = Arrays.asList("Learn Spring MVC","Learn Spring", "Learn to Dance");
			when(todoServiceMock.retreiveTodos("Dummy")).thenReturn(todos);
			TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
			List<String> filteredTodos = todoBusinessImpl.retreiveTodosRelatedToSpring("Dummy");
			assertEquals(2,filteredTodos.size());
		}
		
		@Test
		public void testRetreiveTodosRelatedToSpring_withEmptyList() {
			TodoService todoServiceMock = mock(TodoService.class);
			List<String> todos = Arrays.asList();
			when(todoServiceMock.retreiveTodos("Dummy")).thenReturn(todos);
			TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
			List<String> filteredtodos = todoBusinessImpl.retreiveTodosRelatedToSpring("Dummy");
			assertEquals(0,filteredtodos.size());
		}
		
		@Test
		public void testRetreiveTodosRelatedToSpring_usingBDD() {
			
			//Given - Setup
			TodoService todoServiceMock = mock(TodoService.class);
			List<String> todos = Arrays.asList("Learn Spring MVC","Learn Spring","Learn To Dance");
			given(todoServiceMock.retreiveTodos("Dummy")).willReturn(todos);
			TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
			
			//when - actual method call
			List<String> filteredTodos = todoBusinessImpl.retreiveTodosRelatedToSpring("Dummy");
			
			//then - asserts
			assertThat(filteredTodos.size(),is(2));
		}
	}


