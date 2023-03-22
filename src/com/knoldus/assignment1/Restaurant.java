package com.knoldus.assignment1;

import java.util.Scanner;

public class Restaurant
{
    //function displaying menu list
    public void displayMenuList()
    {
        for(Dish dish: Dish.Menu.MENU_LIST)
        {
            System.out.println(dish);
        }
    }
    //function to find a dish
    public void findDish(Integer inputId)
    {
        for (Dish dish: Dish.Menu.MENU_LIST)
        {
            if(inputId == dish.dishId)
            {
                System.out.println(dish);
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner takeInput = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();
        Integer choice;
        System.out.println("Enter your choice:\nPress 1 to display Dishes.\nPress 2 to search Dish.");
        choice = takeInput.nextInt();
        switch (choice)
        {
            case 1:
                restaurant.displayMenuList();
                break;
            case 2:
                System.out.println("Enter the dish id to search!");
                Integer dishId = takeInput.nextInt();
                restaurant.findDish(dishId);
        }
    }
}
