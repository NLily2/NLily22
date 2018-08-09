package com.practice.quiz.controllers;

import com.practice.quiz.models.Quiz;
import com.practice.quiz.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @Autowired
  QuizService quizService;

  @GetMapping("/")
  public String showQuiz(Model model) {
    model.addAttribute("quizes", quizService.getAllQuiz());
    return "index";
  }

  @GetMapping("/add")
  public String addQuiz(Model model) {
    model.addAttribute("newQuiz", new Quiz());
    return "addQuiz";
  }

  @PostMapping("/add")
  public String saveQuiz(@ModelAttribute Quiz quiz) {
    quizService.saveQuiz(quiz);
    return "redirect:/";
  }

  @GetMapping("/{id}/edit")
  public String editTodo(@PathVariable("id") long id, Model model) {
    model.addAttribute("id", quizService.findById(id));
    model.addAttribute("quiz", quizService.findById(id));
    return "editQuiz";
  }

  @PostMapping("/{id}/edit")
  public String editTodo(@ModelAttribute Quiz quiz) {
    quizService.saveQuiz(quiz);
    return "redirect:/";
  }

  @GetMapping("/random")
  public String getRandomQuiz(Model model) {
    model.addAttribute("quizeQuestion", quizService.getRandomQuiz());
    return "randomQuestion";
  }

  @PostMapping("/random/{id}")
  public String getAnswerForRandomQuiz(@PathVariable(value="id") long id, @ModelAttribute Quiz quiz, Model model) {
    //model.addAttribute("messageResult", quizService.sendMessage(id));
    //model.addAttribute("messageResult", quizService.sendMessage(id, quiz));
    model.addAttribute("quizeQuestion", quizService.findById(id));
    model.addAttribute("messageResult", quizService.sendMessage(id, quiz));
    return "randomQuestion";
  }
}
