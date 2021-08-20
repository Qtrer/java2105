package com.example.demo0714.vo;

import java.util.List;

public class Menu {
    private Integer id;
    private String name;
    private List<Dish> dishes;

    public Menu() {
    }

    public Menu(Integer id, String name, List<Dish> dishes) {
        this.id = id;
        this.name = name;
        this.dishes = dishes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dishes=" + dishes +
                '}';
    }
}
