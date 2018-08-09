package com.practice.quiz.controllers;

import com.practice.quiz.models.Quiz;
import com.practice.quiz.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerRest {

  @Autowired
  QuizService quizService;

  @GetMapping("/allquizes")
  public List<Quiz> getAllQuizes(){
    return quizService.getAllQuiz();
  }

  @RequestMapping(value="/outdated/{id}", method=RequestMethod.DELETE)
  public String deleteQuiz(@PathVariable("id") long id){
    quizService.deleteQuizById(id);
    return "deleted: " + id;
  }

  @GetMapping("/error")
  public Quiz showError(){
    return quizService.findById(1);
  } //200-as

  @GetMapping("/errorcustumed")
  public ResponseEntity<Quiz> showCustomedError(){
    //return ResponseEntity.status(HttpStatus.NOT_FOUND).body(quizService.findById(1));
     return ResponseEntity.status(404).body(quizService.findById(1));

    //return quizService.findById(1);
  }
}
