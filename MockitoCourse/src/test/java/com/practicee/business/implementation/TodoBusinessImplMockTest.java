package com.practicee.business.implementation;

import static org.junit.Assert.*;
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
	}


