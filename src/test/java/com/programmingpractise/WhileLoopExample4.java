package com.programmingpractise;

import java.util.Scanner;

public class WhileLoopExample4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (number < 1 || number > 10) {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
        }
        System.out.println("You have picked: " + number);

    }
}
