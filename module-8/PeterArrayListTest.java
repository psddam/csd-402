/*
 * Name: Peter Ddamulira
 * Assignment: Module 8 - ArrayList Test
 * Course: CSD-402 Java for Programmers
 * Date: September 16, 2026
 *
 * Purpose:
 * This program accepts integer values from the user and
 * stores them in an ArrayList. Input continues until the
 * user enters 0, which is also added to the ArrayList.
 * The ArrayList is then passed to the max() method, which
 * returns the largest Integer value in the list.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PeterArrayListTest {

    /*
     * Receives an ArrayList and returns the largest value.
     * If the ArrayList is empty, the method returns 0.
     */
    public static Integer max(ArrayList list) {

        // Return 0 if the ArrayList is empty.
        if (list == null || list.isEmpty()) {
            return 0;
        }

        // Start with the first value as the largest.
        Integer largest = (Integer) list.get(0);

        // Compare each value with the current largest value.
        for (int i = 1; i < list.size(); i++) {
            Integer currentValue = (Integer) list.get(i);

            if (currentValue > largest) {
                largest = currentValue;
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ArrayList used to store Integer values entered by the user.
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("CSD-402 Module 8 - ArrayList Test");
        System.out.println("================================");

        System.out.println("\nEnter integer values.");
        System.out.println("Enter 0 when you are finished.");

        int number;

        // Continue receiving values until the user enters 0.
        do {
            System.out.print("Enter an integer: ");
            number = input.nextInt();

            // The value is added before checking for 0,
            // so 0 is also stored in the ArrayList.
            numbers.add(number);

        } while (number != 0);

        // Display the values entered.
        System.out.println("\nValues in the ArrayList: " + numbers);

        // Send the ArrayList to the max() method.
        Integer largestValue = max(numbers);

        // Display the largest value.
        System.out.println("Largest value: " + largestValue);

        // Additional test of an empty ArrayList.
        ArrayList<Integer> emptyList = new ArrayList<>();

        System.out.println("\nEMPTY ARRAYLIST TEST");
        System.out.println("Largest value in empty ArrayList: " + max(emptyList));

        input.close();
    }
}