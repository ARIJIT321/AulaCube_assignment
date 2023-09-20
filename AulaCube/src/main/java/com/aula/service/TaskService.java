package com.aula.service;

import java.util.List;

import com.aula.exception.TaskException;
import com.aula.model.Task;

public interface TaskService {

	public Task createTask(Task task) throws TaskException;
	
	public Task updateTask(Integer id,String Status) throws TaskException;
	
	public List<Task> getAllTask() throws TaskException;
	
}
