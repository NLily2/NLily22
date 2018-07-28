package com.macrotics.exam.Services;

import com.macrotics.exam.Models.Attractions;
import com.macrotics.exam.Models.FilteredAttraction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AttractionsService {

  List<Attractions> findAllAttractions();

  void saveAttraction(Attractions attraction);

  Attractions findAttractionById(int id);

  FilteredAttraction filterAttraction(String category, String city);

}
