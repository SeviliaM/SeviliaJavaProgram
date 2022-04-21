package com.java.Homework;

import java.util.Objects;
import java.util.Scanner;

public class HomeWork07 {
    public static void main(String[] args) {
        System.out.println();
        //company();
        // vowel();

        usernameAndPassword();
    }

    private static void company() {
        Scanner sc = new Scanner(System.in);
        String company = sc.nextLine();
        switch (company) {
            case "Gmail":
            case "Youtube":
                System.out.println("Google");
                break;
            case "Whatsapp":
                System.out.println("Facebook");
                break;
            case "Hangouts":
            case "Outlook":
            case "Skype":
                System.out.println("Microsoft");
                break;
            default:
                System.out.println("Another company");
        }
    }












    // ______________________________________
    public static void vowel() {
        Scanner sc = new Scanner(System.in);
        char vowel = sc.next().charAt(0);
        if (vowel == 'a' || vowel == 'e' || vowel == 'o' || vowel == 'u') {

            System.out.println(vowel + " is a vowel");
        } else {
            System.out.println(vowel + " is not a vowel");
        }
    }










//______________________________________________


    public static void usernameAndPassword() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your username");
        String username = sc.nextLine();

        System.out.println("enter your password");
        String password = sc.nextLine();

        if (username.equals("Summer") && password.equals("12345")) {
            System.out.println("Login successful");
        } else if (!username.equals("Summer") && !password.equals("12345")) {
            System.out.println("Login unsuccessful");
        } else if (!username.equals("Summer")) {
            System.out.println("Invalid username");
        } else {
            System.out.println("Invalid password");
        }
    }
}

