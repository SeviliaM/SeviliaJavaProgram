package com.java.class17;
// write a program to check  add/even from 1 to 15
public class MethodExampe2 {
    static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


//    public static void main(String[] args) {
//        for (int i = 1; i <= 15; i++) {
//            if (i % 2 == 0) {
//                System.out.println("even");
//            } else {
//                System.out.println("odd");
//            }
//        }

    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if (isEven(i) == true) {
                System.out.println("even");
            } else {
                System.out.println("odd");


            }


        }

    }
}