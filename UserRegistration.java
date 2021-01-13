package com.uccases;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Welcome to UserRegistration");
        int options = 1;
        while (options < 4) {

            switch (options) {
                case 1:
                    UserRegistrationMethods.firstName();
                    break;
                case 2:
                    UserRegistrationMethods.lastName();
                    break;
                case 3:
                    UserRegistrationMethods.email();
                    break;
            }
            options++;
        }
    }
}

class UserRegistrationMethods {
    static Scanner input = new Scanner(System.in);
    static String text;
    static String firstName = "^[A-Z][a-zA-Z]{2,}$";
    static String lastName = "^[A-Z][a-zA-Z]{2,}$";
    static String email = "^[0-9a-zA-Z]+([.\\-_+][0-9a-zA-Z]+)*@[a-z0-9A-Z]+.[a-z]{2,4}([.][a-zA-Z]{2,})*$";

    public static void firstName() {
        while (true) {
            System.out.println("Enter FirstName : ");
            text = input.nextLine();
            Pattern pattern = Pattern.compile(firstName);
            Matcher matcher = pattern.matcher(text);
            if (matcher.matches()) {
                System.out.println(">>>>Valid pattern>>>>");
                break;
            } else {
                System.out.println("*******Invalid firstName Pattern,Try Again******");
                System.out.println(" ");
            }
        }

    }

    public static void lastName() {
        while (true) {
            System.out.println("Enter lastName : ");
            text = input.nextLine();
            Pattern pattern = Pattern.compile(lastName);
            Matcher matcher = pattern.matcher(text);
            if (matcher.matches()) {
                System.out.println("Valid pattern");
                break;
            } else {
                System.out.println("Invalid lastName Pattern,Try Again");
                System.out.println(" ");
            }
        }

    }

    public static void email() {
        while (true) {
            System.out.println("Enter Email : ");
            text = input.nextLine();
            Pattern pattern = Pattern.compile(email);
            Matcher matcher = pattern.matcher(text);
            if (matcher.matches()) {
                System.out.println(">>>>Valid pattern>>>>");
                break;
            } else
                System.out.println("******Invalid email Pattern , Try Again*******");
            System.out.println(" ");
        }
    }
}