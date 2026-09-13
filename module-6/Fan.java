/*
 * Name: Peter Ddamulira
 * Assignment: Module 6 - Fan Class
 * Course: CSD-402 Java for Programmers
 * Date: September 13, 2026
 *
 * Purpose:
 * This program creates a Fan class that demonstrates
 * object-oriented programming concepts including constants,
 * private fields, constructors, getters, setters, and a
 * toString() method. The program creates two Fan objects
 * and demonstrates the functionality of the Fan class.
 */

public class Fan {

    // Fan speed constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Fan fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor sets all fields to default values
    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6.0;
        color = "white";
    }

    // Constructor that accepts values for all fields
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter for speed
    public int getSpeed() {
        return speed;
    }

    // Setter for speed
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter for on
    public boolean isOn() {
        return on;
    }

    // Setter for on
    public void setOn(boolean on) {
        this.on = on;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Converts the numeric speed value to an easy-to-read description
    private String getSpeedName() {
        switch (speed) {
            case SLOW:
                return "SLOW";
            case MEDIUM:
                return "MEDIUM";
            case FAST:
                return "FAST";
            default:
                return "STOPPED";
        }
    }

    // Returns a description of the Fan object's current state
    @Override
    public String toString() {
        return "Fan State:" +
               "\nSpeed: " + getSpeedName() + " (" + speed + ")" +
               "\nOn: " + on +
               "\nRadius: " + radius +
               "\nColor: " + color;
    }

    // Test code
    public static void main(String[] args) {

        System.out.println("CSD-402 Module 6 - Fan Class");
        System.out.println("----------------------------");

        // Create Fan 1 using the default constructor
        Fan fan1 = new Fan();

        System.out.println("\nFAN 1 - DEFAULT CONSTRUCTOR");
        System.out.println(fan1);

        // Create Fan 2 using the argument constructor
        Fan fan2 = new Fan(FAST, true, 10.0, "blue");

        System.out.println("\nFAN 2 - ARGUMENT CONSTRUCTOR");
        System.out.println(fan2);

        // Demonstrate setter methods by changing Fan 1
        fan1.setSpeed(MEDIUM);
        fan1.setOn(true);
        fan1.setRadius(8.0);
        fan1.setColor("black");

        System.out.println("\nFAN 1 - AFTER USING SETTER METHODS");
        System.out.println(fan1);

        // Demonstrate getter methods using Fan 2
        System.out.println("\nFAN 2 - GETTER METHOD RESULTS");
        System.out.println("Speed value: " + fan2.getSpeed());
        System.out.println("On: " + fan2.isOn());
        System.out.println("Radius: " + fan2.getRadius());
        System.out.println("Color: " + fan2.getColor());
    }
}