package exercise18;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob Cordonero
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution18 {
    public static void main(String[] args) {
        //Prompt user for temperature type
        //Prompt user for starting temperature
        //convert to opposite temperature
        Scanner input = new Scanner(System.in);
        System.out.print("""
                Press C to convert from Fahrenheit to Celsius.
                Press F to convert from Celsius to Fahrenheit.
                Your choice:\s""");
        char type = input.nextLine().toCharArray()[0];
        type = Character.toLowerCase(type);
        String tempType = (type=='c')?"Fahrenheit":"Celsius";
        String convType = (type=='f')?"Fahrenheit":"Celsius";
        System.out.print("Please enter the temperature in " + tempType + ": ");
        double temp = Double.parseDouble(input.nextLine());
        double convTemp;
        if (type=='c') {
            //C = (F − 32) × 5 / 9
            convTemp = (temp - 32) * 5 / 9;
        } else { //F = (C × 9 / 5) + 32
            convTemp = (temp * 9 / 5) + 32;
        }
        DecimalFormat df = new DecimalFormat();
        df.setMinimumFractionDigits(0);
        df.setMaximumFractionDigits(1);
        System.out.println("The temperature in " + convType +" is "+ df.format(convTemp) +".");
    }
}
