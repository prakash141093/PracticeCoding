package com.functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sumOfTwoNumbers();
    }

    static void sumOfTwoNumbers() {
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println("The sum of two number is " + sum);
    }
}
