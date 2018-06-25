package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRESTController {

  static Greeting greeting = new Greeting(1, "Hello, ");

  @RequestMapping(value = "/greeting")
  @ResponseBody
  public String greeting(@RequestParam("content") String content, @RequestParam("id") long id){
    return "id: " + id + " content: " + greeting.getContent() + content + "!";
  }
}
