package com.afpa.syntax;

import com.afpa.Shared;

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
     * Prints the values to the console
     *
     * @param area          The area of the circle
     * @param circumference The circumference of the circle
     */
    public static void show(double area, double circumference) {
        System.out.printf("Aire: %1$,.2f", area);
        System.out.println();
        System.out.printf("Circonférence: %1$,.2f", circumference);
        System.out.println();
    }

    /**
     * Executes the code properly
     */
    public static void exec() {
        // Prints the header
        System.out.println("**** Périmètre et surface du Cercle (V1.0, 22/04/2020) ****");

        // Calculates the radius, area and circumference
        double radius = Shared.readDouble("Veuillez entrer le rayon: ");
        double area = area(radius);
        double circumference = circumference(radius);

        // Prints the info to the console
        show(area, circumference);
    }
}