package com.java.mypractice;

import java.sql.SQLOutput;

public class Practice01 {
    public static void main(String args[]){
        byte a1 = 120;
        short b1 = 24006;
        int c1 = 3400, c2 = 20,c3 = 30;
        long d1 = 37474;
        float e1 = 3.400F;
        double f1 = 34.987;
        char g1 = 'f';
        boolean h1 = true;
        String str = "Room";

                System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1 + c2 - c3);
        System.out.println(e1 + f1);
        System.out.println(g1 + c1);
        System.out.println(str + e1 + c2);
        System.out.println(f1 + g1);

        System.out.println(30 / ( 4 + 6 ) * 5 - 4); //11
        System.out.println(40 - 20 * 2 + 25 * 2); // 50
        System.out.println(35 / 2 * 2 / 4 + 5); // 13

    }

}
