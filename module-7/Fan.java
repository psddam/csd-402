/*
 * Name: Peter Ddamulira
 * Assignment: Module 7 - UseFans
 * Course: CSD-402 Java for Programmers
 * Date: September 13, 2026
 *
 * Purpose:
 * This Fan class represents a fan using speed, power status,
 * radius, and color. The class demonstrates encapsulation,
 * constructors, getters, setters, constants, and the use
 * of the 'this' reference.
 */

public class Fan {

    // Fan speed constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    // Argument constructor
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter for speed
    public int getSpeed() {
        return this.speed;
    }

    // Setter for speed
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter for on
    public boolean isOn() {
        return this.on;
    }

    // Setter for on
    public void setOn(boolean on) {
        this.on = on;
    }

    // Getter for radius
    public double getRadius() {
        return this.radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for color
    public String getColor() {
        return this.color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }
}