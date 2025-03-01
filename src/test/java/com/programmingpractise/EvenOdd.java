package com.programmingpractise;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        String result=evenOdd(number);
        System.out.println(result);
    }
    static String evenOdd(int x){
        if(x%2==0){
            return "The entered number is even number";
        }
        else {
            return "The entered number is an odd number";
        }
    }
}

