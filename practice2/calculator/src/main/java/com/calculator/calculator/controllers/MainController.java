package com.calculator.calculator.controllers;

//import com.calculator.calculator.models.NumberInput;
import com.calculator.calculator.models.NumberInput;
import com.calculator.calculator.services.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  @Autowired
  NumberService numberService;

  @GetMapping("/")
  public String renderMainpage(Model model){
    model.addAttribute("newNumber", new NumberInput());
    model.addAttribute("numbers", numberService.findAllNumber());
    return "index";
  }

  @PostMapping("/addnumber")
  public String addNewNumber(@ModelAttribute NumberInput number, Model model){
    numberService.addNumber(number);
    model.addAttribute("newNumber", new NumberInput());
    model.addAttribute("messageSent", numberService.sendMessage(number));
    model.addAttribute("numbers", numberService.findAllNumber());
    return "index";
  }

  @GetMapping("/{id}/delete")
  public String deleteNumber(@PathVariable("id") int id){
    numberService.deleteNumber(id);
    return "redirect:/";
  }

  @PostMapping("/sum")
  public String sumInputs(Model model, @ModelAttribute(value = "sum") int id){
    model.addAttribute("selectedNumberById", numberService.findById(id));
    model.addAttribute("sumOfNumbers", numberService.sumInputs(id));
    return "sum";
  }

  @PostMapping("/square")
  public String squareInputs(Model model, @ModelAttribute(value = "square") int id){
    //String idCheck = "";
    //model.addAttribute("messageSent", numberService.sendMessage(idCheck + id));
    model.addAttribute("selectedNumberById", numberService.findById(id));
    model.addAttribute("squaredNumbers", numberService.squareInputs(id));

    //numberService.isNumberId(id);
    return "square";
  }
}
