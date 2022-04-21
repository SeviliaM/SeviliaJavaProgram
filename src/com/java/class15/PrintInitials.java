package com.java.class15;

public class PrintInitials {
    public static void main(String[] args) {
        String fullName = "Sevilia S Mambediieva";
        String name []= fullName.split(" ");
        String firstName = name[0];
        String middleName = name[1];
        String lastName = name[2];
        System.out.println(firstName.charAt(0) + "." + middleName.charAt(0) + "." + lastName.charAt(0) + ".");

    }
}
