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

  public Attractions(String attrName, String city, int price, float longitude, float lattitude, String category, int duration, float recommendedAge) {
    this.attrName = attrName;
    this.city = city;
    this.price = price;
    this.longitude = longitude;
    this.lattitude = lattitude;
    this.category = category;
    this.duration = duration;
    this.recommendedAge = recommendedAge;
  }

  public String getAttrName() {
    return attrName;
  }

  public void setAttrName(String attrName) {
    attrName = attrName;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    city = city;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    price = price;
  }

  public float getLongitude() {
    return longitude;
  }

  public void setLongitude(float longitude) {
    longitude = longitude;
  }

  public float getLattitude() {
    return lattitude;
  }

  public void setLattitude(float lattitude) {
    lattitude = lattitude;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    category = category;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    duration = duration;
  }

  public float getRecommendedAge() {
    return recommendedAge;
  }

  public void setRecommendedAge(float recommendedAge) {
    recommendedAge = recommendedAge;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}
