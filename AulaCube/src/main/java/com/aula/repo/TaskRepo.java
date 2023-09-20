package com.aula.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aula.model.Task;

@Repository
public interface TaskRepo extends JpaRepository<Task, Integer>{

}
