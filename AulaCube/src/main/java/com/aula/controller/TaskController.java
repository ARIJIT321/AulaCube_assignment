package com.aula.controller;

//import org.apache.http.HttpStatus;
import org.springframework.http.HttpStatus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aula.exception.TaskException;
import com.aula.model.Task;
import com.aula.service.TaskService;

@RestController
@RequestMapping("/task")
public class TaskController {

	@Autowired
	TaskService taskService;
	
	@PostMapping("/createTask")
    public ResponseEntity<Task> createTask(@RequestBody Task task) throws TaskException {
        Task createdTask = taskService.createTask(task);
        return new ResponseEntity<Task>(createdTask, HttpStatus.CREATED);
    }
	
	@PutMapping("/updateTask/{id}")
    public ResponseEntity<Task> updateTaskStatus(@PathVariable Integer id, @RequestBody String status) throws TaskException {
        Task updateTask = taskService.updateTask(id, status);
        return new ResponseEntity<Task>(updateTask, HttpStatus.ACCEPTED);
    }
	
	@GetMapping("/getAllTasks")
    public ResponseEntity<List<Task>> getAllTasks() throws TaskException{
        List<Task> tasks = taskService.getAllTask();
        return new ResponseEntity<>(tasks,HttpStatus.ACCEPTED);
    }
	 
	
}
