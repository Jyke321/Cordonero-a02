package exercise06;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob Cordonero
 */

import java.time.LocalDate;
import java.util.Scanner;

public class Solution06 {
    public static void main(String[] args) {
        //Gets the user's current age and stores it
        //gets the age they wish to retire by and stores it
        //displays the number of years until they can retire
        //display The current year and their retirement year
        Scanner input = new Scanner(System.in);
        String buffer;
        System.out.print("What is your current age? ");
        buffer = input.nextLine();
        int currentAge = Integer.parseInt(buffer);
        System.out.print("At what age would you like to retire? ");
        buffer = input.nextLine();
        int retireAge = Integer.parseInt(buffer);
        System.out.println("You have " + (retireAge-currentAge) + " years left until you can retire.");
        LocalDate clock = LocalDate.now();
        int currentYear = clock.getYear();
        System.out.println("It's " + currentYear + ", so you can retire in "+ (currentYear + (retireAge-currentAge)) +".");
    }
}
