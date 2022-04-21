package com.java.Homework;

import java.util.Scanner;

public class Less20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
       if ((a+1) % 20 == 0  || (a + 2)% 20  == 0){
           System.out.println("True");
        }else{
           System.out.println("False");
       }
    }
}
