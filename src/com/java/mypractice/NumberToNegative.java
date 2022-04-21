package com.java.mypractice;

import java.util.Scanner;

public class NumberToNegative {
    public static void main(String[] args) {
        //Write a program to keep asking for a number until you enter a negative number.
        //At the end, print the quantity of digits entered and the sum of all entered numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and I'll calculate the sum, until you enter negative number");
        int num = sc.nextInt();
        int count = 0;
        int sum = 0;

        while (num >= 0) {
            System.out.println("number is not negative. Please enter another number:");
            sum =sum + num;
            count++;
            num = sc.nextInt();

        }System.out.println("Sum of entered numbers: " + sum);

        System.out.println("Number of digits is: " + count);

        }
}

