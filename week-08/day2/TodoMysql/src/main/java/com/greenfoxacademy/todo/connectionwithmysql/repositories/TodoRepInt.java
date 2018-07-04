package com.greenfoxacademy.todoslist.repositories;

import com.greenfoxacademy.todoslist.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepInt extends CrudRepository<Todo, Long> {

}
