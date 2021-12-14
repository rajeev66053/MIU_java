package com.simplilearn.stub;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class ToDoBusinessImplStubTest {
	
	@Test
	public void usingAStub() {
		ToDoService todoservice= new ToDoServiceStub();
		ToDoBusinessImpl todoBusinessImpl= new ToDoBusinessImpl(todoservice);
		List<String> todos= todoBusinessImpl.retrieveTodosRelatedToSpring("Ranga");
		assertEquals(2, todos.size());
	}

}
