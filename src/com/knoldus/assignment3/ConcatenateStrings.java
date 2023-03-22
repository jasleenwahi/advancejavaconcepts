package com.knoldus.assignment3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ConcatenateStrings
{
    public static void main(String[] args)
    {
        Scanner takeInput = new Scanner(System.in);
        //creating a string buffer to add concatenated strings
        ArrayList<String> listToConcatenate = new ArrayList<>();
        System.out.println("Taking seven string arguments from the user and storing in list");
        String userInput;
        for(Integer index=0; index<7; index++){
            userInput = takeInput.nextLine();
            listToConcatenate.add(userInput);
        }
    //concatenating and converting to uppercase
        Supplier<String> concatenateString = () ->{
            String concatenatedString = listToConcatenate.stream().map(String::toUpperCase).collect(Collectors.joining());
            return concatenatedString;
        };
        System.out.println("Concatenated string: "+concatenateString.get());

    }
}
