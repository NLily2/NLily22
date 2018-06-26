package com.greenfoxacademy.simbabank.controllers;


import com.greenfoxacademy.simbabank.models.AccountsOfCharacters;
import com.greenfoxacademy.simbabank.models.BankAccount;
import com.greenfoxacademy.simbabank.models.Character;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShowController {

  BankAccount bankAccount = new BankAccount("Simba", "2000", "lion");

  @RequestMapping("/show")
  public String show(Model model) {
    /*model.addAttribute("name", bankAccount.getName());
    model.addAttribute("balance", bankAccount.getBalance());
    model.addAttribute("typeAnimal", bankAccount.getAnimalType()); */
    model.addAttribute("bankaccount", bankAccount);
    return "BankAccountFieldsShowing";
  }

  @RequestMapping("/text")
  public String submitText(Model model) {
    model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "submit";
  }

  @RequestMapping("/accounts")
    public String showAccounts(Model model){
    model.addAttribute("characters", new AccountsOfCharacters());
    return "CharactersAccount";
    }
}