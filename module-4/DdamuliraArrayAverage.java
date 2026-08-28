/*
 * Name: Peter Ddamulira
 * Assignment: Module 4 - Overloaded Array Average Methods
 * Course: CSD-402 Java for Programmers
 * Date: August 28, 2026
 *
 * Purpose:
 * This program demonstrates method overloading by creating four
 * average methods for short, int, long, and double arrays.
 * Each array has a different size. The program displays the
 * original array elements and the average returned by each method.
 */

import java.util.Arrays;

public class DdamuliraArrayAverage {

    // Returns the average of a short array.
    public static short average(short[] array) {
        short sum = 0;

        for (short value : array) {
            sum += value;
        }

        return (short) (sum / array.length);
    }

    // Returns the average of an int array.
    public static int average(int[] array) {
        int sum = 0;

        for (int value : array) {
            sum += value;
        }

        return sum / array.length;
    }

    // Returns the average of a long array.
    public static long average(long[] array) {
        long sum = 0;

        for (long value : array) {
            sum += value;
        }

        return sum / array.length;
    }

    // Returns the average of a double array.
    public static double average(double[] array) {
        double sum = 0;

        for (double value : array) {
            sum += value;
        }

        return sum / array.length;
    }

    public static void main(String[] args) {

        // Each array contains a different number of elements.
        short[] shortArray = {10, 20, 30};
        int[] intArray = {5, 10, 15, 20};
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        double[] doubleArray = {2.5, 5.0, 7.5, 10.0, 12.5, 15.0};

        System.out.println("CSD-402 Module 4 - Array Average Program");
        System.out.println("----------------------------------------");

        System.out.println("\nSHORT ARRAY");
        System.out.println("Original elements: " + Arrays.toString(shortArray));
        System.out.println("Average: " + average(shortArray));

        System.out.println("\nINTEGER ARRAY");
        System.out.println("Original elements: " + Arrays.toString(intArray));
        System.out.println("Average: " + average(intArray));

        System.out.println("\nLONG ARRAY");
        System.out.println("Original elements: " + Arrays.toString(longArray));
        System.out.println("Average: " + average(longArray));

        System.out.println("\nDOUBLE ARRAY");
        System.out.println("Original elements: " + Arrays.toString(doubleArray));
        System.out.println("Average: " + average(doubleArray));
    }
}