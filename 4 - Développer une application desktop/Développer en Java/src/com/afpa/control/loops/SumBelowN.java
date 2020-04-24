package com.afpa.control.loops;

import com.afpa.Shared;

public class SumBelowN {
    /**
     * Executes the code properly
     */
    public static void exec() {
        // Initialize result variable
        int result = 0;

        // Prints the header
        System.out.println("**** Sum Below N (V1.1, 24/04/2020) ****");

        // Gets the user inputs
        int number = Shared.readInt("Veuillez entrer un nombre: ");

        // Makes sure the number is positive
        number = Math.abs(number);

        for (; number > 0; number--) {
            result += number;
        }

        // Prints the result to the user
        System.out.printf("Somme des entiers: %d", result);
    }
}
