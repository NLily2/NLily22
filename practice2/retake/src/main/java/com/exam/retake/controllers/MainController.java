package com.exam.retake.controllers;

import com.exam.retake.ResourceNotFoundException;
import com.exam.retake.models.Matrix;
import com.exam.retake.services.MatrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

@Autowired
  MatrixService matrixService;

  @GetMapping("/")
  public String renderMainpage(Model model){
    model.addAttribute("matrix", new Matrix());
    return "index";
  }

  @GetMapping("/matrix")
  public String showMatrixById(@RequestParam(value = "id") int id, Model model){
    Matrix currentMatrix = matrixService.findMatrixById(id);
    if(currentMatrix == null){
      throw new ResourceNotFoundException();
    }
    model.addAttribute("matrix", currentMatrix);
    return "index";
  }

  @GetMapping("/matrix/{id}")
  public String showMatrixByIdPath(@PathVariable(value = "id") int id, Model model) {
    Matrix currentMatrix = matrixService.findMatrixById(id);
    if(currentMatrix == null){
      throw new ResourceNotFoundException();
    }
    model.addAttribute("matrix", currentMatrix);
    return "index";
  }

  @PostMapping("/matrix/{id}")
  public String saveMatrix(@PathVariable(value = "id") int id, @ModelAttribute Matrix matrix){
    matrixService.getResultOfUsableMatrix(matrix);
    matrixService.saveMatrix(matrix);
    return "redirect:/";
  }

  @PostMapping("remove/{id}")
  public String removeMatrix(@PathVariable(value = "id") int id){
    matrixService.removeMatrix(id);
    return "redirect:/";
  }
}
