package com.java.Homework;

import java.util.Scanner;

public class HomeWork08_03 {

        public static void main(String[] args) {
            System.out.println("write any size in inches");
            Scanner sc = new Scanner(System.in);
            int inch = sc.nextInt();

            if (inch >= 27 && inch <= 30) {
                System.out.println("size XS");
            } else if (inch>= 31 && inch <= 34) {
                System.out.println("size S");
            } else if (inch >= 35 && inch <= 38){
                System.out.println("size L");
            } else if (inch >= 39 && inch <= 42){
                System.out.println("size XL");
            } else if (inch >= 43 && inch <= 50) {
                System.out.println("siz XXl");
            } else {
                System.out.println("Sorry, there is no available size like this");
            }
        }
    }
