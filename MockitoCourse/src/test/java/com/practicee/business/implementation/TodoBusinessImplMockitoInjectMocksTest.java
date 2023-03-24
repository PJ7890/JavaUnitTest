package com.practicee.business.implementation;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.practicee.data.api.TodoService;

@RunWith(MockitoJUnitRunner.class)
public class TodoBusinessImplMockitoInjectMocksTest {
	
	@Mock
	TodoService todoServiceMock;
	
	@InjectMocks
	TodoBusinessImpl todoBusinessImpl;
	
	@Captor
	ArgumentCaptor<String> StringArgumentCaptor;

	@Test
	public void testRetreiveTodosrelatedToSpring_usingAMock() {
	
		List<String> todos = Arrays.asList("Learn Spring MVC","Learn Spring", "Learn To Dance");
		when(todoServiceMock.retreiveTodos("Dummy")).thenReturn(todos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> filteredTodos = todoBusinessImpl.retreiveTodosRelatedToSpring("Dummy");
		assertEquals(2,filteredTodos.size());
	}
	
	@Test
	public void testRetreiveTodosRelatedToSpring_withEmptyList() {
		
		List<String> todos = Arrays.asList();
		when(todoServiceMock.retreiveTodos("Dummy")).thenReturn(todos);
		
		List<String> filteredtodos = todoBusinessImpl.retreiveTodosRelatedToSpring("Dummy");
		assertEquals(0,filteredtodos.size());
	}
	
	@Test
	public void testRetreiveTodosRelatedToSpring_usingBDD() {
		
		//Given - Setup
		
		List<String> todos = Arrays.asList("Learn Spring MVC","Learn Spring","Learn To Dance");
		given(todoServiceMock.retreiveTodos("Dummy")).willReturn(todos);
		
		
		//when - actual method call
		List<String> filteredTodos = todoBusinessImpl.retreiveTodosRelatedToSpring("Dummy");
		
		//then - asserts
		assertThat(filteredTodos.size(),is(2));
	}
	
	@Test
	public void testDeleteTodosNotRelatedToSpring_usingBDD() {
		//Given
		
		List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn To Dance");
		given(todoServiceMock.retreiveTodos("Dummy")).willReturn(todos);
		
		
		//when
		todoBusinessImpl.deleteTodosNotRelatedToSpring("Dummy");
		
		//then
		verify(todoServiceMock).deleteTodo("Learn To Dance");
		
		verify(todoServiceMock, times(1)).deleteTodo("Learn To Dance");
		
		//verify(todoServiceMock,never()).deleteTodos("Learn Spring MVC");

		//verify(todoServiceMock,never()).deleteTodos("Learn Spring");

		//verifying that the methods is not called. we use never()
	}
	
	@Test
	public void testDeleteTodosNotRelatedToSpring_usingBDD_arguementCapture() {
		//Declare Arguement Captor
		
		
		//Define Argument Captor on specific method call
		//Capture the argument
		
		//Given
		

		List<String> todos = Arrays.asList("Learn Spring MVC",
				"Learn Spring", "Learn To Dance");
		given(todoServiceMock.retreiveTodos("Dummy")).willReturn(todos);

		
		//when
		todoBusinessImpl.deleteTodosNotRelatedToSpring("Dummy");
		
		//then
		then(todoServiceMock).should().deleteTodo(StringArgumentCaptor.capture());//this line getting error

		assertThat(StringArgumentCaptor.getValue(),is("Learn To Dance"));
		
	}
	
	@Test
	public void testDeleteTodosNotRelatedToSpring_usingBDD_arguementCaptureMultipleTimes() {
		
		
		//Given
		
		List<String> todos =Arrays.asList("Learn To Rock & Roll", "Learn To Spring", "Learn To Dance");
		given(todoServiceMock.retreiveTodos("Dummy")).willReturn(todos);
		
		
		//when
		todoBusinessImpl.deleteTodosNotRelatedToSpring("Dummy");
		
		//then
		then(todoServiceMock).should(times(2)).deleteTodo(StringArgumentCaptor.capture());//this line getting Error
		assertThat(StringArgumentCaptor.getAllValues().size(),is(2));
		
	}

}
