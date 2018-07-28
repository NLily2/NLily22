package com.macrotics.exam.Controllers;

import com.macrotics.exam.Models.FilteredAttraction;
import com.macrotics.exam.Services.AttractionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerRest {

  @Autowired
  AttractionsService attractionsService;

  @GetMapping("/attractions")
  public FilteredAttraction filterAttractions(@RequestParam(value= "category", required = false) String category,
                                              @RequestParam(value = "city", required = false) String city){
    return attractionsService.filterAttraction(category, city) ;
  }


}
