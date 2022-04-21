package com.java.class04;


public class class04 {
    public static void main(String args[]){
      int a = 10, b=20, c=30;
              String str1 = "Hello";
      String str2 = "Java";

        System.out.println(a); //10

        System.out.println(str1+str2); //HelloJava
        System.out.println(str1 + a);//Hello10
        System.out.println(a+b); //30

        System.out.println(str1+a+b); // left to right Hello1020

        System.out.println(a+b+str1); // 30Hello (left to right)
        System.out.println("a+b"); // a+b (because it's String ""
        System.out.println("a"+ b); // a20 (a is string and b is variable

        System.out.println("a"+b+c); //a2030



        System.out.println(str1+a*b); // Hello200

        // System.out.println(str1+ a-b); // error


        System.out.println(a-b+str1);
        System.out.println();

        System.out.println();

    }
}
