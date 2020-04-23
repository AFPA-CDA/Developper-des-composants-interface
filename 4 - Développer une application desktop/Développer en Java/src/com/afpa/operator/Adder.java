package com.afpa.operator;

import com.afpa.Shared;

public class Adder {
    /**
     * Adds two number
     *
     * @param a The first number
     * @param b The second number
     * @return The added number
     */
    public static double add(double a, double b) {
        return a + b;
    }

    /**
     * Prints the results to the user
     *
     * @param a The first double
     * @param b The second double
     */
    public static void show(double a, double b) {
        System.out.printf("a = %1$,.2f\n", a);
        System.out.printf("b = %1$,.2f\n", b);
    }

    /**
     * Executes the code properly
     */
    public static void exec() {
        // Prints the header
        System.out.println("**** Adder (V1.1, 22/04/2020) ****");

        // Reads the first and the second double
        double a = Shared.readDouble("Veuillez entrer a: ");
        double b = Shared.readDouble("Veuillez entrer b: ");

        // Show the info about a and b
        show(a, b);

        // Prints the result
        System.out.printf("%.2f + %.2f = %.2f", a, b, add(a, b));
    }
}
