package com.greenfox.todos.controllers;


import com.greenfox.todos.repositories.TodoRepInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @RequestMapping(value = {"/", "/list"})
  public String list(Model model) {
    return "firstTodo";
  }

  @Autowired
  TodoRepInt TodoRep;
}


