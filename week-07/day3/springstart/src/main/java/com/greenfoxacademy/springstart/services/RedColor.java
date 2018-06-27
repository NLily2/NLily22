package com.greenfoxacademy.springstart.services;

import com.greenfoxacademy.springstart.interfaces.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

class RedColor implements MyColor {

  @Override
  public void printColor() {
    System.out.println("It is red in color...");
  }
}

@Service
 class BlueColor implements MyColor {
  @Autowired
  Printer printer;

  @Override
  public void printColor() {
    printer.log("It is blue in color...");
  }
}

 class PurpleColor implements MyColor{

  @Override
  public void printColor() {
    System.out.println("It is purple in color...");
  }
}