package exercise19;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob Cordonero
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution19 {
    public static void main(String[] args) {
        //prompt the user for weight and height
        //calculate the BMI using the formula
        final double BOT_RANGE = 18.5, TOP_RANGE = 25;
        double weight = getInput("Enter your weight: ");
        double height = getInput("Enter your height: ");

        //bmi = (weight / (height × height)) * 703
        double bmi = (weight / (height * height)) * 703;
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(1);
        System.out.println("Your BMI is " + df.format(bmi) + ".");
        if (bmi > BOT_RANGE && bmi < TOP_RANGE)
            System.out.println("You are within the ideal weight range.");
        else
            System.out.println("You are overweight. You should see your doctor.");
    }
    public static double getInput(String prompt) {
        Scanner input = new Scanner(System.in);
        boolean inputError;
        double retValue = 0;
        do {
            System.out.print(prompt);
            try {
                retValue = Double.parseDouble(input.nextLine());
                inputError = false;
            } catch (Exception e) {
                inputError = true;
            }
        } while (inputError);
        return retValue;
    }
}
