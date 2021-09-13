package exercise13;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob Cordonero
 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution13 {
    /*
        Exercise 13 - Determining Compound Interest
    Simple interest is something you use only when making a quick guess.
    Most investments use a compound interest formula, which will be much more accurate.
    And this formula requires you to incorporate exponents into your programs.
    Write a program to compute the value of an investment compounded over time.
    The program should ask for the starting amount, the number of years to invest,
    the interest rate, and the number of periods per year to compound.
    The formula you’ll use for this is A = P(1 + r/n)^(n*t) where
    ~P is the principal amount.
    ~r is the annual rate of interest.
    ~t is the number of years the amount is invested.
    ~n is the number of times the interest is compounded per year.
    ~A is the amount at the end of the investment.
        Example Output
    What is the principal amount? 1500
    What is the rate? 4.3
    What is the number of years? 6
    What is the number of times the interest is compounded per year? 4
    $1500 invested at 4.3% for 6 years compounded 4 times per year is $1938.84.
        Constraints
    ~Prompt for the rate as a percentage (like 15, not .15). Divide the input by 100 in your program.
    ~Ensure that fractions of a cent are rounded up to the next penny.
    ~Ensure that the output is formatted as money.
     */
    public static void main(String[] args) {
        //prompt the user for the starting amount, years, and interest rate
        //and the periods per year to compound
        //calculate the amount after interest
        //display the initial amount, rate, time, and compound rate
        //followed by the amount accrued
        Scanner input = new Scanner(System.in);
        String buffer;
        System.out.print("What is the principal amount? ");
        buffer = input.nextLine();
        int principal = Integer.parseInt(buffer);
        System.out.print("What is the rate? ");
        buffer = input.nextLine();
        double interestRate = Double.parseDouble(buffer);
        System.out.print("What is the number of years? ");
        buffer = input.nextLine();
        int years = Integer.parseInt(buffer);
        System.out.print("What is the number of times the interest is compounded per year? ");
        buffer = input.nextLine();
        int compoundRate = Integer.parseInt(buffer);
        //math
        //A = P(1 + r/n)^(n*t)
        BigDecimal money = BigDecimal.valueOf(principal * Math.pow((1 + ((interestRate / 100) / compoundRate)),(compoundRate * years)));
        money = money.setScale(2, RoundingMode.HALF_UP);
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(0);
        //$1500 invested at 4.3% for 6 years compounded 4 times per year is $1938.84.
        System.out.println("$" + principal + " invested at "+ interestRate + "% for "+ years + " years compounded " + compoundRate + "times per year is $"+ df.format(money) +".");
    }
}
