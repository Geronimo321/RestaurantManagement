package com.example.RestaurantManagementApp.Dao;

import com.example.RestaurantManagementApp.Entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantDao extends JpaRepository<Restaurant, Integer> {

}
