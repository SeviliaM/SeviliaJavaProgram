package com.java.class16;

import java.util.Scanner;

public class StringPracticeWordCount {
    public static void main(String[] args) {
        System.out.println("Enter any Statement: ");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String [] words = str.split(" ");
        System.out.println(words.length);
    }
}
