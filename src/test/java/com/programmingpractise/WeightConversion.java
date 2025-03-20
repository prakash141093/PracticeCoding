package com.programmingpractise;

import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight;
        double newWeight;
        int choice;
        System.out.println("This is about weight conversion");
        System.out.println("1. To convert lbs to kgs");
        System.out.println("2. To convert kgs to lbs");
        System.out.println("choose an option");
        choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("you have choose an option to convert lbs to kgs");
            System.out.println("Enter weight in lbs");
            weight = sc.nextDouble();
            newWeight = weight * 0.4539;
            System.out.printf("After converting lbs to kgs the new weight is %.2f\n", newWeight);
        } else if (choice == 2) {
            System.out.println("you have choose an option to convert kgs to lbs");
            System.out.println("enter the weight in kgs");
            weight = sc.nextDouble();
            newWeight = weight * 2.2046;
            System.out.printf("After converting kgs to lbs the new weight is %.2f\n", newWeight);

        } else {
            System.out.println("You have not entered a valid option");

        }
        sc.close();

    }

}
