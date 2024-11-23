package com.functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
    fun(15,54,54,25,45,36,8,7,45,69,44);
    multiple(10,20,"hello","prakash","chinna","good");
    }

    public static void multiple(int a, int b, String...v){
        System.out.println(Arrays.toString(v));
    }
    public static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
