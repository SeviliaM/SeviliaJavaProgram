package com.java.class11;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers we need to print");
        int num = sc.nextInt();

        int i = 1;
        while ( i<=num) {
            System.out.println(i*6);
            i++;

        }
    }
}