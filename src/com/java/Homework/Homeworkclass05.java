package com.java.Homework;

import java.util.Scanner;

public class Homeworkclass05 {
    public static void main(String[] args) {

        System.out.println("enter number divisible by 5");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num % 5 == 0){
            System.out.println("divisible");
        }else{
            System.out.println("not divisible");
        }

    }
}
