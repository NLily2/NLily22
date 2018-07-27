package com.macrotics.exam.Services;

import com.macrotics.exam.Models.Attractions;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AttractionsService {

  List<Attractions> findAllAttractions();

  void saveAttraction(Attractions attraction);
}
