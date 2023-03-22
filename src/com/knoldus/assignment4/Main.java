package com.knoldus.assignment4;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> userInputStringList = new ArrayList<>();
        Scanner takeInput = new Scanner(System.in);
        System.out.println("Enter a string");
        String userString = takeInput.nextLine();
        String userStringArray[] =  userString.split(" ");
        for(Integer i=0; i<userStringArray.length; i++)
        {
            userInputStringList.add(userStringArray[i]);
        }
        //taking a string buffer to store distinct strings
        StringBuffer outputStringBuffer = new StringBuffer();
        UniqueSortedStrings uniqueSortedStrings= inputStream->{
            //using streams to sort and remove duplicates
            ArrayList<String> sortedDistinctList = (ArrayList<String>) inputStream.stream().distinct().sorted().collect(Collectors.toList());
            for(String index: sortedDistinctList){
                outputStringBuffer.append(index);
                outputStringBuffer.append(" ");
            }
            //converting string buffer into string
            String result = outputStringBuffer.toString();
            return result;
        };
        //printing result string
        System.out.println(uniqueSortedStrings.returnUniqueSortedStrings(userInputStringList));
    }
}