package com.functions;

public class Shadowing {
   static int x=10;//this variable will shadowed with the local variable (x in the main method - line 8)
    public static void main(String[] args) {
        System.out.println(x);
        int x; //declaration
        //System.out.println(x); scope will begin when the value is initialized
        x=45; //the class variable in line 4 was shadowed by this

        System.out.println(x);
        fun();
    }
    public static void fun(){
        int x=12;
        System.out.println(x);
    }

}
