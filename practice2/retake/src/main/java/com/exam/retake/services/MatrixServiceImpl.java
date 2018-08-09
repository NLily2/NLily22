package com.exam.retake.services;


import com.exam.retake.models.Matrix;
import com.exam.retake.repositories.MatrixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatrixServiceImpl implements MatrixService{

  @Autowired
  MatrixRepository matrixRepository;

  @Override
  public Matrix findMatrixById(int id) {
    return matrixRepository.findById(id);
  }

  @Override
  public void saveMatrix(Matrix matrix) {
    matrixRepository.save(matrix);
  }

  @Override
  public void removeMatrix(int id) {
    matrixRepository.deleteById(id);
  }

  @Override
  public boolean isNumber(Matrix matrix) {
    try {
      Integer.parseInt(matrix.getM1());
      Integer.parseInt(matrix.getM2());
      Integer.parseInt(matrix.getM3());
      Integer.parseInt(matrix.getM4());
      Integer.parseInt(matrix.getM5());
      Integer.parseInt(matrix.getM6());
      Integer.parseInt(matrix.getM7());
      Integer.parseInt(matrix.getM8());
      Integer.parseInt(matrix.getM9());
    } catch (NumberFormatException ex) {
      return false;
    }
    return true;
  }

  @Override
  public String getResultOfUsableMatrix(Matrix matrix) {
    if(isNumber(matrix)==true){
      return "1";
    }
    return "0";
  }



}

