package com.target.assignment.day3.programs;

import java.util.*;
import java.util.ArrayList;
import java.io.*;

public class program16 {
    public program16() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of inputs");
        int n = sc.nextInt();
        String[] input = new String[n + 1];
        System.out.println("Please start entering inputs");

        int strCount;
        for(strCount = 0; strCount < input.length; ++strCount) {
            input[strCount] = sc.nextLine();
        }

        strCount = 0;
        int intCount = 0;
        int sum = 0;
        ArrayList<Integer> integers = new ArrayList();
        ArrayList<String> strings = new ArrayList();

        for(int i = 0; i < input.length; ++i) {
            try {
                if (input[i].matches("[0-9]*")) {
                    ++intCount;
                    integers.add(Integer.parseInt(input[i]));
                    sum += Integer.parseInt(input[i]);
                } else {
                    ++strCount;
                    strings.add(input[i]);
                }
            } catch (NumberFormatException var11) {
            }
        }

        System.out.println("Number of inputs: " + n);
        System.out.println("Number of integer inputs: " + (intCount - 1));
        System.out.println("Number of non-integer inputs: " + strCount);
        System.out.println("Sum of all integer inputs: " + sum);
        System.out.println("The integer inputs are: " + integers);
        System.out.println("The non-integer inputs are: " + strings);
    }
}

