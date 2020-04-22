package com.afpa.syntax;

import java.util.Scanner;

public class Swap {
    /**
     * Reads a double from the command line
     * @param place The place for the number
     * @return The double given by the user
     */
    public static double readDouble(String place) {
        Scanner numberReader = new Scanner(System.in);
        System.out.printf("Veuillez entrer le %s nombre !\n", place);
        return numberReader.nextDouble();
    }

    /**
     * Prints the results to the user
     * @param a The first double
     * @param b The second double
     */
    public static void show(double a, double b) {
        System.out.printf("A = %1$,.2f", a);
        System.out.println();
        System.out.printf("B = %1$,.2f", b);
    }

    /**
     * Executes the code properly
     */
    public static void exec() {
        // Prints the header
        System.out.println("**** Swap (V1.0, 22/04/2020) ****");

        // Reads the first and the second double
        double a = readDouble("premier");
        double b = readDouble("second");

        // Prints the numbers before the swap
        show(a, b);

        // Swaps the number
        a = a + b;
        b = a - b;
        a = a - b;

        // Prints the result to the user
        show(a, b);
    }
}
