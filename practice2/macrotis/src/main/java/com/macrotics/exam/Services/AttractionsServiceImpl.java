package com.macrotics.exam.Services;

import com.macrotics.exam.Models.Attractions;
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
}
