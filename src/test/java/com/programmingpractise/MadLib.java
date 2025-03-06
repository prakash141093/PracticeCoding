package com.programmingpractise;

import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
        String adjective1;
        String noun;
        String adjective2;
        String verb;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the adjective");
         adjective1=sc.nextLine();
        System.out.println("Enter the noun");
        noun=sc.nextLine();
        System.out.println("Enter the adjective2");
        adjective2=sc.nextLine();
        System.out.println("Enter the verb");
        verb=sc.nextLine();
        System.out.println("its a very good "+adjective1+ " and how about the game " +noun);
        System.out.println("considering the "+verb+ " were is the actual smile of "+noun);
        System.out.println("I am in awe of the smile of "+noun+ " and " + adjective2);
    }
}
