package com.macrotics.exam.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attractions {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String attrName;
  private String city;
  private String category;
  private int price;
  private float longitude;
  private float lattitude;
  private float recommendedAge;
  private int duration;

  public Attractions() {
  }

  public Attractions(String attrName) {
    this.attrName = attrName;
  }

  public Attractions(String attrName, String city, String category, int price, float longitude, float lattitude, float recommendedAge, int duration) {
    this.attrName = attrName;
    this.city = city;
    this.category = category;
    this.price = price;
    this.longitude = longitude;
    this.lattitude = lattitude;
    this.recommendedAge = recommendedAge;
    this.duration = duration;
  }

  public String getAttrName() {
    return attrName;
  }

  public void setAttrName(String attrName) {
    this.attrName = attrName;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public float getLongitude() {
    return longitude;
  }

  public void setLongitude(float longitude) {
    this.longitude = longitude;
  }

  public float getLattitude() {
    return lattitude;
  }

  public void setLattitude(float lattitude) {
    this.lattitude = lattitude;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public float getRecommendedAge() {
    return recommendedAge;
  }

  public void setRecommendedAge(float recommendedAge) {
    this.recommendedAge = recommendedAge;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}
