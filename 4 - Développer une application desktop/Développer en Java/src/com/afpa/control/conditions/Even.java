package com.afpa.control.conditions;

import com.afpa.Shared;

public class Even {
    /**
     * Returns a string saying if the number is odd or even
     *
     * @param num The number to test
     * @return A string saying if the number is odd or even
     */
    public static String oddOrEven(int num) {
        return num % 2 == 0 ? "Nombre pair" : "Nombre impair";
    }

    /**
     * Executes the code properly
     */
    public static void exec() {
        // Prints the header
        System.out.println("**** Even (V1.1, 22/04/2020) ****");

        // Retreives the int given by the user
        int num = Shared.readInt("Veuillez entrer un nombre entier: ");

        // Prints the info to the user
        System.out.printf("%d: %s", num, oddOrEven(num));
    }
}
