package com.servme.test.todo.repository;

import com.servme.test.todo.model.respository.ToDoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface TodoRepository extends JpaRepository<ToDoEntity, Long>{
    List<ToDoEntity> findByUserId(long userId);
}
