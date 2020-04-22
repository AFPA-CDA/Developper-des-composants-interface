package com.afpa.syntax;

import java.util.Scanner;

public class Circle {
    /**
     * Calculates the area
     */
    public static double area(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Calculates the circumference
     */
    public static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    /**
     * Reads the user input for the circle radius
     */
    public static double radius() {
        // Prints the instruction to the user
        System.out.println("Veuillez entrer le rayon: ");
        // Creates a new Scanner with the system input
        Scanner radiusInput = new Scanner(System.in);
        // Reads the input as a double
        double radius = radiusInput.nextDouble();
        // Closes the Scanner to prevent resources leak
        radiusInput.close();
        // Returns the radius
        return radius;
    }

    public static void show(double area, double circumference) {
        String firstLine = String.format("Aire: %1$,.2f", area);
        String secondLine = String.format("Circonférence: %1$,.2f", circumference);

        System.out.println(firstLine);
        System.out.println(secondLine);
    }
}