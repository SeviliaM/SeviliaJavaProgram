package com.java.class08;

import java.util.Scanner;

// take three number from users and print maximum number out of three numbers
public class MaximumOutThreeNumbers {

    public static void main(String[] args) {

        System.out.println("write three numbers");

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is greater");
        } else if (num2 > num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);


        }

    }
}
