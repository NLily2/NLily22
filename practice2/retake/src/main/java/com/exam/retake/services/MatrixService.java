package com.exam.retake.services;

import com.exam.retake.models.Matrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface MatrixService {

  Matrix findMatrixById(int id);
  void saveMatrix(Matrix matrix);
  void removeMatrix(int id);
  boolean isNumber(Matrix matrix);
  String getResultOfUsableMatrix(Matrix matrix);
}
