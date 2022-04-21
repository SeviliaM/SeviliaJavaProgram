package com.java.class13;

import java.sql.SQLOutput;

public class StringConcatination {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "devX";
        int a =10;
        int b =20;
        int c = 5;
        System.out.println("Addition" + a + b); //add1020
        System.out.println("Add" +a + b * c); // Add10100
        System.out.println(a + b +"Add"); //30Add  (priority)
        System.out.println(a+b+"Add"+ a + b); //30Add1020
        System.out.println(a+ "Add" + (b - c));
        System.out.println(str1 + a+ b +str2);//Hello1020devX
        System.out.println("Add" + "10" + "20" + "str1");//Add1020str1
        System.out.println("a+b-c");//abc

    }
}
