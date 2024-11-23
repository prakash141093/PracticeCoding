package com.functions;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number :");
        int firstNumber=sc.nextInt();
        System.out.println("Enter the second number :");
        int secondNumber=sc.nextInt();
        swap(firstNumber,secondNumber);
    }
    public static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("the value of a is "+a);
        System.out.println("the value of b is "+b);

    }
}
