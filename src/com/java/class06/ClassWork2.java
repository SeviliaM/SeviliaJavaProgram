package com.java.class06;

import java.util.Scanner;

public class ClassWork2 {
    public static void main(String[] args) {
        System.out.println("enter number of the month");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        if(month == 1){
            System.out.println("31days");
        }else if(month == 2){
            System.out.println("28/29days");
        }else if(month == 3){
            System.out.println("31days");
        }else if(month == 4){
            System.out.println("30days");
        }else if(month == 5){
            System.out.println("31days");
        }else if(month == 6){
            System.out.println("30days");
        }else if(month == 7){
            System.out.println("31days");
        } else if (month == 8) {
            System.out.println("31days");
        }else if(month == 9){
            System.out.println("30days");
        }else if(month == 10){
            System.out.println("31days");
        }else if(month == 11){
            System.out.println("30days");
        }else if (month == 12){
            System.out.println("31days");
        }else{
            System.out.println("none");
        }


    }
}
