package com.calculator.calculator.services;

import com.calculator.calculator.models.FilteredNumber;
import com.calculator.calculator.models.NumberInput;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NumberService {

  List<NumberInput> findAllNumber();
  void addNumber(NumberInput number);
  boolean isNumber(NumberInput number);
  String sendMessage(NumberInput number);
  //String sendMessage(String id);
  Integer sumInputs(int id);
  NumberInput findById(int id);
  List<Integer> squareInputs(int id);
  //boolean isNumberId(String id);
  void deleteNumber(int id);
  FilteredNumber filterNumber(String numOne);

}
