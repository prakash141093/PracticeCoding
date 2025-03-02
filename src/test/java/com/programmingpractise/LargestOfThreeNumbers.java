package com.programmingpractise;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number");
        int num3 = sc.nextInt();
        String result = largestNumber(num1, num2, num3);
        System.out.println(result);
    }

    static String largestNumber(int num1, int num2, int num3) {
       if(num1==num2 && num2==num3){
        return "All numbers are equal";
       } else if (num1>=num2&&num1>=num3) {
           return num1+ "is the largest number";
       } else if (num2>=num1&&num2>=num3) {
           return num2+ "is the largest number";

       }else{
           return num3+ "is the largest number";
       }
    }
}
