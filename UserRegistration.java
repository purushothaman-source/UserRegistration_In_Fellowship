package com.uccases;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Welcome to UserRegistration");
        Scanner input = new Scanner(System.in);
        String firstName = "^[A-Z][a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(firstName);
        System.out.println("Enter valid FirstName : ");
        String text;
        while (true) {
            text = input.nextLine();
            Matcher matcher = pattern.matcher(text);
            if (matcher.matches()) {
                System.out.print("Valid pattern");
                break;
            } else {
                System.out.print("Invalid Pattern,Try Again");
            }
            System.out.println(" ");
        }
    }
}
