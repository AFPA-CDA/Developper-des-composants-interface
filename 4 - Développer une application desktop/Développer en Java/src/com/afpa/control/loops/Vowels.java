package com.afpa.control.loops;

import com.afpa.Shared;

public class Vowels {
    /**
     * Count the vowels in a word
     * @param word The word to use
     * @return The vowels count
     */
    public static int countVowels(String word) {
        int vowelsCount = 0;

        for (int i = 0; i < word.length(); ++i) {
            switch (word.charAt(i)) {
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
        String word = Shared.readString("Veuillez entrer un mot: ").toLowerCase();

        // Returns the vowels count
        int vowelsCount = countVowels(word);

        // Prints the user input
        System.out.printf("Nombre de voyelles: %d", vowelsCount);
    }
}
