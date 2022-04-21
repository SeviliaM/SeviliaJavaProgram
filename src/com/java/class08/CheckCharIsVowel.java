package com.java.class08;

import java.util.Scanner;

public class CheckCharIsVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char vowel = sc.next().charAt(0);
        if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u' ) {

            System.out.println(" is a vowel");
        } else {
            System.out.println(" is not a vowel");
        }
    }
}
