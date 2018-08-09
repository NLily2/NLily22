package com.exam.retake.repositories;

import com.exam.retake.models.Matrix;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatrixRepository extends CrudRepository<Matrix, Integer> {

  Matrix findById(int id);

}
