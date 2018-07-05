package com.greenfoxacademy.todo.connectionwithmysql.controllers;


import com.greenfoxacademy.todo.connectionwithmysql.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  com.greenfoxacademy.todo.connectionwithmysql.repositories.TodoRep TodoRep;

  @RequestMapping(value = {"/", "/list"})
  public String list(Model model, @RequestParam(name = "isActive", required = false) String isActive) {
    model.addAttribute("todoList", TodoRep.findAll());
    model.addAttribute("istrue", isActive);
    return "todoslist";
  }

  @GetMapping("/add")
  public String addTodo(Model model){
    model.addAttribute("newTodo", new Todo());
    return "newTodo";
  }

  @PostMapping("/add")
  public String addTodo(@ModelAttribute Todo newTodo){
    TodoRep.save(newTodo);
    return "redirect:/todo/list";
  }



}


