package com.simplilearn.stub;

import java.util.ArrayList;
import java.util.List;

public class ToDoBusinessImpl {
	
	private ToDoService todoservice;
	
	
	public ToDoBusinessImpl(ToDoService todoservice) {
		this.todoservice=todoservice;
	}
	
	public List<String> retrieveTodosRelatedToSpring(String user){
		List<String> filteredTodos= new ArrayList<String>();
		List<String> allTodos= todoservice.retrieveTodos(user);
		
		for(String todo: allTodos) {
			if(todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
		}
		
		return filteredTodos;
	}

}
