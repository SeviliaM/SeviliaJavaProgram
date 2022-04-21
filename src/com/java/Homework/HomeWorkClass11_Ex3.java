package com.java.Homework;

import java.util.Scanner;

public class HomeWorkClass11_Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("enter number");

        int a = 1;
        while (a <= num) {
            if (a % 3 != 0 && a % 7 == 0) {
                System.out.println(a);
            }
            a++;
        }

    }

}