package com.practice.quiz.services;

import com.practice.quiz.models.Quiz;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuizService {

  List<Quiz> getAllQuiz();
  void saveQuiz(Quiz quiz);
  Quiz findById(long id);
  Quiz getRandomQuiz();
  boolean isRightAnswer(long id, Quiz quiz);
  String sendMessage(long id, Quiz quiz);
  void deleteQuizById(long id);
}
