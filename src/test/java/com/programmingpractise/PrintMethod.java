package com.programmingpractise;

public class PrintMethod {
    public static void main(String[] args) {
        //printf method used to format output
        //%[flags][width][.precision][specifier-character]
        String name = "prakash";
        int age = 30;
        char firstName = 'P';
        double height = 60.5;
        boolean isStudied = true;
        System.out.printf("I am %s\n", name);
        System.out.printf("I am %d years old\n",age);
        System.out.printf("first letter of my name is %c\n",firstName);
        System.out.printf("i am %f tall\n",height);
        System.out.printf("Are you studying (true/false)-%b\n",isStudied);

        double number1=9.99;
        double number2=45000.345;
        double number3=60000000.456;
        double number4=-56.45;
        System.out.printf("number1 %.3f\n",number1);
        System.out.printf("number2 %.3f\n",number2);
        System.out.printf("number3 %.3f\n",number3);
        System.out.printf("number4 %.2f\n",number4);

        //flags
        //+=output a plus
        //,=comma grouping separator
        //(=negative numbers are enclosed in ()
        //space = display a minus if negative, space if positive
        System.out.printf("number1 %+.3f\n",number1);
        System.out.printf("number2 %+.3f\n",number2);
        System.out.printf("number3 %+.3f\n",number3);
        System.out.printf("number4 %+.2f\n",number4);

        double price1=9000.99;
        double price2=45000.345;
        double price3=60000000.456;
        double price4=-56.45;

        System.out.printf("price1 % .3f\n",price1);
        System.out.printf("price2 % .3f\n",price2);
        System.out.printf("price3 % .3f\n",price3);
        System.out.printf("price4 % .2f\n",price4);

        //width
        //0-zero padding
        //number-right justified padding
        //negative number - left justified padding

        int num1=1;
        int num2=23;
        int num3=234;
        int num4=4589;
        System.out.printf("%-4d\n",num1);
        System.out.printf("%-4d\n",num2);
        System.out.printf("%-4d\n",num3);
        System.out.printf("%-4d\n",num4);






    }
}