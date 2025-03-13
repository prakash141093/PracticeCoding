package com.programmingpractise;

import java.util.Scanner;

public class MathClassExample2 {
    public static void main(String[] args) {
        // circumference =2*Math.PI*radius;
        //area=Math.PI*Math.pow(radius,2);
        // volume = (4.0/3.0)*Math.PI*Math.pow(radius,3);
        double radius;
        double circumference;
        double area;
        double volume;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius: ");
        radius= sc.nextDouble();
        circumference=2*Math.PI*radius;
        System.out.printf("The circumference is: %.1fcm\n" , circumference);
        area=Math.PI*Math.pow(radius,2);
        System.out.printf("The area is: %.1fcm²\n", area);
        volume=(4.0/3.0)*Math.PI*Math.pow(radius,3);
        System.out.printf("The volume is: %.1fcm³\n",volume);

    }
}
