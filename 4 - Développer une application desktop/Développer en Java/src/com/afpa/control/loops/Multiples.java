package com.afpa.control.loops;

import com.afpa.Shared;

public class Multiples {
    /**
     * Executes the code properly
     */
    public static void exec() {
        // Prints the header
        System.out.println("**** Multiples (V1.1, 24/04/2020) ****");

        // Gets the user inputs
        int multiple = Shared.readInt("Veuillez entrer le nombre que vous voulez multiplier : ");
        int number = Shared.readInt("Combien de fois voulez vous mutplier ce nombre: ");

        for (; number >= 0; number--) {
            System.out.printf("%d x %d = %d\n", number, multiple, number * multiple);
        }
    }
}
