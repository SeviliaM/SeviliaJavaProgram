package com.java.class13;

import java.util.Locale;

//take 1 string and 2 int variables
//print addition of two numbers  and concatination with String
public class StringConcatinationAssignment {
    public static void main(String[] args) {
        String str1 = "Pen";
                int c = 20;
                int m = 40;                //60Pen

        System.out.println(c + m + "Pen");
        System.out.println(c + m + str1);
        System.out.println(str1 + (c + m));
        System.out.println(str1.toLowerCase());

    }
}
