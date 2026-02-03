package com.archit;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      // float num = input.nextFloat();
      //  System.out.println(num);

        //type casting
//        int num=(int)(67.57f);
//        System.out.println(num);
//        // automatic type promotion in expressions
//        int a= 257;
//        byte b=(byte)(a);
//        System.out.println(b);

        int number='A';  //ASCII value and java follow unicode value
        System.out.println(number);

        //Rules for Type Promotion:
        //1.All the byte,short and Character value promoted to integer and
        // if any of the operands is long then whole operation will be long same for float,double also

        System.out.println( 3*6);
        byte b =42;
        char c= 'a';
        short s= 1024;
        int i=50000;
        float f= 5.67f;
        double d=0.1234;
        double result=(f * b)+ (i / c)+ (d-s);
        // float +  int - double= double
        System.out.println((f * b)+ (i / c)+ (d-s));
        System.out.println(result);
    }
    }
