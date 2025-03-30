package com.programmingpractise;

import java.util.Scanner;

public class WhileLoopExample3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int age=0;
        System.out.println("Enter the age: ");
        age=scanner.nextInt();
        while(age<0){
            System.out.println("Age cannot be negative");
            System.out.println("Enter the age: ");
            age= scanner.nextInt();
        }
        System.out.println("You are " +age+ " years old ");
        scanner.close();
    }
}
