package exercise14;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob Cordonero
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution14 {
    /*
        Exercise 14 - Tax Calculator
        Example Output
    What is the order amount? 10
    What is the state? WI
    The subtotal is $10.00.
    The tax is $0.55.
    The total is $10.55.
    Or

    What is the order amount? 10
    What is the state? MN
    The total is $10.00

        Constraints
    ~Implement this program using only a simple if statement—don’t use an else clause.
    ~Ensure that all money is rounded up to the nearest cent.
    ~Use a single output statement at the end of the program to display the program results.
     */
    public static void main(String[] args) {
        //prompt the user for an order amount
        //then prompt them for the state (initials)
        //if they entered "WI"
        //  display the subtotal  and tax
        //then display the total

        final double TAXRATE = 0.055;
        final String WI = "WI";
        Scanner input = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        String buffer = input.nextLine();
        double money = Double.parseDouble(buffer);
        double tax = 0.0;
        System.out.print("What is the state? ");
        buffer = input.nextLine();
        DecimalFormat df = new DecimalFormat();
        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);
        if (buffer.compareTo(WI)==0) {
            tax = Math.round((money * TAXRATE) * 100)/100.0;
            System.out.println("The subtotal is $"+ df.format(money) +".\n" +
                    "The tax is $"+ df.format(tax) +".");
        }
        System.out.println("The total is $" + df.format(money + tax) + ".");
    }
}
