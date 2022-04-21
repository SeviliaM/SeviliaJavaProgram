package com.java.Homework;

import java.util.Scanner;

public class HomeWorkClass05_2 {
    public static void main(String[] args) {

        System.out.println("enter year");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 4 == 0) {
            System.out.println("leap year");
        } else {

           if(num % 400 == 0){

                System.out.println("leap year");
            }else{
                System.out.println("not leap year");

            }
        }
    }
}