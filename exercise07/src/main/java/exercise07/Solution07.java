package exercise07;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob Cordonero
 */

import java.util.Scanner;

public class Solution07 {
    public static void main(String[] args) {
        //prompt the user for the length and width of
        //a room in feet and store in integer variables
        //Then store the squared data
        //then using a constant, convert from feet squared to meters squared
        //finally display the data as both feet squared and meters squared
        final double convFactor = 0.09290304;
        Scanner input = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        int lengthFT = Integer.parseInt(input.nextLine());
        System.out.print("What is the width of the room in feet? ");
        int widthFT = Integer.parseInt(input.nextLine());
        int feetSquared = (widthFT * lengthFT);
        //I miss .3lf now, printfs won't work for me for some reason
        double metersSquared = (Math.round((feetSquared * convFactor) * 1000))/1000.000;

        System.out.println("You entered dimensions of " + lengthFT + " feet by "+ widthFT +" feet.");
        System.out.println("The area is");
        System.out.println(feetSquared + " square feet");
        System.out.println(metersSquared + " square meters");
    }
}
