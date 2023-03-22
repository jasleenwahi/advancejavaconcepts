package com.knoldus.assignment1;

import java.time.LocalTime;
import java.util.ArrayList;

public class Dish
{
    Integer dishId;
    String dishName;
    LocalTime creationTime;

    Dish(Integer dishId, String dishName, LocalTime creationTime)
    {
        this.dishId = dishId;
        this.dishName = dishName;
        this.creationTime = creationTime;
    }

    @Override
    public String toString()
    {
        return "Dish{" + "dishId=" + dishId + ", dishName='" + dishName + '\'' + ", creationTime=" + creationTime + '}';
    }
    //using inner class to create menu class
    class Menu
    {
        static ArrayList<Dish> MENU_LIST = new ArrayList<>();
        static
        {
            MENU_LIST.add(new Dish(1, "Shahi Paneer", LocalTime.now()));
            MENU_LIST.add(new Dish(2, "Dal Makhni", LocalTime.now()));
            MENU_LIST.add(new Dish(3, "Butter Chicken", LocalTime.now()));
        }
    }
}
