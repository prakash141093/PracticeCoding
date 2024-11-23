package com.functions;

import java.util.Scanner;

public class MethodWithUserDefinedStringParameters {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the firstName: ");
        String fName=input.next();
        System.out.print("Enter the lastName: ");
        String lName=input.next();
       String completeName= personalizedName(fName,lName);
        System.out.println(completeName);
    }
    public static String personalizedName(String firstName,String lastName){
        String fullName="My full name is "+firstName+lastName;
        return fullName;
    }
}
