package com.programmingpractise;

import java.util.Scanner;

public class SubtractTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
       int c= sub(a,b);
        System.out.println("the subtraction of two numbers"+a+"and"+b+"is"+c);
    }
    static int sub(int x,int y){
        int c=x-y;
        return c;
    }
}
