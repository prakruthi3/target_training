package com.target.assignment.day1;

import java.util.Scanner;

public class program10
{
    public static String reverseByWords(String sentence)
    {
        String[] words = sentence.split("\\s");

        String outputString = "";

        for (int i = words.length-1; i >= 0; i--)
        {
            outputString = outputString + words[i] + " ";
        }

        return outputString;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Input String :");
        String inputString = sc.nextLine();
        String outputString = reverseByWords(inputString);
        System.out.println("Output String : "+outputString);

        sc.close();
    }}
