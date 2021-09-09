package exercise10;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob Cordonero
 */


import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {
        //Create constant tax rate of 5.5%.
        //Prompt for the prices and quantities of three items.
        //Calculate the subtotal of the items.
        //Then calculate the tax using the tax rate.
        //Print out the line items with the quantity and total,
        //and then print out the subtotal, tax amount, and total.
        final double TAXRATE = 0.055;
        Scanner input = new Scanner(System.in);
        String buffer;
        System.out.print("Enter the price of item 1: ");
        buffer = input.nextLine();
        double price1 = Double.parseDouble(buffer);
        System.out.print("Enter the quantity of item 1: ");
        buffer = input.nextLine();
        int quantity1 = Integer.parseInt(buffer);
        System.out.print("Enter the price of item 2: ");
        buffer = input.nextLine();
        double price2 = Double.parseDouble(buffer);
        System.out.print("Enter the quantity of item 2: ");
        buffer = input.nextLine();
        int quantity2 = Integer.parseInt(buffer);
        System.out.print("Enter the price of item 3: ");
        buffer = input.nextLine();
        double price3 = Double.parseDouble(buffer);
        System.out.print("Enter the quantity of item 3: ");
        buffer = input.nextLine();
        int quantity3 = Integer.parseInt(buffer);

        double subtotal = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3);
        double tax = subtotal * TAXRATE;
        double total = subtotal + tax;

        DecimalFormat df = new DecimalFormat();
        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);
        String finalOutput = "Subtotal: $" + df.format(subtotal) +
                "\nTax: $" + df.format(tax) +
                "\nTotal: $" + df.format(total);


        System.out.println(finalOutput);
    }
}
