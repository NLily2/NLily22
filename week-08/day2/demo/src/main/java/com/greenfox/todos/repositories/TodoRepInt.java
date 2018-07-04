package com.greenfox.todos.repositories;

import com.greenfox.todos.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepInt extends CrudRepository<Todo, Long> {

}
