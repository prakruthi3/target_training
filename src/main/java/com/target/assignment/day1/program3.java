package com.target.assignment.day1;
import java.util.*;
public class program3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three values: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        sortThreeNumbers(a, b, c);
    }

    public static void sortThreeNumbers(int a, int b, int c) {
        if((a<=b)&&(a<=c))
        {
            if(b<=c)
                System.out.println("The sorted numbers are:"+"\t" +a +"\t" +b +"\t" +c);
            else
                System.out.println("The sorted numbers are:"+"\t" +a +"\t" +c +"\t" +b);
        }
        else if((b<=a)&&(b<=c))
        {
            if(a<=c)
                System.out.println("The sorted numbers are:"+"\t" +b +"\t" +a +"\t" +c);
            else
                System.out.println("The sorted numbers are:"+"\t" +b +"\t" +c +"\t" +a);
        }
        else if(a<=b)
            System.out.println("The sorted numbers are:"+"\t"+c+"\t" +a +"\t" +b);
        else
            System.out.println("The sorted numbers are:"+"\t"+c +"\t" +b +"\t" +a);

    }
}
