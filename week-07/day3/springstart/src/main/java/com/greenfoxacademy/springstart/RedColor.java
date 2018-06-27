package com.greenfoxacademy.springstart;

import org.springframework.stereotype.Service;

class RedColor implements MyColor{

  @Override
  public void printColor() {
    System.out.println("It is red in color...");
  }
}

@Service
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