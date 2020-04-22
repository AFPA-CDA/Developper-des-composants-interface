package com.afpa.operator;

import com.afpa.Shared;

import java.util.Scanner;

public class Divider {
    /**
     * Divides a number
     *
     * @param a The first number
     * @param b The second number
     * @return The divided number
     * @throws ArithmeticException if denominator is zero
     */
    public static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("The denominator can't be zero.");
        } else {
            return a / b;
        }
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
        System.out.println("**** Divider (V1.1, 22/04/2020) ****");

        // Reads the first and the second double
        double a = Shared.readDouble("Veuillez entrer a: ");
        double b = Shared.readDouble("Veuillez entrer b: ");

        // Show the info about a and b
        show(a, b);

        try {
            // Prints the result if nothing went wrong
            System.out.printf("%1$,.2f / %2$,.2f = %3$,.2f", a, b, divide(a, b));
        } catch (ArithmeticException e) {
            // Prints the error and exits the program if an ArithmeticException has been raised
            System.out.println(e.toString());
            System.exit(1);
        }
    }
}
