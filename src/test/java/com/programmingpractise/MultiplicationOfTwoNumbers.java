package com.programmingpractise;

import java.util.Scanner;

public class MultiplicationOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstNumber=sc.nextInt();
        System.out.println("Enter the second number");
        int secondNumber=sc.nextInt();
        int result=multiply(firstNumber, secondNumber);
        System.out.println("The result after multiplying two numbers is"+result);
    }
    static int multiply(int x,int y){
        return x*y;
    }
}
