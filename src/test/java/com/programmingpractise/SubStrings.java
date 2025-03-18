package com.programmingpractise;

import java.util.Scanner;

public class SubStrings {
    public static void main(String[] args) {
        String email;
        String domain;
        String username;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the email");
        email = sc.nextLine();
        if (email.contains("@")) {
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);
            System.out.println(username);
            System.out.println(domain);
        } else {
            System.out.println("emails should always contain @");
        }

        //String email="chinnaprakash1458@gmail.com";
//        String username=email.substring(0,11);
//        System.out.println(username);
//        String domain=email.substring(11,21);
//        String username1=email.substring(0,email.indexOf("@"));
//        System.out.println(username1);
//        String domain1=email.substring(email.indexOf("@"));
//        System.out.println(domain1);

        sc.close();
    }

}
