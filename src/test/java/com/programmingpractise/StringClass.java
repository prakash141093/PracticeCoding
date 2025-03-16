package com.programmingpractise;

public class StringClass {
    public static void main(String[] args) {
        String name="Jaya Prakash";
        int length=name.length();
        //boolean isequal=name.equals("Jaya Prakash");
        //System.out.println(isequal);
        System.out.println(length);
        char letter=name.charAt(5);
        System.out.println(letter);
        int index=name.indexOf("P");
        System.out.println(index);
        int lastIndex=name.lastIndexOf('a');
        System.out.println(lastIndex);
        name=name.trim();
        System.out.println(name);
        if(name.equals("Jaya Prakash")){
            System.out.println("name is matching");
        }else{
            System.out.println("name is not matching");
        }
        String lowerCase=name.toLowerCase();
        System.out.println(lowerCase);
        String upperCase=name.toUpperCase();
        System.out.println(upperCase);
        if(name.isEmpty()){
            System.out.println("name is empty");
        }else{
            System.out.println("name is not empty");
        }
        String newString=name.replace('a','o');
        System.out.println(newString);
        if(name.equalsIgnoreCase("jaya prakash")){
            System.out.println("name is matching with the assigned string value of name");
        }else{
            System.out.println("name is not matching");
        }
        if(name.contains("Jaya Prakash")){
            System.out.println("valid");
        }else{
            System.out.println("not valid");
        }
        if(name.equals("Jaya Prakash")){
            System.out.println("equals");
        }else{
            System.out.println("not equals");
        }
    }
}
