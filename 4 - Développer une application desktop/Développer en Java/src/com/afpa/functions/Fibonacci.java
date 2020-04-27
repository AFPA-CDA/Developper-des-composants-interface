package com.afpa.functions;

import com.afpa.Shared;

public class Fibonacci {
    /**
     * Runs the the fibonacci sequence in a recursive manner
     * @param iteration The number of iterations
     * @return The calculated fibonacci number
     */
    public static int fibonacci(int iteration) {
        if (iteration == 1 || iteration == 2) {
            return 1;
        } else {
            return fibonacci(iteration - 1) + fibonacci(iteration - 2);
        }
    }

    /**
     * Executes the code properly
     */
    public static void exec() {
        // Prints the header
        System.out.println("**** Fibonacci (V1.1, 27/04/2020) ****");

        // Gets the user inputs
        int iteration = Shared.readInt("Combien d'itérations voulez vous: ");

        // Prints the result to the user
        System.out.printf("Résultat: %d", fibonacci(iteration));
    }
}
