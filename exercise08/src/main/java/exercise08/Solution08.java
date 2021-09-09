package exercise08;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob Cordonero
 */

import java.util.Scanner;

public class Solution08 {
    public static void main(String[] args) {
        ////prompt the user for the number of:
        //people, pizzas, and slices per pizza
        //calculate the total number of slices
        //calculate the number of slices each person gets
        //calculate the leftover slices
        Scanner input = new Scanner(System.in);
        System.out.print("How many people? ");
        int people = Integer.parseInt(input.nextLine());
        System.out.print("How many pizzas do you have? ");
        int pizzas = Integer.parseInt(input.nextLine());
        System.out.print("How many slices per pizza? ");
        int slicesPerPizza = Integer.parseInt(input.nextLine());
        int totalSlices = slicesPerPizza * pizzas;
        int slicesReceived = totalSlices / people;
        int leftoverSlices = totalSlices - (slicesReceived * people);

        System.out.println(people + " people with " + pizzas + " pizzas ("+ totalSlices + " slices)\n" +
                "Each person gets " + slicesReceived + " pieces of pizza.\n" +
                "There are " + leftoverSlices + " leftover pieces.\n");
    }
}
