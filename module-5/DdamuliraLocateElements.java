/*
 * Name: Peter Ddamulira
 * Assignment: Module 5 - Locate Largest and Smallest Elements
 * Course: CSD-402 Java for Programmers
 * Date: September 13, 2026
 *
 * Purpose:
 * This program demonstrates overloaded methods using two-dimensional
 * int and double arrays. The methods locate the largest and smallest
 * elements in each array and return their row and column locations
 * in a one-dimensional int array.
 */

import java.util.Arrays;

public class DdamuliraLocateElements {

    // Returns the row and column location of the largest
    // element in a two-dimensional double array.
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};
        double largest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] > largest) {
                    largest = arrayParam[row][column];
                    location[0] = row;
                    location[1] = column;
                }
            }
        }

        return location;
    }

    // Returns the row and column location of the largest
    // element in a two-dimensional int array.
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int largest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] > largest) {
                    largest = arrayParam[row][column];
                    location[0] = row;
                    location[1] = column;
                }
            }
        }

        return location;
    }

    // Returns the row and column location of the smallest
    // element in a two-dimensional double array.
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double smallest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] < smallest) {
                    smallest = arrayParam[row][column];
                    location[0] = row;
                    location[1] = column;
                }
            }
        }

        return location;
    }

    // Returns the row and column location of the smallest
    // element in a two-dimensional int array.
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int smallest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] < smallest) {
                    smallest = arrayParam[row][column];
                    location[0] = row;
                    location[1] = column;
                }
            }
        }

        return location;
    }

    // Displays a two-dimensional double array.
    public static void displayArray(double[][] array) {
        for (double[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Displays a two-dimensional int array.
    public static void displayArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {

        double[][] doubleArray = {
            {4.5, 2.1, 9.8},
            {7.3, 1.2, 6.4},
            {3.9, 8.7, 5.6}
        };

        int[][] intArray = {
            {12, 5, 18, 7},
            {3, 25, 9, 14},
            {16, 11, 2, 20}
        };

        int[] doubleLargest = locateLargest(doubleArray);
        int[] doubleSmallest = locateSmallest(doubleArray);

        int[] intLargest = locateLargest(intArray);
        int[] intSmallest = locateSmallest(intArray);

        System.out.println("CSD-402 Module 5 - Locate Array Elements");
        System.out.println("-----------------------------------------");

        System.out.println("\nDOUBLE ARRAY:");
        displayArray(doubleArray);

        System.out.println(
            "Largest element: " +
            doubleArray[doubleLargest[0]][doubleLargest[1]] +
            " at location [" +
            doubleLargest[0] + ", " + doubleLargest[1] + "]"
        );

        System.out.println(
            "Smallest element: " +
            doubleArray[doubleSmallest[0]][doubleSmallest[1]] +
            " at location [" +
            doubleSmallest[0] + ", " + doubleSmallest[1] + "]"
        );

        System.out.println("\nINTEGER ARRAY:");
        displayArray(intArray);

        System.out.println(
            "Largest element: " +
            intArray[intLargest[0]][intLargest[1]] +
            " at location [" +
            intLargest[0] + ", " + intLargest[1] + "]"
        );

        System.out.println(
            "Smallest element: " +
            intArray[intSmallest[0]][intSmallest[1]] +
            " at location [" +
            intSmallest[0] + ", " + intSmallest[1] + "]"
        );
    }
}