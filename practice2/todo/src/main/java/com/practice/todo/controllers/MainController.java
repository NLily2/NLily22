package com.practice.todo.controllers;

import com.practice.todo.models.Todo;
import com.practice.todo.repositories.TodoRepo;
import com.practice.todo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @Autowired
  TodoService todoService;

  @GetMapping("/")
  public String listTodos(Model model, @RequestParam(value = "isActive", required = false) Boolean isActive){
    if(isActive == null) {
      model.addAttribute("todos", todoService.getTodos());
      return "index";
    }
    model.addAttribute("todos", todoService.findByDone(!isActive));
    return "index";
  }

  @GetMapping("/add")
  public String addTodo(Model model){
    model.addAttribute("newTodo", new Todo());
    return "addTodo";
  }

  @PostMapping("/add")
  public String addTodo(@ModelAttribute Todo newTodo){
    todoService.saveTodo(newTodo);
    return "redirect:/";
  }

  @GetMapping("/{id}/delete")
  public String deleteTodo(@PathVariable("id") long id){
    todoService.deleteTodoById(id);
    return "redirect:/";
  }

  @GetMapping("/{id}/edit")
  public String editTodo(@PathVariable("id") long id, Model model){
    model.addAttribute("id", todoService.findById(id));
    model.addAttribute("todo", todoService.findById(id));
    return "editTodo";
  }

  @PostMapping("/{id}/edit")
  public String editTodo(@ModelAttribute Todo todo){
    todoService.saveTodo(todo);
    return "redirect:/";
  }
}
