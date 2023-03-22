package com.knoldus.assignment2.question2;

import java.util.Scanner;
import java.util.function.Supplier;

public class NextEvenNumber
{
    public static void main(String[] args)
    {
        Scanner takeInput = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        Long number=takeInput.nextLong();
        //using supplier interface to find next integers
        Supplier<Long> returnNextEvenNumber = () ->{
            Long result = (number % 2 == 0) ? number + 2 : number + 1;
            return result;
        };
        System.out.println("The next even long is: "+returnNextEvenNumber.get());
    }
}
