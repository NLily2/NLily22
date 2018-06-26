package com.greenfoxacademy.simbabank.controllers;


import com.greenfoxacademy.simbabank.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class showController {

  BankAccount bankAccount = new BankAccount("Simba", "2000", "lion");

@RequestMapping("/show")
  public String show(Model model){
    /*model.addAttribute("name", bankAccount.getName());
    model.addAttribute("balance", bankAccount.getBalance());
    model.addAttribute("typeAnimal", bankAccount.getAnimalType()); */
    model.addAttribute("bankaccount", bankAccount);
    return "BankAccountFieldsShowing";
  }
}

// <!p th:text="'Name: ' + ${name} + ' balance: ' + ${balance} + 'Zebra type of animal: ' + ${typeAnimal}"/>