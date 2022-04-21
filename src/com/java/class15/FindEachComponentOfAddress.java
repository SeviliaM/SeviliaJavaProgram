package com.java.class15;

public class FindEachComponentOfAddress {
    public static void main(String[] args) {

       //solution 1
        String address = "210, Terrace Ln, Folsom, CA 95630";
        String[] words = address.split(",");
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);


        //solution 2
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}