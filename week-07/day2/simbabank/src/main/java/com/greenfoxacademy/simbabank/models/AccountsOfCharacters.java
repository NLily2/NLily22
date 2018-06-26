package com.greenfoxacademy.simbabank.models;

import java.util.ArrayList;
import java.util.List;

public class AccountsOfCharacters {

  List<Character> characterAccounts;

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
    characterAccounts.add(new Character("Zazu", "1000", "bird"));
    characterAccounts.add(new Character("Nala", "800", "lion"));
    characterAccounts.add(new Character("Zordon", "2000", "lion"));
    characterAccounts.add(new Character("Rafiki", "3000", "baboon"));
    characterAccounts.add(new Character("Mufasa", "2200", "lion"));
  }

}