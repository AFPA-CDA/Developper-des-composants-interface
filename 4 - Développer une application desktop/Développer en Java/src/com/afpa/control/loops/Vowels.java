package com.afpa.control.loops;

import com.afpa.Shared;

public class Vowels {
    /**
     * Count the vowels in a sentence
     * @param sentence The sentence to use
     * @return The vowels count
     */
    public static int countVowels(String sentence) {
        int vowelsCount = 0;

        for (int i = 0; i < sentence.length(); ++i) {
            switch (sentence.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u', 'y' -> vowelsCount++;
            }
        }

        return vowelsCount;
    }

    /**
     * Executes the code properly
     */
    public static void exec() {
        // Prints the header
        System.out.println("**** Vowels (V1.1, 24/04/2020) ****");

        // Gets the user inputs and makes it lowercase
        String sentence = Shared.readString("Veuillez entrer une phrase: ").toLowerCase();

        // Returns the vowels count
        int vowelsCount = countVowels(sentence);

        // Prints the user input
        System.out.printf("Nombre de voyelles: %d", vowelsCount);
    }
}
