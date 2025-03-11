package com.programmingpractise;

import java.util.Scanner;

public class Hypotenus {
    public static void main(String[] args) {
        //Hypotenus c=Math.sqrt(a²+b²)
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        double a=sc.nextDouble();
        System.out.println("Enter the value of b: ");
        double b=sc.nextDouble();
        double c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("the hypotenus (side c) is "+c + "cm");
        sc.close();
    }
}
