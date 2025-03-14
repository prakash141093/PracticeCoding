package com.programmingpractise;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find whether it is prime or not");
        int num = sc.nextInt();
        String result = prime(num);
        System.out.println(result);
    }

    static String prime(int num) {
        //numbers less than or equal to 1 is not a prime
        if (num <= 2) {
            return num + "is not a prime number";
        }
        if (num == 2) {
            return num + "is a prime number";
        }
        if (num % 2 == 0) {
            return num + "is not a prime number";
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return num + "is not a prime number";
            }

        }
        return num + "is a prime number";

    }
}
