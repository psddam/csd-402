/*
 * Name: Peter Ddamulira
 * Assignment: Module 7 - UseFans
 * Course: CSD-402 Java for Programmers
 * Date: September 13, 2026
 *
 * Purpose:
 * This program creates a collection of Fan objects and
 * demonstrates methods that display a single Fan and a
 * collection of Fans without using the toString() method.
 */

import java.util.ArrayList;

public class UseFans {

    /*
     * Displays the information for one Fan instance.
     * The toString() method is not used.
     */
    public static void displayFan(Fan fan) {
        System.out.println("Speed: " + getSpeedName(fan.getSpeed()));
        System.out.println("On: " + fan.isOn());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
    }

    /*
     * Displays all Fan instances contained in the collection.
     * The toString() method is not used.
     */
    public static void displayFans(ArrayList<Fan> fans) {

        for (int i = 0; i < fans.size(); i++) {
            System.out.println("\nFan " + (i + 1));
            System.out.println("--------------------");

            displayFan(fans.get(i));
        }
    }

    /*
     * Converts the numeric speed value into an
     * easy-to-read speed description.
     */
    public static String getSpeedName(int speed) {

        switch (speed) {
            case Fan.SLOW:
                return "SLOW";
            case Fan.MEDIUM:
                return "MEDIUM";
            case Fan.FAST:
                return "FAST";
            default:
                return "STOPPED";
        }
    }

    public static void main(String[] args) {

        // Create a collection of Fan instances.
        ArrayList<Fan> fans = new ArrayList<>();

        // Add several Fan objects to the collection.
        fans.add(new Fan());
        fans.add(new Fan(Fan.SLOW, true, 7.0, "blue"));
        fans.add(new Fan(Fan.MEDIUM, true, 9.0, "black"));
        fans.add(new Fan(Fan.FAST, true, 12.0, "red"));

        System.out.println("CSD-402 Module 7 - UseFans");
        System.out.println("==========================");

        System.out.println("\nFAN COLLECTION");
        displayFans(fans);

        // Demonstrate the method that accepts one Fan instance.
        System.out.println("\nSINGLE FAN DISPLAY");
        System.out.println("--------------------");
        displayFan(fans.get(2));

        // Demonstrate modifying a Fan instance.
        fans.get(0).setSpeed(Fan.FAST);
        fans.get(0).setOn(true);
        fans.get(0).setRadius(10.0);
        fans.get(0).setColor("green");

        System.out.println("\nMODIFIED FAN 1");
        System.out.println("--------------------");
        displayFan(fans.get(0));
    }
}