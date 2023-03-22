package com.knoldus.assignment2.question1;
import java.util.Scanner;
import java.util.function.Supplier;

public class MaximumOfTwoIntegers
{
    public static void main(String[] args)
    {
        Scanner takeInput = new Scanner(System.in);
        System.out.println("Enter the first integer");
        int number1 = takeInput.nextInt();
        System.out.println("Enter the second integer");
        int number2 = takeInput.nextInt();
        //using supplier interface to return maximum of two integers
        Supplier<Integer> returnMaximum = () -> {
          return Math.max(number1, number2);
        };

        System.out.println("The maximum of two integers is: "+returnMaximum.get());
    }
}
