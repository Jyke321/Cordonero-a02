package exercise16;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob Cordonero
 */

import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {
        //prompt user for their age
        //compare the age to the legal driving age: 16
        //display whether they can drive based off
        //a comparison of their age and the legal driving age
        Scanner input = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = Integer.parseInt(input.nextLine());
        String legibility = (age>=16)?"":"not ";
        System.out.println("You are " + legibility + "old enough to legally drive.\n");
    }
}
