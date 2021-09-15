package exercise15;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob Cordonero
 */

import java.util.Scanner;

public class Solution15 {
    /*
        Exercise 15 - Password Validation
        Example Output
    What is the password? 12345
    I don't know you.
        Or
    What is the password? abc$123
    Welcome!
        Constraints
    ~Use an if/else statement for this problem.
    ~Make sure the program is case-sensitive.
     */

    public static void main(String[] args) {
        //prompt the user for a username and password
        //compare the password given by user to known password
        //if password == knowPassword
        //  display "Welcome!"
        //else
        //  display "I don't know you."
        final String knownPassword = "abc$123";
        Scanner input = new Scanner(System.in);
        System.out.print("What is the username? ");
        input.nextLine();
        System.out.print("What is the password? ");
        String password = input.nextLine();
        if (password.compareTo(knownPassword)==0)
            System.out.println("Welcome!");
        else
            System.out.println("I don't know you.");
    }
}
