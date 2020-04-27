package com.afpa.functions;

import com.afpa.Shared;

public class StringToken {
    public static String strtok(String firstString, String secondString, int n) {
        return firstString.split(secondString)[n - 1];
    }

    /**
     * Executes the code properly
     */
    public static void exec() {
        // Prints the header
        System.out.println("**** String Token (V1.1, 27/04/2020) ****");

        // Gets the user inputs
        String firstString = Shared.readString("Veuillez entrer une liste de mots: ");
        String secondString = Shared.readString("Veuillez entrer le délimiteur: ");
        int n = Shared.readInt("Veuillez entrer l'index du mot à extraire: ");

        String test = strtok(firstString, secondString, n);

        System.out.printf("Resultat: %s", test);
    }
}
