package com.functions;

public class MethodWithStringParameters {
    public static void main(String[] args) {
        String personalizedName=greeting("chinna","prakash");
        System.out.println(personalizedName);

    }
    public static String greeting(String firstName, String secondName ){
        String fullName="My name is "+firstName+secondName;
        return fullName;
    }
}
