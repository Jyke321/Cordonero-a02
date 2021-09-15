package exercise17;

import java.util.Scanner;

public class Solution17 {
    public static void main(String[] args) {
        //prompts for your weight, gender, total alcohol consumed (in ounces),
        //and the amount of time since your last drink.
        //Calculate your blood alcohol content (BAC) using this formula
        final double LEGALBAC = 0.08;
        final double ADRMEN = 0.73, ADRWOMEN = 0.66;
        int gender = getInput("Enter a 1 is you are male or a 2 if you are female: ");
        int ounces = getInput("How many ounces of alcohol did you have? ");
        int weight = getInput("What is your weight, in pounds? ");
        int hours = getInput("How many hours has it been since your last drink? ");
        //BAC = (A × 5.14 / W × r) − .015 × H
        double r = (gender==1)?ADRMEN:ADRWOMEN;
        double BAC = Math.round(((ounces * 5.14 / weight * r) - .015 * hours)*1000000)/1000000.0;
        String legibility = (BAC<=LEGALBAC)?"":"not ";

        System.out.println("\nYour BAC is "+ BAC +
                "\nIt is " + legibility + "legal for you to drive.");
    }
    public static int getInput (String prompt) {
        Scanner input = new Scanner(System.in);
        boolean inputError;
        int retValue = 0;
        do {
            System.out.print(prompt);
            try {
                retValue = Integer.parseInt(input.nextLine());
                inputError = false;
            } catch (Exception e) {
                inputError = true;
            }
        } while (inputError);
        return retValue;
    }
}
