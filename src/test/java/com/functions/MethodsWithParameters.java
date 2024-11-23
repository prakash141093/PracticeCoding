package com.functions;

public class MethodsWithParameters {
    public static void main(String[] args) {
int c=sum(20,30);
        System.out.println("sum of two number: "+c);
    }

    static int sum(int a, int b) {
        int c = a + b;
        return c;
    }
}
