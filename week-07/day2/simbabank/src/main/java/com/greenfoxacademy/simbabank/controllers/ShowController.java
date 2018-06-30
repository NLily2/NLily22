package com.greenfoxacademy.simbabank.controllers;


import com.greenfoxacademy.simbabank.models.AccountsOfCharacters;
import com.greenfoxacademy.simbabank.models.BankAccount;
import com.greenfoxacademy.simbabank.models.Character;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ShowController {

  BankAccount bankAccount = new BankAccount("Simba", 2000, "lion", "No", "Yes");
  AccountsOfCharacters accountList = new AccountsOfCharacters();
  //static AtomicLong atomicLong = new AtomicLong(1);

  @GetMapping("")
  public String showMainPage(){
    return "index";
  }


  @GetMapping("/show")
  public String show(Model model) {
    model.addAttribute("bankaccount", bankAccount);
    return "BankAccountFieldsShowing";
  }

  @GetMapping("/text")
  public String submitText(Model model) {
    model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "submit";
  }

  @GetMapping("/accounts")
    public String showAccounts(Model model){
    model.addAttribute("characters", accountList);
    model.addAttribute("accountNew", new Character());
    return "CharactersAccount";
    }

  @PostMapping("/addAccounts")
  public String submitNewAccount(@ModelAttribute Character character){
    accountList.characterAccounts.add(character);
    return "redirect:/accounts";
  }

  @GetMapping("/accounts/codeForm")
  public String checkCodeForForm(){
    return "formCode";
  }

  @GetMapping("/accounts/codeTable")
  public String checkCodeForTable(){
    return "tableCode";
  }

  @GetMapping("/accounts/bye")
  public String bye(){
    return "bye";
  }
}
