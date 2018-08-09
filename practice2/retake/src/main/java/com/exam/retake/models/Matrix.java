package com.exam.retake.models;

import javax.persistence.*;

@Entity
@Table(name = "matrices")
public class Matrix {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String m1;
  private String m2;
  private String m3;
  private String m4;
  private String m5;
  private String m6;
  private String m7;
  private String m8;
  private String m9;
  private String usableMatrix;

  public Matrix() {
  }

  public Matrix(String m1, String m2, String m3, String m4, String m5, String m6, String m7, String m8, String m9, String usableMatrix) {
    this.m1 = m1;
    this.m2 = m2;
    this.m3 = m3;
    this.m4 = m4;
    this.m5 = m5;
    this.m6 = m6;
    this.m7 = m7;
    this.m8 = m8;
    this.m9 = m9;
    this.usableMatrix = usableMatrix;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getM1() {
    return m1;
  }

  public void setM1(String m1) {
    this.m1 = m1;
  }

  public String getM2() {
    return m2;
  }

  public void setM2(String m2) {
    this.m2 = m2;
  }

  public String getM3() {
    return m3;
  }

  public void setM3(String m3) {
    this.m3 = m3;
  }

  public String getM4() {
    return m4;
  }

  public void setM4(String m4) {
    this.m4 = m4;
  }

  public String getM5() {
    return m5;
  }

  public void setM5(String m5) {
    this.m5 = m5;
  }

  public String getM6() {
    return m6;
  }

  public void setM6(String m6) {
    this.m6 = m6;
  }

  public String getM7() {
    return m7;
  }

  public void setM7(String m7) {
    this.m7 = m7;
  }

  public String getM8() {
    return m8;
  }

  public void setM8(String m8) {
    this.m8 = m8;
  }

  public String getM9() {
    return m9;
  }

  public void setM9(String m9) {
    this.m9 = m9;
  }
}
