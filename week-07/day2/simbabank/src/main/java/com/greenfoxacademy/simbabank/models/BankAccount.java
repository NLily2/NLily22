package com.greenfoxacademy.simbabank.models;

public class BankAccount {

  String name;
  int balance;
  String animalType;
  private String isKing;
  private String GoodGuy;

  public BankAccount(String name, int balance, String animalType, String isKing, String GoodGuy) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
    this.GoodGuy = GoodGuy;
  }

  public BankAccount() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public String getIsKing() {
    return isKing;
  }

  public void setIsKing(String isKing) {
    this.isKing = isKing;
  }

  public String getGoodGuy() {
    return GoodGuy;
  }

  public void setGoodGuy(String goodGuy) {
    GoodGuy = goodGuy;
  }
}