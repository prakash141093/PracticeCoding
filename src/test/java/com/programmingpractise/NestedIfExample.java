package com.programmingpractise;

public class NestedIfExample {
    public static void main(String[] args) {
        boolean isStudent = true;
        boolean isSenior = true;
        double rate = 9.99;

        if (isStudent) {
            if (isSenior) {
                System.out.println("You are eligible for 10% and additional 20% discount as you are a senior student");
                rate *= 0.7;
                System.out.printf("As you are a senior student then final rate is %.2f\n", rate);

            } else {
                System.out.println("You are eligible for 10% discount as you are a student");
                rate *= 0.9;
                System.out.printf("As you are a student then final rate is %.2f\n", rate);
            }
        } else {
            if (isSenior) {
                System.out.println("You are eligible for 20% discount as you are a senior");
                rate *= 0.8;
                System.out.printf("As you are a senior then final rate is %.2f\n", rate);
            } else {
                System.out.println("you are not a student not a senior so no discount is applicable");
                rate *= 1;
                System.out.printf("As you are a senior then final rate is %.2f\n", rate);

            }

        }
    }
}
