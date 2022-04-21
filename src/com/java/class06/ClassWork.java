package com.java.class06;

import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int dayNum = sc.nextInt();

        if (dayNum > 0) {
            System.out.println("positive");
        } else if (dayNum < 0)
            System.out.println("negative");
        else {
            System.out.println("zero");

        }


    }

}

