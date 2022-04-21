package com.java.class08;

import java.util.Scanner;
public class Hw_PrintLoginStatus{
        public static void main(String[] args) {

               System.out.println("enter username and password");
               Scanner sc = new Scanner(System.in);
               String username = sc.nextLine(), password = sc.nextLine();
               String expUsername = "Sevilia", expPassword = "12345";


               if (username.equals(expUsername)  && password.equals(expPassword)){
                   System.out.println("Login Successful");
               } else if (username.equals(expUsername) && !password.equals(expPassword)) {
                   System.out.println("Invalid password");
               }else if(!username.equals(expUsername) && password.equals(expPassword))

    {
        System.out.println("Invalid username");
    }else{
           System.out.println("Login Unsuccessful");

        }
    }
            }