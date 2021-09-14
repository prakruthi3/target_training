package com.target.assignment.day1;
import java.util.*;

public class program5 {
    public static int fibonacci(int index)
    {
        if (index <= 1) {
            return index;
        }

        return fibonacci(index - 1) + fibonacci(index - 2);
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the index for Fibonacci series"+"\t");
        Scanner in=new Scanner(System.in);
        int index=in.nextInt();
       // int index = 8;

        System.out.println("The nth Fibonacci number from index"+"\t"+index+"\t"+"is " + fibonacci(index));
    }
}
