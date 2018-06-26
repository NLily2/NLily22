package com.greenfoxacademy.simbabank.models;

public class BankAccount {

  String name;
  String balance;
  String animalType;

  public BankAccount(String name, String balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }

  public BankAccount() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }
}

/*    <tr>
        <td class = "text"><span class = "name" th:text="${character1.name}"></span></td>
        <td class = "text"><span class = "currency" th:text="${character1.balance}"></span></td>
        <td class = "text"><span class = "type" th:text="${character1.animalType}"></span></td>
    </tr>
    <tr>
        <td class = "text"><span class = "name" th:text="${character2.name}"></span></td>
        <td class = "text"><span class = "currency" th:text="${character2.balance}"></span></td>
        <td class = "text"><span class = "type" th:text="${character2.animalType}"></span></td>
    </tr>
    <tr>
        <td class = "text"><span class = "name" th:text="${character3.name}"></span></td>
        <td class = "text"><span class = "currency" th:text="${character3.balance}"></span></td>
        <td class = "text"><span class = "type" th:text="${character3.animalType}"></span></td>
    </tr>
    <tr>
        <td class = "text"><span class = "name" th:text="${character4.name}"></span></td>
        <td class = "text"><span class = "currency" th:text="${character4.balance}"></span></td>
        <td class = "text"><span class = "type" th:text="${character4.animalType}"></span></td>
    </tr>
    <tr>
        <td class = "text"><span class = "name" th:text="${character5.name}"></span></td>
        <td class = "text"><span class = "currency" th:text="${character5.balance}"></span></td>
        <td class = "text"><span class = "type" th:text="${character5.animalType}"></span></td>
    </tr> */