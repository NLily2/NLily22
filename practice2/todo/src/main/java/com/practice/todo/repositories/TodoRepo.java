package com.practice.todo.repositories;

import com.practice.todo.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepo extends CrudRepository<Todo, Long> {
  List<Todo> findAll();
  Todo findById(long id);
  List<Todo> findByDone(boolean done);
}

