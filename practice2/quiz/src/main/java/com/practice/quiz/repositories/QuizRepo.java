package com.practice.quiz.repositories;

import com.practice.quiz.models.Quiz;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizRepo extends CrudRepository<Quiz, Long> {
  List<Quiz> findAll();
  Quiz findById(long id);
}
