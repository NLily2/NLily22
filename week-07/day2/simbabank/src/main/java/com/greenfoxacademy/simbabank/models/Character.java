package com.greenfoxacademy.simbabank.models;

import java.util.List;

public class Character {

  private String name;
  private int balance;
  private String animalType;
  private String isKing;
  private String GoodGuy;

  public Character() {
  }

  public Character(String name, int balance, String animalType, String isKing, String GoodGuy) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
    this.GoodGuy = GoodGuy;
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