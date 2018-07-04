package com.greenfoxacademy.todo.connectionwithmysql.controllers;


import com.greenfoxacademy.todo.connectionwithmysql.repositories.TodoRepInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepInt TodoRep;

  @RequestMapping(value = {"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todoList", TodoRep.findAll());
    return "todoslist";
  }
}


