package com.aula.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aula.exception.TaskException;
import com.aula.model.Task;
import com.aula.repo.TaskRepo;

@Service
public class TaskServiceImpl implements TaskService{

	@Autowired
	TaskRepo taskRepo;
	
	
	@Override
	public Task createTask(Task task) throws TaskException {
		Task tempTask = new Task();
        tempTask.setTitle(task.getTitle());
        tempTask.setDescription(task.getDescription());
        tempTask.setStatus(task.getStatus());;
        Task savedTask = taskRepo.save(tempTask);
        return savedTask;
	}

	@Override
	public Task updateTask(Integer id, String Status) throws TaskException {
		Optional<Task> existingTask =  taskRepo.findById(id);
        if (existingTask.isEmpty()){
            throw new TaskException("Task do not Exist with id: "+id);
        }else {
            Task newTask = existingTask.get();
            newTask.setStatus(Status);

            Task updatedTask = taskRepo.save(newTask);
            return updatedTask;
        }
	}

	@Override
	public List<Task> getAllTask() throws TaskException {
		List<Task> tasks = taskRepo.findAll();
        if(tasks.isEmpty()){
            throw new TaskException("There are no tasks");
        }
        return tasks;
	}

	
}
