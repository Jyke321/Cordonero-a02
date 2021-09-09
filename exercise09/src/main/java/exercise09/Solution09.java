package exercise09;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob Cordonero
 */


import java.util.Scanner;

public class Solution09 {
    public static void main(String[] args) {
        //Prompt the user for length and width,
        //assume one gallon covers 350 square feet.
        //Display the number of gallons needed to
        //paint the ceiling as a whole number.
        Scanner input = new Scanner(System.in);
        final int GALLON = 350;
        System.out.print("What is the length of the ceiling in feet? ");
        int length = Integer.parseInt(input.nextLine());
        System.out.print("What is the width of the ceiling in feet? ");
        int width = Integer.parseInt(input.nextLine());
        int ceilingSize = length * width;
        int gallons = (int) Math.ceil((1.00 * ceilingSize)/GALLON);

        System.out.println("You will need to purchase " + gallons + " gallons of paint to cover " +
                ceilingSize + " square feet.");
    }
}
