package com.afpa.functions;

import com.afpa.Shared;

public class CountLetters {
    /**
     * Counts the letter occurence in a given sentence
     * @param sentence The sentence to analyse
     * @param letter The letter to count
     * @return The occurences count of the letter
     */
    public static long countLetters(String sentence, String letter) {
        return sentence.toLowerCase().chars().filter(ch -> ch == letter.charAt(0)).count();
    }

    /**
     * Executes the code properly
     */
    public static void exec() {
        // Prints the header
        System.out.println("**** Count Letters (V1.1, 27/04/2020) ****");

        // Gets the user inputs
        String sentence = Shared.readString("Veuillez entrer une phrase: ");
        String letter = Shared.readString("Veuillez entrer une lettre: ");

        // Prints the result to the user
        System.out.printf("Occurences: %d", countLetters(sentence, letter));
    }
}
