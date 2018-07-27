package com.macrotics.exam.Controllers;

import com.macrotics.exam.Models.Attractions;
import com.macrotics.exam.Services.AttractionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  @Autowired
  AttractionsService attractionsService;

  @GetMapping("/")
  public String renderIndex(Model model){
    model.addAttribute("attractions", attractionsService.findAllAttractions());
    model.addAttribute("attraction", new Attractions());
    return "index";
  }

  @PostMapping("/add")
  public String addNewAttraction(@ModelAttribute Attractions newAttraction){
    attractionsService.saveAttraction(newAttraction);
    return "redirect:/";
  }
}
