package com.example.RestaurantManagementApp.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="tbl_restaurants")
public class Restaurant {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY, orphanRemoval = false)
    private List<Dish> dishList = new ArrayList<>();

    public Restaurant() {

    }

    public Restaurant(String name) {
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
