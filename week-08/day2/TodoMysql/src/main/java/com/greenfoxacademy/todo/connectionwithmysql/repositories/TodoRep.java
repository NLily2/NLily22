package com.greenfoxacademy.todo.connectionwithmysql.repositories;

import com.greenfoxacademy.todo.connectionwithmysql.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRep extends CrudRepository<Todo, Long> {

}
