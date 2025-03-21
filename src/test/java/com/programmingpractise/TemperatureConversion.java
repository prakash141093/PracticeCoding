package com.programmingpractise;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp;
        double newTemp;
        String unit;

        System.out.println("Enter the temperature");
        temp = sc.nextDouble();
        System.out.println(temp);
        System.out.println("Enter the temperature in celsius or fahrenheit (c/f): ");
        unit = sc.next().toUpperCase();
        System.out.println(unit);
        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;
        System.out.println(newTemp + "°" + unit);
        System.out.printf("%.1f°%s", newTemp, unit);
        sc.close();

    }
}
