package com.knoldus.assignment2.question1;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Supplier;

public class MaximumOfTwoIntegers
{
    public static void main(String[] args)
    {
        Integer number1 = 0;
        Integer number2 = 0;
        Scanner takeInput = new Scanner(System.in);
        try
        {
            System.out.println("Enter the first integer");
            number1 = takeInput.nextInt();
            System.out.println("Enter the second integer");
            number2 = takeInput.nextInt();
        }
        catch (InputMismatchException e)
        {
            System.out.println("Enter the correct input type!");
        }
        //using supplier interface to return maximum of two integers
        //variables in lambda should be final
        Integer integer1 = number1;
        Integer integer2 = number2;
        Supplier<Integer> returnMaximum = () -> {
          return Math.max(integer1, integer2);
        };

        System.out.println("The maximum of two integers is: "+returnMaximum.get());
    }
}
