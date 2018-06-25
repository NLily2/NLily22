package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

  static Greeting greeting = new Greeting(1, "Hello, ");
  static AtomicLong atomicLong = new AtomicLong(1);

  @RequestMapping(value = "/greeting")
  @ResponseBody
  public String greeting(@RequestParam(value = "content", defaultValue = "World") String content){
    return "id: " + atomicLong.incrementAndGet() + " content: " + greeting.getContent() + content + "!";
  }
}
