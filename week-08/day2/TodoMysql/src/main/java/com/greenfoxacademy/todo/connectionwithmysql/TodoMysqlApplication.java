package com.greenfoxacademy.todo.connectionwithmysql;

import com.greenfoxacademy.todo.connectionwithmysql.models.Todo;
import com.greenfoxacademy.todo.connectionwithmysql.repositories.TodoRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoMysqlApplication implements CommandLineRunner {

  @Autowired
  TodoRep TodoRep;

  public static void main(String[] args) {
    SpringApplication.run(TodoMysqlApplication.class, args);
  }


  @Override
  public void run(String... args) throws Exception {
    TodoRep.save(new Todo("Start the day", false, true));
    TodoRep.save(new Todo("Finish task", false, false));
    TodoRep.save(new Todo("Finish next task", true, false));
  }
}
