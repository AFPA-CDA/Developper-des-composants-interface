package com.afpa.control.conditions;

import com.afpa.Shared;

public class Calculator {
    /**
     * A simple calculator function
     * @param a The first number
     * @param b The second number
     * @param operator The operator to use
     * @throws ArithmeticException If denominator is zero or operator is unknown
     * @return The calculated input
     */
    public static double calculate(double a, double b, char operator) throws ArithmeticException {
        if (b == 0) {
            // Makes sure we can't divide by 0
            throw new ArithmeticException("Le dénominateur ne peut pas être zéro.");
        }

        switch (operator) {
            case 42:
                return a * b;
            case 43:
                return a + b;
            case 45:
                return a - b;
            case 47:
                return a / b;
            default:
                throw new ArithmeticException("L'opérateur demandé n'existe pas ou n'est pas supporté.");
        }
    }

    /**
     * Executes the code properly
     */
    public static void exec() {
        // Prints the header
        System.out.println("**** Calculator (V1.1, 22/04/2020) ****");

        // Gets the user inputs
        double a = Shared.readDouble("Veuillez entrer le premier nombre: ");
        double b = Shared.readDouble("Veuillez entrer le second nombre: ");
        String operator = Shared.readString("Veuillez entrer un opérateur: ");

        // Get the operator char instead of string
        char operatorChar = operator.charAt(0);

        try {
            // Calculates the result based on the user inputs
            double result = calculate(a, b, operatorChar);

            // Prints the result to the user
            System.out.printf("%.2f %c %.2f = %.2f", a, operatorChar, b, result);
        } catch (ArithmeticException e) {
            // Prints the error and exits the program if an ArithmeticException has been raised
            System.out.println(e.toString());
            System.exit(1);
        }
    }
}
