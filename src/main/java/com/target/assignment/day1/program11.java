package com.target.assignment.day1;
import java.util.Scanner;

public class program11 {

    public static void main(String[] args) {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a number(max upto 9 digits)");
        try {
            number = scanner.nextInt();
            if (number == 0) {
                System.out.print("Number in words: Zero");
            } else {
                System.out.print("Number in words: " + inWords(number));
            }
        } catch (Exception e) {
            System.out.println("Please enter a valid number");
        }
        // close the reader
        scanner.close();
    }

    private static String inWords(int num) {
        // variable to hold string representation of number
        String words = "";
        String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen" };
        String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety" };

        if (num == 0) {
            return "zero";
        }
        // add minus before conversion if the number is less than 0
        if (num < 0) {
            // convert the number to a string
            String numberStr = "" + num;
            // remove minus before the number
            numberStr = numberStr.substring(1);
            // add minus before the number and convert the rest of number
            return "minus " + inWords(Integer.parseInt(numberStr));
        }
        // check if number is divisible by 1 million
        if ((num / 1000000) > 0) {
            words += inWords(num / 1000000) + " million ";
            num %= 1000000;
        }
        // check if number is divisible by 1 thousand
        if ((num / 1000) > 0) {
            words += inWords(num / 1000) + " thousand ";
            num %= 1000;
        }
        // check if number is divisible by 1 hundred
        if ((num / 100) > 0) {
            words += inWords(num / 100) + " hundred ";
            num %= 100;
        }

        if (num > 0) {
            // check if number is within teens
            if (num < 20) {
                // fetch the appropriate value from unit array
                words += unitsArray[num];
            } else {
                // fetch the appropriate value from tens array
                words += tensArray[num / 10];
                if ((num % 10) > 0) {
                    words += "-" + unitsArray[num % 10];
                }
            }
        }
        return words;
    }
}