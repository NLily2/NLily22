package com.calculator.calculator.controllers;

import com.calculator.calculator.models.FilteredNumber;
import com.calculator.calculator.models.NumberInput;
import com.calculator.calculator.services.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NumberRestController {

  @Autowired
  NumberService numberService;

  @GetMapping("/allnumbers")
  public List<NumberInput> getAllNumbers() {
    return numberService.findAllNumber();
  }

  @GetMapping("filterednumbers")
  public FilteredNumber filteredNumber(@RequestParam(value = "numone", required = false) String numOne){
    return numberService.filterNumber(numOne);
  }
}
