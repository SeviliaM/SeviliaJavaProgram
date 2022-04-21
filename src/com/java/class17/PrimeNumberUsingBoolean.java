package com.java.class17;

public class PrimeNumberUsingBoolean {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 2; i <= 50; i++) {
            if (50 % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime number");
        }
    }
}
