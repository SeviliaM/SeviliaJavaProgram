package com.java.class12;

public class Example1 {
    public static void main(String[] args) {
        int a = 1;

        while (a <= 50) {
            while (a <= 50) {
                if (a % 3 == 0 || a % 5 == 0) {
                    System.out.println(a);
                }
                a++;
            }
        }
    }}
