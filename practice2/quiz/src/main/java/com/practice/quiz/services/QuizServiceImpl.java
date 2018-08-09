package com.practice.quiz.services;

import com.practice.quiz.models.Quiz;
import com.practice.quiz.repositories.QuizRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class QuizServiceImpl implements QuizService {

  @Autowired
  QuizRepo quizRepo;


  @Override
  public List<Quiz> getAllQuiz() {
    return quizRepo.findAll();
  }

  @Override
  public void saveQuiz(Quiz quiz) {
    quizRepo.save(quiz);
  }

  @Override
  public Quiz findById(long id) {
    return quizRepo.findById(id);
  }

  @Override
  public Quiz getRandomQuiz() {
    List<Quiz> allQuizes = quizRepo.findAll();
    Random random = new Random();
    int i = random.nextInt(allQuizes.size());
    return allQuizes.get(i);
  }

  @Override
  public boolean isRightAnswer(long id, Quiz quiz) {
    if (quiz.getAnswer1() != null) {
      if (quiz.getAnswer1().equals(quizRepo.findById(id).getAnswer4())) {
        return true;
      }
    } else if (quiz.getAnswer2() != null) {
      if (quiz.getAnswer2().equals(quizRepo.findById(id).getAnswer4())) {
        return true;
      }
    } else if (quiz.getAnswer3() != null) {
      if (quiz.getAnswer3().equals(quizRepo.findById(id).getAnswer4())) {
        return true;
      }
    } else if (quizRepo.findById(id).getAnswer4() != null) {
      if (quiz.getAnswer4().equals(quizRepo.findById(id).getAnswer4())) {
        return true;
      }
    }
    return false;
  }

@Override
  public String sendMessage(long id, Quiz quiz) {
    if(isRightAnswer(id, quiz )){
      return "Your answer is correct.";
    }
    return "It is not the correct answer.";
  }

  @Override
  public void deleteQuizById(long id) {
    quizRepo.deleteById(id);
  }

}