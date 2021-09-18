package exercise21;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob Cordonero
 */

import java.util.Scanner;

public class Solution21 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //prompt user the number of a month
        //get the corresponding month name
        //display the month
        System.out.print("Please enter the number of the month: ");
        int monthNumber = Integer.parseInt(in.nextLine());
        String month;
        switch (monthNumber) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "N/A";
        }
        System.out.println("The name of the month is " + month + ".");
    }
}
