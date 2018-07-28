package com.macrotics.exam.Repositories;

import com.macrotics.exam.Models.Attractions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface RepoAttractions extends CrudRepository<Attractions, Integer> {
  List<Attractions> findAll();
  List<Attractions> findAllByCityAndCategory(String city, String category);
  List<Attractions> findByCategory(String category);
  List<Attractions> findByCity(String city);
}
