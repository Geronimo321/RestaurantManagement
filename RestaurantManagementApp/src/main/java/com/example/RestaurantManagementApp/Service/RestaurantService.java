package com.example.RestaurantManagementApp.Service;

import com.example.RestaurantManagementApp.Entity.Restaurant;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RestaurantService {

    List<Restaurant> getAllRestaurants();

    ResponseEntity<Restaurant> getRestaurantByID(int restaurantID);

    Restaurant addRestaurant(Restaurant restaurant);

    ResponseEntity<Restaurant> updateRestaurant(int id, Restaurant restaurant);

    String deleteRestaurant(int ID);

}
