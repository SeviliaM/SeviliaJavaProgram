package com.java.class06;

import java.util.Scanner;

public class BloodDonationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your age");
        int age = sc.nextInt();

        System.out.println("enter your weight");
        int weight = sc.nextInt();
        if (age >= 18) {
            if (weight >= 50) {
                System.out.println("you're eligible");
            } else {
                System.out.println("you're under weight");
            }
        } else {
            if (weight >= 50) {
                System.out.println("you're too young");
            } else {
                System.out.println("you're totally not eligible");
            }
        }
    }
}
