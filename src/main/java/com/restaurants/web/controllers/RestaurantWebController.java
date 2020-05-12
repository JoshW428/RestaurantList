package com.restaurants.web.controllers;

import com.restaurants.web.data.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;


@Controller
public class RestaurantWebController {

  @RequestMapping("/")
  public String homePage() {
    return "home";
  }

  @Autowired
  private Environment environment;

  @ModelAttribute("restaurants")
  public Restaurant[] restaurants() {

    RestTemplate restTemplate = new RestTemplate();

    Restaurant[] restaurants = null;

    try {

      String serviceURL = environment.getProperty("restaurantList.service.url");

      ResponseEntity<Restaurant[]> response = restTemplate.getForEntity(
          serviceURL, Restaurant[].class
      );

      restaurants = response.getBody();

    } catch( Exception e ) {

      System.err.println(e.getMessage());

    }

    return restaurants;
  }


}