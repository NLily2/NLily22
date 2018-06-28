package com.greenfoxacademy.foxclub.Models;

import java.util.ArrayList;
import java.util.List;

public class Fox {

  private String name;
  ArrayList<String> tricks;
  private String food;
  private String drink;
  private ArrayList<Fox>foxes;

  public Fox(String name, ArrayList<String> tricks, String food, String drink) {
    this.name = name;
    this.tricks = tricks;
    this.food = food;
    this.drink = drink;
    tricks = new ArrayList<>();
  }

  public Fox() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<String> getTricks() {
    return tricks;
  }

  public void setTricks(ArrayList<String> tricks) {
    this.tricks = tricks;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public ArrayList<Fox> getFoxes() {
    return foxes;
  }

  public void setFoxes(ArrayList<Fox> foxes) {
    this.foxes = foxes;
  }

  public void addFox(Fox fox){
    foxes.add(fox);
  }
}
