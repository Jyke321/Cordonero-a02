package exercise20;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob Cordonero
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution20 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //prompt user for the order amount and the state
        System.out.print("What is the order amount? ");
        double total = Double.parseDouble(in.nextLine());
        double tax = getTaxInformationFromUser();
        DecimalFormat df = new DecimalFormat();
        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);
        tax = tax*total;
        if(tax>0)
            System.out.println("The tax is $" + df.format(tax) + ".");
        System.out.println("The total is $" + df.format(Math.round((total + tax)*100)/100.0) + ".");
    }

    private static double getTaxInformationFromUser() {
        double retVal = 0;
        System.out.print("What state do you live in? ");
        String buffer = in.nextLine();
        if (buffer.compareTo("Wisconsin")==0) {
            retVal = 0.05;
            System.out.print("What county do you live in? ");
            buffer = in.nextLine();
            if (buffer.compareTo("Eau Claire")==0)
                retVal += .005;
            else if (buffer.compareTo("Dunn")==0)
                retVal += .004;
        } else if (buffer.compareTo("Illinois")==0)
            retVal += 0.08;
        return retVal;
    }
}
