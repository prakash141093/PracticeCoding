package com.programmingpractise;

import java.util.Scanner;

public class WhileLoopExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response = "";
        while (!response.equals("Q")) {

            System.out.println("You are playing a game");
            System.out.println("press Q to quit the game");
            response = scanner.next().toUpperCase();
        }
        System.out.println("You have quit the game");
    }
}
