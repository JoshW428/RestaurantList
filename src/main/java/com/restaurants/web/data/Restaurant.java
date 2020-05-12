package com.restaurants.web.data;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Restaurant {

  private int ranking;
  private String name;

  private Cuisine cuisine;

  public Restaurant() {}

  public Restaurant(int ranking, String name, Cuisine cuisine) {
    this.ranking = ranking;
    this.name = name;
    this.cuisine = cuisine;
  }

  public int getRanking() {
    return ranking;
  }

  public void setRanking(int ranking) {
    this.ranking = ranking;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Cuisine getCuisine() {
    return cuisine;
  }

  public void setCuisine(Cuisine cuisine) {
    this.cuisine = cuisine;
  }

}

