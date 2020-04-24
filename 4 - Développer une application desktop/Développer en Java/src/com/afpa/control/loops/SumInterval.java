package com.afpa.control.loops;

import com.afpa.Shared;

public class SumInterval {
    /**
     * Executes the code properly
     */
    public static void exec() {
        int result = 0;

        // Prints the header
        System.out.println("**** Sum Interval (V1.1, 24/04/2020) ****");

        // Gets the user inputs
        int min = Shared.readInt("Veuillez entrer le minimum de l'interval: ");
        int max = Shared.readInt("Veuillez entrer le maximum de l'interval: ");

        for (int i = min; i <= max; i++) {
            result += i;
        }

        // Prints the result to the user
        System.out.printf("Résultat: %d", result);
    }
}
