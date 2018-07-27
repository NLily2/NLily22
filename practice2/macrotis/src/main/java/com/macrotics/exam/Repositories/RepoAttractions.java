package com.macrotics.exam.Repositories;

import com.macrotics.exam.Models.Attractions;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepoAttractions extends CrudRepository<Attractions, Integer> {
  List<Attractions> findAll();
}
