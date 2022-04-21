package com.java.class16;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hello";

       // String Buffer uses the buffer mechanism to protect dats from being aaccess and update simultaneously,so it's thread safe
        StringBuffer sb = new StringBuffer("Hello");
        sb.reverse();
        //string builder doesn't have buffer mechanism, so it's faster than StringBuffer
        StringBuilder sBuilder = new StringBuilder("Hello");
        sBuilder.reverse();
    }
}