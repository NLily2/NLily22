package com.greenfoxacademy.simbabank.models;

import java.util.ArrayList;
import java.util.List;

public class AccountsOfCharacters {

  public List<Character> characterAccounts;

  public AccountsOfCharacters() {
    characterAccounts = new ArrayList<>();
    addCharacters();
  }

  public List<Character> getCharacterAccounts() {
    return characterAccounts;
  }

  public void setCharacterAccounts(List<Character> characterAccounts) {
    this.characterAccounts = characterAccounts;
  }

  public void addCharacters() {
    characterAccounts.add(new Character("Zazu", 1000, "hornbill", "No", "Good"));
    characterAccounts.add(new Character("Scar", 2000, "lion", "No", "Bad"));
    characterAccounts.add(new Character("Rafiki", 3000, "baboon", "No", "Good"));
    characterAccounts.add(new Character("Mufasa", 2200, "lion", "Yes", "Good"));
  }
}

// <td th:object=""${index} th:each="indexStat.index"></td>
//<tbody th:object="${characters}">
//        <tr th:each="account : *{characterAccounts}">
//th:text="${charactersStat.index}"
