package com.java.class13;

import java.util.Scanner;

// create two String variables wi
//initialize two variables with constant values
// take third variable value from user using scanner class
//compare 1 and 2 == operator
//2 and 3
//compare 1 and 3 using .equals ()method
public class StringAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String table = "Furniture";
        String chair = "Furniture";
        String lamp = sc.nextLine();


        if (table == chair) {
            System.out.println("True");
        } else {
            System.out.println("False");                  // True
        }

        if (chair == lamp) {

            System.out.println("True");                 // False
        } else {
            System.out.println("False");
        }

        if (table.equals(lamp)) {
            System.out.println("True");            //True
        } else {
            System.out.println("False");
        }
    }
}