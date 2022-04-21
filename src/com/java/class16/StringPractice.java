package com.java.class16;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        System.out.println("Enter any String: ");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int a = str.length() - 1; a >= 0; a--) {
            System.out.println(str.charAt(a));
        }
    }
}