package com.example.RestaurantManagementApp.Entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dish {

    private int restaurantId;

    private int id;

    private String dishName;

    private int price;

    public Dish() {
    }

    public Dish(int restaurantId, int id, String dishName, int price) {
        this.restaurantId = restaurantId;
        this.id = id;
        this.dishName = dishName;
        this.price = price;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
