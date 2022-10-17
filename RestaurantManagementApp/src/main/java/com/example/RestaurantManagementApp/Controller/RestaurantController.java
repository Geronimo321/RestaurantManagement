package com.example.RestaurantManagementApp.Controller;

import com.example.RestaurantManagementApp.Entity.Restaurant;
import com.example.RestaurantManagementApp.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;

    @GetMapping("/restaurants")
    public List<Restaurant> getAllRestaurants(){
        return this.restaurantService.getAllRestaurants();
    }

    @GetMapping("/restaurants/{restaurantID}")
    public ResponseEntity<Restaurant> getRestaurantByID(@PathVariable String restaurantID){
        return this.restaurantService.getRestaurantByID(Integer.parseInt(restaurantID));
    }

    @PostMapping("/restaurants")
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant){
        return this.restaurantService.addRestaurant(restaurant);
    }

    @PutMapping("/restaurants/{restaurantID}")
    public ResponseEntity<Restaurant> updateRestaurant(@PathVariable int resaurantID, @RequestBody Restaurant restaurant){
        return this.restaurantService.updateRestaurant(resaurantID, restaurant);
    }

    @DeleteMapping("/restaurant/{restaurantID}")
    public String deleteRestaurantByID(@PathVariable String restaurantID){
        return this.restaurantService.deleteRestaurant(Integer.parseInt(restaurantID));
    }

}
