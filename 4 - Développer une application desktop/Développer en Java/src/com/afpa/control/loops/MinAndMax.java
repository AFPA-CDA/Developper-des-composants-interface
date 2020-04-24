package com.afpa.control.loops;

import com.afpa.Shared;

public class MinAndMax {
    /**
     * Executes the code properly
     */
    public static void exec() {
        double number;
        double min = 0;
        double max = 0;
        double sum = 0;
        int count = 0;

        // Prints the header
        System.out.println("**** Min and Max (V1.1, 24/04/2020) ****");

        // While the user don't give 0
        do {
            // Gets the user inputs
            number = Shared.readDouble("Veuillez entrer un nombre [0 pour arrêter]: ");
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
            count++;
        } while (!Shared.scan.hasNext("0"));

        double average = sum / count;

        // Prints the result to the user
        System.out.printf("Moyenne: %.2f\n", average);
        System.out.printf("Min: %.2f\n", min);
        System.out.printf("Max: %.2f\n", max);
    }
}
