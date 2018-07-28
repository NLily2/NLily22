package com.macrotics.exam.Services;

import com.macrotics.exam.Models.Attractions;
import com.macrotics.exam.Models.FilteredAttraction;
import com.macrotics.exam.Repositories.RepoAttractions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttractionsServiceImpl implements AttractionsService {

  @Autowired
  RepoAttractions repoAttractions;

  @Override
  public List<Attractions> findAllAttractions() {
    return repoAttractions.findAll();
  }

  @Override
  public void saveAttraction(Attractions attraction) {
    repoAttractions.save(attraction);
  }

  @Override
  public Attractions findAttractionById(int id) {
    return repoAttractions.findById(id).get();
  }

  @Override
  public FilteredAttraction filterAttraction(String category, String city) {
    List<Attractions> filteredAttractions = filter(category, city);
    FilteredAttraction filteredAttraction = new FilteredAttraction("ok", filteredAttractions.size(), filteredAttractions);
    return filteredAttraction;
  }

  public List<Attractions> filter(String category, String city){
    if (category == null && city == null) {
      return repoAttractions.findAll();
    } else if (category != null && city == null) {
      return repoAttractions.findByCategory(category);
    } else if (category == null && city != null) {
      return repoAttractions.findByCity(city);
    }
    return repoAttractions.findAllByCityAndCategory(city, category);
  }
}
