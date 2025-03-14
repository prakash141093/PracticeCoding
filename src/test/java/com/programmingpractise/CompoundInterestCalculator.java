package com.programmingpractise;

import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        principal=sc.nextDouble();
        System.out.println("Enter the interest rate (in %): ");
        rate=sc.nextDouble()/100;
        System.out.println("Enter the # of times compounded per year: ");
        timesCompounded=sc.nextInt();
        System.out.println("Enter the # number of years: ");
        years=sc.nextInt();

        amount=principal * Math.pow(1 + rate/timesCompounded, timesCompounded * years);
        System.out.printf("The amount after %d years is %.2f",years,amount);
        sc.close();


    }
}
