package com.afpa.syntax;

import java.util.Scanner;

public class Circle {
    /**
     * Calculates the area of a circle
     *
     * @param radius The radius of the circle
     * @return The area of the circle
     */
    public static double area(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Calculates the circumference
     *
     * @param radius The radius of the circle
     * @return The circumference of the circle
     */
    public static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    /**
     * Reads the user input for the circle radius
     *
     * @return The radius of the circle
     */
    public static double radius() {
        // Prints the instruction to the user
        System.out.println("Veuillez entrer le rayon: ");
        // Creates a new Scanner with the system input
        Scanner radiusInput = new Scanner(System.in);
        // Returns the radius
        return radiusInput.nextDouble();
    }

    /**
     * Prints the values to the console
     *
     * @param area          The area of the circle
     * @param circumference The circumference of the circle
     */
    public static void show(double area, double circumference) {
        System.out.printf("Aire: %1$,.2f", area);
        System.out.println();
        System.out.printf("Circonférence: %1$,.2f", circumference);
    }

    /**
     * Executes the code properly
     */
    public static void exec() {
        System.out.println("**** Périmètre et surface du Cercle (V1.0, 22/04/2020) ****");

        double radius = radius();
        double area = area(radius);
        double circumference = circumference(radius);

        show(area, circumference);
    }
}