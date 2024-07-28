package com.example.moxiesbar;

public class DishTwo {

    String name;
    String description;
    int cost;

    DishTwo (String name, String description, int cost)
    {
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return name;
    }
}

