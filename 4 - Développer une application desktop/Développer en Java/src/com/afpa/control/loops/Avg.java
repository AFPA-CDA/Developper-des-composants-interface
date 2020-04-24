package com.afpa.control.loops;

import com.afpa.Shared;

public class Avg {
    /**
     * Executes the code properly
     */
    public static void exec() {
        double number;
        double sum = 0;
        int count = 0;

        // Prints the header
        System.out.println("**** Average (V1.1, 24/04/2020) ****");

        // While the user don't give 0
        do {
            // Gets the user inputs
            number = Shared.readDouble("Veuillez entrer un nombre [0 pour arrêter]: ");
            sum += number;
            count++;
        } while (number != 0);

        // Prints the result to the user
        System.out.printf("Moyenne: %.2f", (sum / count));
    }
}
