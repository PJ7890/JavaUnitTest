package com.practicee.data.api;

import java.util.List;

// one is TodoServiceStub
//second is test the TodoBusinessImpl using TodoServiceStub
public interface TodoService {
    
	public List<String> retreiveTodos(String user);
	
	public void deleteTodo(String todo);
}
