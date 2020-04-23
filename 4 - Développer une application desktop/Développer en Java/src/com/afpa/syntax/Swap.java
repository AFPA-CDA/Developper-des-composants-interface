package com.afpa.syntax;

import com.afpa.Shared;

public class Swap {
    /**
     * Prints the results to the user
     *
     * @param nX The first double
     * @param nY The second double
     */
    public static void show(double nX, double nY) {
        System.out.printf("nX = %.2f\n", nX);
        System.out.printf("nY = %.2f\n", nY);
    }

    /**
     * Executes the code properly
     */
    public static void exec() {
        // Prints the header
        System.out.println("**** Swap (V1.1, 22/04/2020) ****");

        // Reads the first and the second double
        double nX = Shared.readDouble("Veuillez entrer nX: ");
        double nY = Shared.readDouble("Veuillez entrer nY: ");

        // Prints the numbers before the swap
        System.out.println("---- Avant le swap ----");
        show(nX, nY);

        // Swaps the numnYer
        nX = nX + nY;
        nY = nX - nY;
        nX = nX - nY;

        // Prints the result to the user
        System.out.println("---- Après le swap -----");
        show(nX, nY);
    }
}
