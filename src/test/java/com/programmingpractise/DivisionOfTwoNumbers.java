package com.programmingpractise;

import java.util.Scanner;

public class DivisionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        int c=div(a,b);
        System.out.println("The division of two numbers is"+c);
    }
    static int div(int x,int y){
        return x/y;
    }
}
