package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class usefulController {

  @Autowired
  UtilityService utilityService;

  @RequestMapping("/useful")
  public String colorBackground(Model model){
    model.addAttribute("color", utilityService.getColors());
    return "colorBackground";
  }

  @RequestMapping("/useful/colored")
  public String randomColorBackground(Model model){
    model.addAttribute("randomColor", utilityService.randomColor());
    return "randomColoredBackground";
  }
}
