package com.calculator.calculator.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NumberInput {

  @Id
  @GeneratedValue (strategy = GenerationType.AUTO)
  private int id;
  private String numOne;
  private String numTwo;
  private String numThree;
  private String numFour;

  public NumberInput(String numOne, String numTwo, String numThree, String numFour) {
    this.numOne = numOne;
    this.numTwo = numTwo;
    this.numThree = numThree;
    this.numFour = numFour;
  }

  public NumberInput() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNumOne() {
    return numOne;
  }

  public void setNumOne(String numOne) {
    this.numOne = numOne;
  }

  public String getNumTwo() {
    return numTwo;
  }

  public void setNumTwo(String numTwo) {
    this.numTwo = numTwo;
  }

  public String getNumThree() {
    return numThree;
  }

  public void setNumThree(String numThree) {
    this.numThree = numThree;
  }

  public String getNumFour() {
    return numFour;
  }

  public void setNumFour(String numFour) {
    this.numFour = numFour;
  }
}
