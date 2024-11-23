package com.functions;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {
sum(10);
sum(15,"prakash");
args(1,2,5,6,78,555);
args("hello","prakash","suman");
sum(10,50,"prakash","chinna");
        sum(10,50,"prakash","chinna",31);
    }
        public static void sum(int a){
            System.out.println("sum which takes one integer");
        }
        public static void sum(int a, String name){
            System.out.println("sum which takes one integer and a string");
        }
        public static void sum(int a, int b, String name, String phoneNumber){
            System.out.println("sum which takes two integers and two stings");
        }
    public static void sum(int a, int b, String name, String phoneNumber, int age){
        System.out.println("sum which takes two integers and two stings");
    }

        public static void args(int ...v){
            System.out.println(Arrays.toString(v));
        }
    public static void args(String ...v){
        System.out.println(Arrays.toString(v));
    }
    }
