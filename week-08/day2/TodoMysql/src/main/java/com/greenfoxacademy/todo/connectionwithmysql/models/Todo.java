package com.greenfoxacademy.todoslist.models;

import javax.persistence.*;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long ID;
  private String title;
  private boolean urgent;
  private boolean done;

  public Todo(String title) {
    this.title = title;
    this.urgent = false;
    this.done = false;
  }

  public Todo() {
  }

  public void setID(Long ID) {
    this.ID = ID;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  public long getID() {
    return ID;
  }

  public String getTitle() {
    return title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public boolean isDone() {
    return done;
  }
}
