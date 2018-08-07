package com.calculator.calculator.services;

import com.calculator.calculator.models.FilteredNumber;
import com.calculator.calculator.models.NumberInput;
import com.calculator.calculator.repositories.NumberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NumberServiceImpl implements NumberService {

  @Autowired
  NumberRepo numberRepo;

  @Override
  public List<NumberInput> findAllNumber() {
    return numberRepo.findAll();
  }

  @Override
  public void addNumber(NumberInput number) {
    if (isNumber(number) == true)
      numberRepo.save(number);
  }

  @Override
  public boolean isNumber(NumberInput number) {
    try {
      Integer.parseInt(number.getNumOne());
      Integer.parseInt(number.getNumTwo());
      Integer.parseInt(number.getNumThree());
      Integer.parseInt(number.getNumFour());
    } catch (NumberFormatException ex) {
      return false;
    }
    return true;
  }

  @Override
  public String sendMessage(NumberInput number) {
    if (isNumber(number) == true) {
      return "Your numbers are saved.";
    }
    return "Please enter numbers.";
  }

  /*@Override
  public String sendMessage(String id) {
    if (isNumberId(id) == true) {
      return "Your numbers are saved.";
    }
    return "Please enter numbers.";
  } */

  @Override
  public Integer sumInputs(int id) {
    NumberInput number = numberRepo.findById(id);
    return Integer.parseInt(number.getNumOne()) + Integer.parseInt(number.getNumTwo())
            + Integer.parseInt(number.getNumThree()) + Integer.parseInt(number.getNumFour());
  }

  @Override
  public NumberInput findById(int id) {
    return numberRepo.findById(id);
  } 

  @Override
  public List<Integer> squareInputs(int id) {
    List<Integer> squaredNumbers = new ArrayList<>();
    NumberInput number = numberRepo.findById(id);
     squaredNumbers.add(Integer.parseInt(number.getNumOne()) * Integer.parseInt(number.getNumOne()));
     squaredNumbers.add(Integer.parseInt(number.getNumTwo()) * Integer.parseInt(number.getNumTwo()));
     squaredNumbers.add(Integer.parseInt(number.getNumThree()) * Integer.parseInt(number.getNumThree()));
     squaredNumbers.add(Integer.parseInt(number.getNumFour()) * Integer.parseInt(number.getNumFour()));
  return squaredNumbers;
  }

  @Override
  public void deleteNumber(int id) {
    numberRepo.deleteById(id);
  }

  @Override
  public FilteredNumber filterNumber(String numOne) {
    List<NumberInput> filteredNumbers = filter(numOne);
    //FilteredNumber filteredNumber = new FilteredNumber(filteredNumbers);
    //filteredNumbers = numberRepo.findByNumOne(numOne);
    FilteredNumber filteredNumber = new FilteredNumber(filteredNumbers);
    return filteredNumber;
  }

  public List<NumberInput> filter(String numOne){
    if(numOne == null){
      return numberRepo.findAll();
    }
    return numberRepo.findByNumOne(numOne);
  }

 /*@Override
  public boolean isNumberId(String id) {
    try {
      Integer.parseInt(id);
    } catch (NumberFormatException ex) {
      return false;
    }
    return true;
  } */
}
