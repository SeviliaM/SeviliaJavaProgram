package com.java.class14;

import java.sql.SQLOutput;
import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {


        String str1 = "Hello World";
        String str2 ="hello World";
        String str3 = "Hello World! Welcome to DevX!";

        //1.We want to check equality of two Strings

        System.out.println(str1.equals(str2));

     //2.Check equality of two String ignoring case
        System.out.println(str1.equalsIgnoreCase(str2));

        //3. Check one String that contains String 3
        //Contains will only check one string contains another string considering case sensitive.

        System.out.println(str1.contains(str3));
        System.out.println(str3.contains(str1));
        System.out.println(str3.toUpperCase().contains(str1.toUpperCase()));
//If we want one string contains another string ignoring case than we have to change both strings
// in the same cSE AND THEN CHECK CONTAINS only content of both string
        String str3LowerCase = str3.toLowerCase();
        String str2LowerCase = str2.toLowerCase();

        System.out.println(str3LowerCase.contains(str2LowerCase));

        //4.Changing the case of String
        System.out.println(str3.toUpperCase());
        System.out.println(str3.toLowerCase());

        //5. find index of character
        System.out.println(str1.indexOf('W'));

        //6. find a character at index
        System.out.println(str1.charAt(0));

        //7. last index of character
        System.out.println(str3.lastIndexOf('W'));

        //8. length of the String
        System.out.println(str1.length());
        System.out.println(str3.length());

        //8. Length of string
        str1="           ";
        str3 = "";
        System.out.println(str1.isEmpty());    //false
        System.out.println(str3.isEmpty());  //true
        System.out.println(str1.isBlank());    //false
        System.out.println(str3.isEmpty());  //true


        //9. Replace & ReplaceAll
        str1 ="Welcome User";
        str3 = "devX";
        System.out.println(str1.replace("User",str3));
        System.out.println(str1.replace("User","Person"));
        System.out.println(str1.replaceAll("[A-Z]", ""));
        str1 = "PRICE IN INR 200 INR 300 INR 500";
        System.out.println(str1.replaceAll("[a-zA-Z]", ""));

        //10.Format
        str1 = "Welcome %s";
        System.out.println(String.format(str1,"Chiraq"));
        str1 = "Welcome %s,Welcome to %s";
        System.out.println(String.format(str1,"Chiraq","Ebay" ));

        //11. Substring
        str1 = "Welcome to java class. Today is fun day";
        System.out.println(str1.substring(7));



        //12. Split
        str1 = "I am travelling to Utah";
        String [] words = str1.split(" ");
        System.out.println(words.length);

        for(int i=0; i<=4; i++){
            System.out.println(words[i]);
        }

        System.out.println(words[0] +" " + words[1] +" " + words[2] +" " + words[3] +" " + words[4]);

        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);
        System.out.println(words[4]);

        for(int i=0; i<words.length;i++){
            System.out.println(words[i]);
        }


        // ReplaceAll


    }
}
