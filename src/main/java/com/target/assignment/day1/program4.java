package com.target.assignment.day1;
import java.util.*;

public class program4 {
    static boolean checkPrime(int num)
    {
        if(num == 1) {
            return false;
        }
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int sumOfPrimes(int from, int to)
    {
        int sum = 0;
        for (int i = to; i >= from; i--) {

            boolean isPrime = checkPrime(i);
            if (isPrime) {

                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args)
    {
        System.out.println("Sum of prime numbers FROM:");
        Scanner in=new Scanner(System.in);
        int from=in.nextInt();
        System.out.println("TO");
        int to=in.nextInt();
       //int from = 4, to = 13;

        System.out.println("The sum of the prime numbers is"+"\t"+sumOfPrimes(from, to));
    }

}
