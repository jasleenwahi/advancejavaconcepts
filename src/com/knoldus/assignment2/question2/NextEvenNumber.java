package com.knoldus.assignment2.question2;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Supplier;

public class NextEvenNumber
{
    public static void main(String[] args)
    {
        Scanner takeInput = new Scanner(System.in);
        Long number = 0L;
        try
        {
            System.out.println("Enter an integer: ");
            number = takeInput.nextLong();
        }
        catch (InputMismatchException e)
        {
            System.out.println("Enter the valid input!");
        }
        //using supplier interface to find next integers
        Long finalNumber = number;
        Supplier<Long> returnNextEvenNumber = () ->{
            Long result = (finalNumber % 2 == 0) ? finalNumber + 2 : finalNumber + 1;
            return result;
        };
        System.out.println("The next even long is: "+returnNextEvenNumber.get());
    }
}
