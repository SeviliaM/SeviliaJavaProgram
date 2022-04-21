package com.java.class06;


// write a program when user enter any number from 0 to 6
// print days of week
// 0 - Sunday, 1- Monday, 2- Tuesday,...

import java.util.Scanner;

public class LadderIfElseExample {

    public static void main(String[] args) {
// input
        Scanner sc = new Scanner(System.in);
        int dayNum = sc.nextInt();

        // output
        if(dayNum == 0){
            System.out.println("Sunday");
        }else if(dayNum == 1){
            System.out.println("Monday");
        }else if(dayNum == 2) {
            System.out.println("Tuesday");
        }else if(dayNum == 3){
            System.out.println("Wednesday");
        }else if(dayNum == 4){
            System.out.println("Thursday");
        }else if(dayNum == 5){
            System.out.println("Friday");
        }else if(dayNum == 6){
            System.out.println("Saturday");
        }else{
            System.out.println("none");
        }






    }
}
