package com.practicee.business.implementation;

import java.util.ArrayList;
import java.util.List;

import com.practicee.data.api.TodoService;

public class TodoBusinessImpl {

	//interface
	private TodoService todoService;

	//constructor using fields
	public TodoBusinessImpl(TodoService todoService) {
		this.todoService = todoService;
	}
	
	// this below is the method we want to write a test for future
	public List<String> retreiveTodosRelatedToSpring(String user) {
		List<String> filteredTodos = new ArrayList<String>();
		List<String> todos = todoService.retreiveTodos(user);
		
		for(String todo : todos ) {
			if(todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
		}
		
		return filteredTodos;
	}
	
	public void deleteTodosNotRelatedToSpring(String user) {
		List<String> todos = todoService.retreiveTodos(user);
		for(String todo : todos) {
			if(!todos.contains("Spring")) {
				todoService.deleteTodos(todo);
			}
		}
	}
}
