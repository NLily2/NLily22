package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  static Greeting greeting = new Greeting(1, "Hello, World!");

  @RequestMapping("/greeting")
  @ResponseBody
  public static String greeting(){
    return "id: " + greeting.getId() + " content: " + greeting.getContent();
  }
}
