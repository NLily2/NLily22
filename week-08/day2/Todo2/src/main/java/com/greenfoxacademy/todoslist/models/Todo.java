package com.greenfox.todos.models;

public class Todo {

  long ID;
  String title;
  boolean urgent;
  boolean done;

  public Todo(long ID, String title, boolean urgent, boolean done) {
    this.ID = ID;
    this.title = title;
    this.urgent = urgent;
    this.done = done;
  }

  public Todo() {
    boolean urgent = false;
    boolean done = false;
  }

  public void setID(long ID) {
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
