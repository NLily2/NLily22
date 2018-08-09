package com.practice.todo.services;

import com.practice.todo.models.Todo;
import com.practice.todo.repositories.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

  @Autowired
  TodoRepo todoRepo;

  @Override
  public List<Todo> getTodos() {
    return todoRepo.findAll();
  }

  @Override
  public void saveTodo(Todo todo) {
    todoRepo.save(todo);
  }

  @Override
  public void deleteTodoById(long id) {
    todoRepo.deleteById(id);
  }

  @Override
  public Todo findById(long id) {
    return todoRepo.findById(id);
  }

  @Override
  public List<Todo> findByDone(boolean done) {
    return todoRepo.findByDone(done);
  }
}
