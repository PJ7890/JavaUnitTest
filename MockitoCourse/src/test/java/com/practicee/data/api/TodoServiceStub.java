package com.practicee.data.api;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService{
  
	public List<String> retreiveTodos(String user) {
		return Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn To Dance");
	}

	public void deleteTodo(String todo) {
		// TODO Auto-generated method stub
		
	}
}
