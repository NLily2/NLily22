package com.calculator.calculator.models;

import java.util.List;

public class FilteredNumber {

  private String result;
  private int count;
  private List<NumberInput> numbers;

  public FilteredNumber() {
  }

  public FilteredNumber(String result, int count, List<NumberInput> numbers) {
    this.result = result;
    this.count = count;
    this.numbers = numbers;
  }

  public FilteredNumber(List<NumberInput> numbers) {
    if (numbers == null || numbers.size() == 0) {
      this.result = "Not ok";
      this.count = 0;
      this.numbers = numbers;
    } else {
      this.result = "Ok";
      this.count = numbers.size();
      this.numbers = numbers;
    }
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public List<NumberInput> getNumbers() {
    return numbers;
  }

  public void setNumbers(List<NumberInput> numbers) {
    this.numbers = numbers;
  }
}
