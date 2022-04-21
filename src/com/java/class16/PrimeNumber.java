package com.java.class16;

import java.util.Scanner;

//write a program to check given number is prime or not
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Print any number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime number");
        }
    }
}