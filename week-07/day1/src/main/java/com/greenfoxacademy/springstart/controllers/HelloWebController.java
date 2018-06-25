package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static com.greenfoxacademy.springstart.controllers.HelloRESTController.atomicLong;

@Controller
public class HelloWebController {

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam(value = "content") String content){
    model.addAttribute("name", content);
    model.addAttribute("id", atomicLong.incrementAndGet());
    return "greeting";
  }
}