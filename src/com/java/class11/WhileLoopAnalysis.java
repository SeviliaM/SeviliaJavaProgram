package com.java.class11;

import java.util.Scanner;
// 10 1 9 2 8 3 7 4 6 5
public class WhileLoopAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int i = 1;  // initialization

        while (i <=limit/2){// initialization
            System.out.println(11 - i);
            System.out.println(i);//condition
            i++;  //increment/decrement
        }
    }
}
