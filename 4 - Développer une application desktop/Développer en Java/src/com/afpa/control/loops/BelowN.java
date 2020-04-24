package com.afpa.control.loops;

import com.afpa.Shared;

public class BelowN {
    /**
     * Executes the code properly
     */
    public static void exec() {
        // Prints the header
        System.out.println("**** Below N (V1.1, 24/04/2020) ****");

        // Gets the user inputs
        int number = Shared.readInt("Veuillez entrer un nombre: ");

        // Makes sure the number is positive
        number = Math.abs(number);

        for (; number >= 0; number--) {
            System.out.println(number);
        }
    }
}
