package com.afpa.control.loops;

import com.afpa.Shared;

public class MagicNumber {
    /**
     * Generates a random int
     * @return A random int from 1 to 100
     */
    public static int generateRandomInt() {
        return (int)(Math.random() * 100 + 1);
    }

    /**
     * Executes the code properly
     */
    public static void exec() {
        int guessNumber;

        // Returns a random int
        int magicNumber = generateRandomInt();

        // Prints the header
        System.out.println("**** Magic Number (V1.1, 24/04/2020) ****");

        // Asks the user for a number until the magic number has been found
        do {
            // Prints the instructions
            guessNumber = Shared.readInt("Veuillez entrer un nombre: ");

            if (guessNumber < magicNumber) {
                System.out.println("Trop petit");
            } else if (guessNumber > magicNumber) {
                System.out.println("Trop grand");
            } else {
                System.out.println("Féliciations !");
            }
        } while (guessNumber != magicNumber);
    }
}
