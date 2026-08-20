/*
 * Name: Peter Ddamulira
 * Assignment: Module 3 - Nested For Loops
 * Course: CSD-402 Java for Programmers
 * Date: August 19, 2026
 *
 * Purpose:
 * This program uses nested for loops to display a pyramid
 * of powers of two. Each line ends with the @ symbol.
 */

public class DdamuliraNestedLoops {

    public static void main(String[] args) {

        // Create seven rows.
        for (int row = 0; row < 7; row++) {

            // Add spaces before each row to create the pyramid shape.
            for (int space = 0; space < 6 - row; space++) {
                System.out.print("  ");
            }

            // Print powers of two in ascending order.
            for (int column = 0; column <= row; column++) {
                System.out.print((int) Math.pow(2, column) + " ");
            }

            // Print powers of two in descending order.
            for (int column = row - 1; column >= 0; column--) {
                System.out.print((int) Math.pow(2, column) + " ");
            }

            // Print the required @ symbol at the end of each line.
            System.out.println("@");
        }
    }
}