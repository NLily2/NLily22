package com.calculator.calculator.repositories;

import com.calculator.calculator.models.NumberInput;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NumberRepo extends CrudRepository<NumberInput, Integer> {

  List<NumberInput> findAll();
  NumberInput findById(int id);
  List<NumberInput> findByNumOne(String numOne);
}
