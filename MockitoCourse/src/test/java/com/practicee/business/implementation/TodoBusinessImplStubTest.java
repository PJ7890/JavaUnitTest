package com.practicee.business.implementation;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.practicee.data.api.TodoService;
import com.practicee.data.api.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void testRetreiveTodosRelatedToSpring_usingAStub() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		List<String> filteredTodos = todoBusinessImpl.retreiveTodosRelatedToSpring("Dummy");
		assertEquals(2,filteredTodos.size());
	}

}
