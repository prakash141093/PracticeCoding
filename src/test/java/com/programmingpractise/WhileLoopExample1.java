package com.programmingpractise;

import java.util.Scanner;

public class WhileLoopExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (name.isEmpty()) {
            System.out.print("Enter the username");
            name = scanner.nextLine();
        }
        System.out.println("hello " + name);

    }
}
