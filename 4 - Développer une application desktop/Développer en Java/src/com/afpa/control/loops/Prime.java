package com.afpa.control.loops;

import com.afpa.Shared;

public class Prime {
    /**
     * Tells if a number is prime
     *
     * @param number The number to test
     * @return True if the number is prime
     */
    public static boolean isPrime(int number) {
        boolean isPrime = true;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) isPrime = false;
        }

        return isPrime;
    }

    /**
     * Executes the code properly
     */
    public static void exec() {
        // Prints the header
        System.out.println("**** Prime (V1.1, 24/04/2020) ****");

        // Gets the user inputs
        int number = Shared.readInt("Veuillez entrer un nombre: ");

        // Checks if the given number is prime
        boolean prime = isPrime(number);

        // Prints the result
        System.out.printf("Nombre premier: %b", prime);
    }
}
