package com.simplilearn.stub;

import java.util.Arrays;
import java.util.List;

public class ToDoServiceStub implements ToDoService {

	public List<String> retrieveTodos(String user) {
		// TODO Auto-generated method stub
		return Arrays.asList("Learn Spring MVC","Learn Spring","Learn To Dance");
	}

}
