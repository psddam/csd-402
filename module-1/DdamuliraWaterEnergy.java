/*
 * Name: Peter Ddamulira
 * Assignment: Module 1.3 Programming Assignment
 * Course: CSD-402 Java for Programmers
 * Date: August 14, 2026
 *
 * Purpose:
 * This program calculates the amount of energy required to heat water
 * from an initial temperature to a final temperature.
 */

import java.util.Scanner;

public class DdamuliraWaterEnergy {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask the user for the amount of water in kilograms.
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        // Ask the user for the initial temperature.
        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemperature = input.nextDouble();

        // Ask the user for the final temperature.
        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemperature = input.nextDouble();

        // Calculate the energy needed using the required formula.
        double energy = waterMass
                * (finalTemperature - initialTemperature)
                * 4184;

        // Display the calculated energy.
        System.out.println();
        System.out.println("Energy needed to heat the water: "
                + energy + " Joules");

        input.close();
    }
}