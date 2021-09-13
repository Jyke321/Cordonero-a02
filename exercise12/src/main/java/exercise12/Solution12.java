package exercise12;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob Cordonero
 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution12 {
    /*
        Exercise 12 - Computing Simple Interest
    Computing simple interest is a great way to quickly figure out whether an investment has value.
    It’s also a good way to get comfortable with explicitly coding the order of operations in your programs.
    Create a program that computes simple interest.
    Prompt for the principal amount, the rate as a percentage, and the time, and
    display the amount accrued (principal + interest).
    The formula for simple interest is A = P(1 + rt),
    where P is the principal amount, r is the annual rate of interest,
    t is the number of years the amount is invested, and A is the amount at the end of the investment.

        Example Output
    Enter the principal: 1500
    Enter the rate of interest: 4.3
    Enter the number of years: 4
    After 4 years at 4.3%, the investment will be worth $1758.
        Constraints
    ~Prompt for the rate as a percentage (like 15, not .15). Divide the input by 100 in your program.
    ~Ensure that fractions of a cent are rounded up to the next penny.
    ~Ensure that the output is formatted as money.
     */
    public static void main(String[] args) {
        //Prompt the user for the principal amount,
        //the rate as a percentage, and the time
        //calculate the interest accrued
        //display the amount accrued
        Scanner input = new Scanner(System.in);
        String buffer;
        System.out.print("Enter the principal: ");
        buffer = input.nextLine();
        int principal = Integer.parseInt(buffer);
        System.out.print("Enter the rate of interest: ");
        buffer = input.nextLine();
        double interestRate = Double.parseDouble(buffer);
        System.out.print("Enter the number of years: ");
        buffer = input.nextLine();
        int years = Integer.parseInt(buffer);
        //math
        //A = P(1 + rt)
        BigDecimal money = BigDecimal.valueOf(principal * (1 + (interestRate / 100 * years)));
        money = money.setScale(2, RoundingMode.HALF_UP);
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(0);

        System.out.println("After "+ years + " years at "+ interestRate + "%, the investment will be worth $"+ df.format(money) +".");
    }
}
