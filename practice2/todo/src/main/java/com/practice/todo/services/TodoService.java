package com.practice.todo.services;

import com.practice.todo.models.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {

  List<Todo> getTodos();
  void saveTodo(Todo todo);
  void deleteTodoById(long id);
  Todo findById (long id);
  List<Todo> findByDone(boolean done);

}
