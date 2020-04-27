package com.afpa.functions;

import com.afpa.Shared;

public class Concat {
    /**
     * Concats 2 strings together
     * @param firstStr The first string
     * @param secondStr The second string
     * @return The concated string
     */
    public static String concat(String firstStr, String secondStr) {
        return firstStr.concat(secondStr);
    }

    /**
     * Executes the code properly
     */
    public static void exec() {
        // Prints the header
        System.out.println("**** Concat (V1.1, 27/04/2020) ****");

        // Gets the user inputs
        String firstStr = Shared.readString("Veuillez entrer la première chaine de caractères: ");
        String secondStr = Shared.readString("Veuillez entrer la seconde chaine de caractères: ");

        // Prints the result to the user
        System.out.printf("Résultat: %s", concat(firstStr, secondStr));
    }
}
