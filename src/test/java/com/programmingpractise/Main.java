package com.programmingpractise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //primitive data types

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name=sc.nextLine();
        System.out.println("Hello "+name+"Welcome to the madness of programming");
        System.out.println("What is your age");
        int age=sc.nextInt();
        if(age>=30&&age<=50){
            System.out.println("Now or never");
        }
        if(age>=10&&age<30){
            System.out.println("Great start!");
        }
        if(age<10){
            System.out.println("little warrior up for the challenges");
        }
        if(age>50){
            System.out.println("passionate to learn");
        }
        System.out.println("What is your gpa: ");
        double gpa=sc.nextDouble();
        System.out.println("Are you ready to answer few questions before jumping into other topics");
        boolean isReady=sc.nextBoolean();
        if(isReady){
            System.out.println("Wow!");
        }else{
            System.out.println("urghhhhh");
        }
        System.out.println("How excited are you? (true/false)");
        boolean isStudent=sc.nextBoolean();
        if(isStudent){
            System.out.println("As you are excited to the madness lets work hard and enjoy the process");
        }else{
            System.out.println("It's going to be hard for you. Think again!");
        }


    }
}
