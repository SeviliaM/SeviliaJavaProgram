package com.java.Homework;

import java.util.Scanner;

public class HomeWork08 {

    public static void main(String args[]) {
        System.out.println("write the number and check if number divisible by 5 or3");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 5 == 0) {
            System.out.println("divisible by 5");
        } else if (num % 3 == 0) {
            System.out.println("divisible by 3");
        } else {
            System.out.println("not divisible");
        }
    }
}

//    public static void main(String[] args) {
//        System.out.println("write the number and check if number divisible by 5 or3");
//
//        if (num % 5 == 0 || num % 3 == 0) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//
//    }


