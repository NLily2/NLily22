package com.greenfoxacademy.springstart;

import org.springframework.stereotype.Service;

@Service
class RedColor implements MyColor{

  @Override
  public void printColor() {
    System.out.println("It is red in color...");
  }
}

 class BlueColor implements MyColor {

  @Override
  public void printColor() {
    System.out.println("It is blue in color...");
  }
}

 class PurpleColor implements MyColor{

  @Override
  public void printColor() {
    System.out.println("It is purple in color...");
  }
}