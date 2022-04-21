package com.java.class07;

import java.util.Scanner;

public class PrintNumberOfDayInMonthUsingSwitch {
    public static void main(String[] args) {
        System.out.println("enter a moth");
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();

        switch (month){
            case "January":
            System.out.println("31days");
            break;
            case "February":
            System.out.println("28/29days");
            break;
            case "March":
            System.out.println("31days");
            break;
            case "April":
            System.out.println("30days");
            break;
            case "May":
            System.out.println("31days");
            break;
            case "June":
            System.out.println("30days");
            break;
            case "July":
            System.out.println("31days");
            break;
            case "August":
            System.out.println("31days");
            break;
            case "September":
            System.out.println("30days");
            break;
            case "October":
            System.out.println("31days");
            break;
            case "November":
            System.out.println("30days");
            break;
            case "december":
            System.out.println("31days");
            break;
            default:
            System.out.println("none");
        }


    }
}
