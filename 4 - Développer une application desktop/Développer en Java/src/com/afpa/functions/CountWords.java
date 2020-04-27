package com.afpa.functions;

import com.afpa.Shared;

public class CountWords {
    public static int countWords(String sentence) {
        return sentence.split(" ").length;
    }

    /**
     * Executes the code properly
     */
    public static void exec() {
        // Prints the header
        System.out.println("**** Count Words (V1.1, 27/04/2020) ****");

        // Gets the user inputs
        String sentence = Shared.readString("Veuillez entrer une phrase: ");

        // Prints the result to the user
        System.out.printf("Nombre de mots: %d", countWords(sentence));
    }
}
