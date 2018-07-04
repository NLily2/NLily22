package com.greenfoxacademy.todo.connectionwithmysql.repositories;

import com.greenfoxacademy.todo.connectionwithmysql.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepInt extends CrudRepository<Todo, Long> {

}
