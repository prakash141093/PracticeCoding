package com.programmingpractise;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
       int a= sc.nextInt();
        System.out.println("Enter the second number");
       int b=sc.nextInt();
        int c=sum(a,b);
        System.out.println("the sum of two numbers is:"+c);
    }
    static int sum(int a,int b){
        return a+b;
    }
}
