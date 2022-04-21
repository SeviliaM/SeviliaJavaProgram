package com.java.Homework;

import java.util.Scanner;

public class HomeWork08_02 {
    public static void main(String[] args) {
        System.out.println("write any mark");
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();

        if (mark >= 90 && mark <= 100) {
            System.out.println("grade A");
        } else if (mark >= 80 && mark <= 89) {
            System.out.println("Grade B");
        } else if (mark >= 70 && mark <= 79){
            System.out.println("Grade C");
        } else if (mark >= 60 && mark <= 69){
            System.out.println("Grade D");
        } else if (mark >= 50 && mark <= 59) {
            System.out.println("Grade E");
        } else if (mark >= 0 && mark <= 49){
            System.out.println("Fail");
        } else {
            System.out.println("Invalid mark");
        }
    }
}
