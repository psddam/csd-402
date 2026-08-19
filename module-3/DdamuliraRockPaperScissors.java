/*
 * Name: Peter Ddamulira
 * Assignment: Rock-Paper-Scissors
 * Course: CSD-402 Java for Programmers
 * Module: 3
 * Date: August 19, 2026
 *
 * Purpose:
 * This program simulates the game Rock-Paper-Scissors.
 * The computer randomly selects Rock, Paper, or Scissors,
 * and the user enters a selection. The program then
 * determines and displays the winner.
 */

import java.util.Scanner;

public class DdamuliraRockPaperScissors {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Generate a random number from 1 through 3.
        int computerChoice = (int)(Math.random() * 3) + 1;

        // Ask the user for a selection.
        System.out.println("Rock-Paper-Scissors");
        System.out.println("-------------------");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");
        System.out.print("\nEnter your choice (1, 2, or 3): ");

        int userChoice = input.nextInt();

        // Make sure the user entered a valid number.
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid selection. Please enter 1, 2, or 3.");
            input.close();
            return;
        }

        // Convert the computer's number into a readable selection.
        String computerSelection;

        switch (computerChoice) {
            case 1:
                computerSelection = "Rock";
                break;
            case 2:
                computerSelection = "Paper";
                break;
            default:
                computerSelection = "Scissors";
        }

        // Convert the user's number into a readable selection.
        String userSelection;

        switch (userChoice) {
            case 1:
                userSelection = "Rock";
                break;
            case 2:
                userSelection = "Paper";
                break;
            default:
                userSelection = "Scissors";
        }

        // Display both selections.
        System.out.println("\nComputer selected: " + computerSelection);
        System.out.println("You selected: " + userSelection);

        // Determine the winner.
        if (computerChoice == userChoice) {
            System.out.println("Result: It's a tie!");
        }
        else if ((userChoice == 1 && computerChoice == 3) ||
                 (userChoice == 2 && computerChoice == 1) ||
                 (userChoice == 3 && computerChoice == 2)) {

            System.out.println("Result: You win!");
        }
        else {
            System.out.println("Result: Computer wins!");
        }

        input.close();
    }
}