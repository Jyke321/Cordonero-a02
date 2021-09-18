package exercise22;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob Cordonero
 */

import java.util.Scanner;

public class Solution22 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //prompt the user for three numbers
        //if the numbers are the same
        //  quit out of the program
        //otherwise display the largest number
        int[] numbers = getNumbersFromUsers();
        int largestNumber = getLargestNumber(numbers);
        if (largestNumber==-9999)
            System.exit(0);
        System.out.println("The largest number is "+ largestNumber +".");
    }

    public static int getLargestNumber(int[] numbers) {
        int temp = numbers[0];
        for (int i=1; i<2; i++) {
            if (numbers[i-1] == numbers[i] || numbers[i-1] == numbers[i+1]) {
                temp = -9999;
                break;
            }
            if (temp < numbers[i])
                temp = numbers[i];
        }
        return temp;
    }

    private static int[] getNumbersFromUsers() {
        int[] numbers = new int[3];
        System.out.print("Enter the first number: ");
        numbers[0] = Integer.parseInt(in.nextLine());
        System.out.print("Enter the second number: ");
        numbers[1] = Integer.parseInt(in.nextLine());
        System.out.print("Enter the third number: ");
        numbers[2] = Integer.parseInt(in.nextLine());
        return numbers;
    }
}
