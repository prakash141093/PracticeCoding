package com.programmingpractise;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {

        Random random = new Random();
        int age;
        age=random.nextInt(1)+70;
        System.out.println("The age is " +age);
    }
}
