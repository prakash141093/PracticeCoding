package com.functions;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name ="prakash";
        System.out.println(a);
        System.out.println(name);
        {
           // int a = 45; //we cannot initialize the variable as it was initialized already but we can change the value of variable
            a=46; //reassign the origin ref variable to some other value.
            System.out.println(a);
             name="ram";
            int c=99; //values initialized in the block will remain in the block itself
            System.out.println(c); //I can use here because it belongs to this block
        }
        System.out.println(name);
        //System.out.println(c);//I cannot use here because this doesn't belong to the main method.
        System.out.println(a);
    }
}
