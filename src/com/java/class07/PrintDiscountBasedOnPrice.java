package com.java.class07;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrintDiscountBasedOnPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();

        if(price<100) {
            System.out.println("no discount");
        }else if(price<500){
            System.out.println("5%");
        }else if(price<1000){
            System.out.println("10%");
        }else if(price>1000){
            System.out.println("15%");
        }else{
            System.out.println();
        }
    }
}
