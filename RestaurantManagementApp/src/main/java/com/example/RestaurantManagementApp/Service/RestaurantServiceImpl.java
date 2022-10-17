package com.example.RestaurantManagementApp.Service;


import com.example.RestaurantManagementApp.Dao.RestaurantDao;
import com.example.RestaurantManagementApp.Entity.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    RestaurantDao restaurantDao;

    @Override
    public List<Restaurant> getAllRestaurants() {
        return this.restaurantDao.findAll();
    }

    @Override
    public ResponseEntity<Restaurant> getRestaurantByID(int restaurantID) {
        Restaurant restaurant = restaurantDao.findById(restaurantID).orElseThrow(()-> new RuntimeException("Restaurant doesn't exist with id: "+ restaurantID));
        return ResponseEntity.ok(restaurant);
    }

    @Override
    public Restaurant addRestaurant(Restaurant restaurant) {
        return this.restaurantDao.save(restaurant);
    }

    @Override
    public ResponseEntity<Restaurant> updateRestaurant(int id, Restaurant restaurant) {
        Restaurant updateRestaurant = restaurantDao.findById(id).orElseThrow(()-> new RuntimeException("Restaurant doesn't exist with id: "+ id));
        updateRestaurant.setId(restaurant.getId());
        updateRestaurant.setName(restaurant.getName());

        return ResponseEntity.ok(updateRestaurant);
    }

    @Override
    public String deleteRestaurant(int restaurantID) {
        this.restaurantDao.deleteById(restaurantID);
        return "Restaurant with ID: " + restaurantID+ " successfully deleted.";
    }
}
